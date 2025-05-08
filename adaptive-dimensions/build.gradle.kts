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

    kotlin {
        jvmToolchain(21)
    }

    buildFeatures {
        compose = true
    }

    publishing {
        singleVariant("release") {}
    }

}

tasks.register<Jar>("dokkaJavadocJar") {
    dependsOn(tasks.dokkaJavadoc)
    from(tasks.dokkaJavadoc.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
}

afterEvaluate {
    publishing.publications.create("release", MavenPublication::class.java) {
        from(components.findByName("release"))
        artifact(tasks["dokkaJavadocJar"])
        groupId = "io.github.simone-tugnetti"
        artifactId = "adaptive-dimensions"
        version = "1.0.0"
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
