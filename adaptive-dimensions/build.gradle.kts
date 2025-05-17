import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URI

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.dokka)
    `maven-publish`
}

android {
    namespace = "it.simonetugnetti.adaptivedimensions"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/java")
            resources.srcDirs("src/main/res")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = "21"
    }

    buildFeatures {
        compose = true
    }

    publishing {
        singleVariant("release") { }
    }

}

tasks.withType<DokkaTask>().configureEach {
    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        customAssets = listOf(file("../images/logo-icon.svg"))
        footerMessage = "(c) 2025 Simone Tugnetti"
    }
}

tasks.register<Jar>("withSourcesJar") {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.getSourceFiles())
    from(android.sourceSets.getByName("main").resources.getSourceFiles())
}

tasks.register<Jar>("dokkaJavadocJar") {
    dependsOn(tasks.dokkaHtml)
    from(tasks.dokkaHtml.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
}

afterEvaluate {
    publishing.publications.create("release", MavenPublication::class.java) {

        groupId = "io.github.simone-tugnetti"
        artifactId = "adaptive-dimensions"
        version = "1.0.0"

        from(components.findByName("release"))
        artifact(tasks["dokkaJavadocJar"])
        artifact(tasks["withSourcesJar"])

        pom {
            name = "adaptive-dimensions"
            description = "A simple library to create responsive layouts with the same design for every screen size."
            url = "https://github.com/simone-tugnetti/adaptive-dimensions"
            inceptionYear = "2025"
            licenses {
                license {
                    name = "The Apache License, Version 2.0"
                    url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
                }
            }
            developers {
                developer {
                    id = "simone-tugnetti"
                    name = "Simone Tugnetti"
                    email = "simone.tugnetti@gmail.com"
                }
            }
        }

    }

    // This repository is actually not functional,
    // due to change from Nexus to Central Portal.
    // Need further updates.
    publishing {
        repositories {
            maven {
                name = "mavenCentral"
                url = URI("https://central.sonatype.com/api/v1/publisher/upload")

                credentials {
                    username = System.getenv("MAVEN_CENTRAL_USERNAME")
                    password = System.getenv("MAVEN_CENTRAL_PASSWORD")
                }
            }
        }
    }

}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlin.reflect)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3.adaptive)
}
