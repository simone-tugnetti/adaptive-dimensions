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
- **Lightweight**: Less than 5Mb size and depends only on Kotlin, Compose Fundamentals, Material and Size Unit.
- **Modern**: Made in Kotlin-first and interoperates with modern libraries including Compose, Material3 Adaptive and Dokka.

<br>

## Get started

Place this code to your `build.gradle` file and then sync the project:

```kotlin
dependencies {
    implementation("io.github.simone-tugnetti:adaptive-dimensions:1.0.0")

    // If you will be using Compose, be sure to also include the following dependency
    implementation("androidx.compose.material3.adaptive:adaptive:1.1.0")
}
```

<br>

## Usages

Here you can find documentation on how to use this library by `Resources` and `Composables`.

<br>

### Table of contents
- [Resources](#resources)
    - [`@DimenRes`](#dimenres)
    - [`AdaptiveDp`](#adaptivedp)
    - [`AdaptiveSp`](#adaptivesp)
- [Compose](#compose)

<br>

#### Resources

You can use references to Adaptive Dimensional Resources in various ways, either through direct calls to @DimenRes, or by using the dedicated enum classes.<br>
All references are also grouped by dp values, called `adp`, and sp values, called `asp`.<br> 
For more info, check the [resources](adaptive-dimensions/src/main/java/it/simonetugnetti/adaptivedimensions/resources) package for structures or utils
and the [res](adaptive-dimensions/src/main/res) folder for dimensions.


##### [`@DimenRes`](adaptive-dimensions/src/main/res)

You can access the Adaptive Dimensional Resource directly by calling `R.dimen._Nadp` or `R.dimen._Nasp` 
and the corrisponding value changes by the device Smallest Screen Width, simple as that :wink:.<br>
You can also get the full list of `adp` and `asp` values by calling `R.array.adps` or `R.array.asps`.<br>

Call in XML View:

```xml
<TextView
    android:id="@+id/view_title"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/_12adp"
    android:text="Adaptive Dimensions"
    android:textSize="@dimen/_20asp" />
```

Or Programmatically:

```kotlin

// For single value
resources.getDimension(R.dimen._12adp)
resources.getDimensionPixelSize(R.dimen._18asp)
resources.getDimensionPixelOffset(R.dimen._22adp)

// For Lists
resources.obtainTypedArray(R.array.adps)
resources.obtainTypedArray(R.array.asps)

```


##### [`AdaptiveDp`](adaptive-dimensions/src/main/java/it/simonetugnetti/adaptivedimensions/resources/enums/AdaptiveDp.kt)

This `enum` class is used basically for access the `adp` @DimenRes resource by the corrisponding `entry`.
Here's some examples:

```kotlin

// By using Resources instance as Receiver
resources.getAdaptiveDpDimension(R.dimen._100adp.asAdaptiveDp())
resources.getAdaptiveDpDimension(AdaptiveDp._100adp)

// For obtaining a List of AdaptiveDp resources by Resources receiver
resources.getListOfAdaptiveDpDimenRes()

// By using AdaptiveDp enum as Receiver
AdaptiveDp._100adp.getDimension(resources)

// For obtaining a List of AdaptiveDp resources by his receiver
AdaptiveDp.listOfDimenRes()

```

For the full list of functions you can use, please check `AdaptiveDp` [enum](adaptive-dimensions/src/main/java/it/simonetugnetti/adaptivedimensions/resources/enums/AdaptiveDp.kt) 
and [utils](adaptive-dimensions/src/main/java/it/simonetugnetti/adaptivedimensions/resources/utils/AdaptiveDp.kt) files.


##### [`AdaptiveSp`](adaptive-dimensions/src/main/java/it/simonetugnetti/adaptivedimensions/resources/enums/AdaptiveSp.kt)

This `enum` class is used basically for access the `asp` @DimenRes resource by the corrisponding `entry`.
Here's some examples:

```kotlin

// By using Resources instance as Receiver
resources.getAdaptiveSpDimension(R.dimen._100asp.asAdaptiveSp())
resources.getAdaptiveSpDimension(AdaptiveSp._100asp)

// For obtaining a List of AdaptiveSp resources by Resources receiver
resources.getListOfAdaptiveSpDimenRes()

// By using AdaptiveSp enum as Receiver
AdaptiveSp._100adp.getDimension(resources)

// For obtaining a List of AdaptiveSp resources by his receiver
AdaptiveSp.listOfDimenRes()

```

For the full list of functions you can use, please check `AdaptiveSp` [enum](adaptive-dimensions/src/main/java/it/simonetugnetti/adaptivedimensions/resources/enums/AdaptiveSp.kt) 
and [utils](adaptive-dimensions/src/main/java/it/simonetugnetti/adaptivedimensions/resources/utils/AdaptiveSp.kt) files.

<br>

#### Compose



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

