# <img src="images/responsive.gif" width="50" /> &nbsp; Adaptive Dimensions

<br>

![Maven Central](https://img.shields.io/badge/Maven_Central-1.0.0-blue)
![License](https://img.shields.io/badge/License-Apache_2.0-green)

This simple library can be used to help [Android](https://www.android.com/) and [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
application developers to create responsive layouts with the same design for every screen size.

<br>

## Feautures

- **Functionality**: Support for both Android Native and KMP development.
- **Compatibility**: Support for various devices, such as Smartphones, Tablets, Desktop and Watches.
- **Lightweight**: Total size of 1Mb and depends only on Kotlin, Compose Fundamentals, Material and Size Unit.
- **Modern**: Made in Kotlin-first and interoperates with modern libraries including Compose, Material3 Adaptive and Dokka.

<br>

## Get started

### Version Catalog

If you're using Version Catalog, add the following to your `libs.versions.toml` file:

```toml
[versions]
#...
adaptive-dimensions = "1.0.0"

[libraries]
#...
adaptive-dimensions = { group = "io.github.simone-tugnetti", name="adaptive-dimensions", version.ref = "adaptive-dimensions" }
```

then

```kotlin
dependencies {
    // ...
    implementation(libs.adaptive.dimensions)
}
```

### Gradle

If you're using Gradle instead, add the following to your `build.gradle` file:

```kotlin
dependencies {
    implementation("io.github.simone-tugnetti:adaptive-dimensions:1.0.0")
}
```

<br>

## Usages

TODO()

<br>

## Examples

TODO()

<br>

## License

     Copyright 2025 Simone Tugnetti

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.

