/*

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

 */

package it.simonetugnetti.adaptivedimensions.compose.utils

import android.content.res.Resources
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.currentWindowSize
import androidx.compose.material3.adaptive.currentWindowDpSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveSp
import it.simonetugnetti.adaptivedimensions.compose.model.Asp
import it.simonetugnetti.adaptivedimensions.resources.enums.AdaptiveSp as AdaptiveSpLegacy


/**
 * Retrieve an [AdaptiveSp] entry based on [BoxWithConstraintsScope.maxWidth].
 *
 * @since 1.0.0
 * @receiver Scope of [BoxWithConstraints] composable.
 * @see Asp
 * @see maxWidthAdaptiveDp
 */
val BoxWithConstraintsScope.maxWidthAdaptiveSp: AdaptiveSp
    get() = when {
        maxWidth <= 300.dp -> AdaptiveSp.SW300
        maxWidth <= 330.dp -> AdaptiveSp.SW330
        maxWidth <= 360.dp -> AdaptiveSp.SW360
        maxWidth <= 390.dp -> AdaptiveSp.SW390
        maxWidth <= 420.dp -> AdaptiveSp.SW420
        maxWidth <= 450.dp -> AdaptiveSp.SW450
        maxWidth <= 480.dp -> AdaptiveSp.SW480
        maxWidth <= 510.dp -> AdaptiveSp.SW510
        maxWidth <= 540.dp -> AdaptiveSp.SW540
        maxWidth <= 570.dp -> AdaptiveSp.SW570
        maxWidth <= 600.dp -> AdaptiveSp.SW600
        maxWidth <= 630.dp -> AdaptiveSp.SW630
        maxWidth <= 660.dp -> AdaptiveSp.SW660
        maxWidth <= 690.dp -> AdaptiveSp.SW690
        maxWidth <= 720.dp -> AdaptiveSp.SW720
        maxWidth <= 750.dp -> AdaptiveSp.SW750
        maxWidth <= 780.dp -> AdaptiveSp.SW780
        maxWidth <= 810.dp -> AdaptiveSp.SW810
        maxWidth <= 840.dp -> AdaptiveSp.SW840
        maxWidth <= 870.dp -> AdaptiveSp.SW870
        maxWidth <= 900.dp -> AdaptiveSp.SW900
        maxWidth <= 930.dp -> AdaptiveSp.SW930
        maxWidth <= 960.dp -> AdaptiveSp.SW960
        maxWidth <= 990.dp -> AdaptiveSp.SW990
        maxWidth <= 1020.dp -> AdaptiveSp.SW1020
        maxWidth <= 1050.dp -> AdaptiveSp.SW1050
        maxWidth <= 1080.dp -> AdaptiveSp.SW1080
        maxWidth > 1080.dp -> AdaptiveSp.SW1080
        else -> AdaptiveSp.DEFAULT
    }


/**
 * Retrieve an [AdaptiveSp] entry based on [BoxWithConstraintsScope.maxHeight].
 *
 * @since 1.0.0
 * @receiver Scope of [BoxWithConstraints] composable.
 * @see Asp
 * @see maxHeightAdaptiveDp
 */
val BoxWithConstraintsScope.maxHeightAdaptiveSp: AdaptiveSp
    get() = when {
        maxHeight <= 300.dp -> AdaptiveSp.SW300
        maxHeight <= 330.dp -> AdaptiveSp.SW330
        maxHeight <= 360.dp -> AdaptiveSp.SW360
        maxHeight <= 390.dp -> AdaptiveSp.SW390
        maxHeight <= 420.dp -> AdaptiveSp.SW420
        maxHeight <= 450.dp -> AdaptiveSp.SW450
        maxHeight <= 480.dp -> AdaptiveSp.SW480
        maxHeight <= 510.dp -> AdaptiveSp.SW510
        maxHeight <= 540.dp -> AdaptiveSp.SW540
        maxHeight <= 570.dp -> AdaptiveSp.SW570
        maxHeight <= 600.dp -> AdaptiveSp.SW600
        maxHeight <= 630.dp -> AdaptiveSp.SW630
        maxHeight <= 660.dp -> AdaptiveSp.SW660
        maxHeight <= 690.dp -> AdaptiveSp.SW690
        maxHeight <= 720.dp -> AdaptiveSp.SW720
        maxHeight <= 750.dp -> AdaptiveSp.SW750
        maxHeight <= 780.dp -> AdaptiveSp.SW780
        maxHeight <= 810.dp -> AdaptiveSp.SW810
        maxHeight <= 840.dp -> AdaptiveSp.SW840
        maxHeight <= 870.dp -> AdaptiveSp.SW870
        maxHeight <= 900.dp -> AdaptiveSp.SW900
        maxHeight <= 930.dp -> AdaptiveSp.SW930
        maxHeight <= 960.dp -> AdaptiveSp.SW960
        maxHeight <= 990.dp -> AdaptiveSp.SW990
        maxHeight <= 1020.dp -> AdaptiveSp.SW1020
        maxHeight <= 1050.dp -> AdaptiveSp.SW1050
        maxHeight <= 1080.dp -> AdaptiveSp.SW1080
        maxHeight > 1080.dp -> AdaptiveSp.SW1080
        else -> AdaptiveSp.DEFAULT
    }


/**
 * Retrieve an [AdaptiveSp] entry based on [IntSize.width].
 *
 * @since 1.0.0
 * @param resources Instance of Resources used for retrieve display metrics
 * @see Asp
 * @see currentWindowSize
 * @see IntSize.widthAdaptiveDp
 */
fun IntSize.widthAdaptiveSp(resources: Resources): AdaptiveSp {

    val widthByDensity = width / resources.displayMetrics.density

    return when {
        widthByDensity <= 300 -> AdaptiveSp.SW300
        widthByDensity <= 330 -> AdaptiveSp.SW330
        widthByDensity <= 360 -> AdaptiveSp.SW360
        widthByDensity <= 390 -> AdaptiveSp.SW390
        widthByDensity <= 420 -> AdaptiveSp.SW420
        widthByDensity <= 450 -> AdaptiveSp.SW450
        widthByDensity <= 480 -> AdaptiveSp.SW480
        widthByDensity <= 510 -> AdaptiveSp.SW510
        widthByDensity <= 540 -> AdaptiveSp.SW540
        widthByDensity <= 570 -> AdaptiveSp.SW570
        widthByDensity <= 600 -> AdaptiveSp.SW600
        widthByDensity <= 630 -> AdaptiveSp.SW630
        widthByDensity <= 660 -> AdaptiveSp.SW660
        widthByDensity <= 690 -> AdaptiveSp.SW690
        widthByDensity <= 720 -> AdaptiveSp.SW720
        widthByDensity <= 750 -> AdaptiveSp.SW750
        widthByDensity <= 780 -> AdaptiveSp.SW780
        widthByDensity <= 810 -> AdaptiveSp.SW810
        widthByDensity <= 840 -> AdaptiveSp.SW840
        widthByDensity <= 870 -> AdaptiveSp.SW870
        widthByDensity <= 900 -> AdaptiveSp.SW900
        widthByDensity <= 930 -> AdaptiveSp.SW930
        widthByDensity <= 960 -> AdaptiveSp.SW960
        widthByDensity <= 990 -> AdaptiveSp.SW990
        widthByDensity <= 1020 -> AdaptiveSp.SW1020
        widthByDensity <= 1050 -> AdaptiveSp.SW1050
        widthByDensity <= 1080 -> AdaptiveSp.SW1080
        widthByDensity > 1080 -> AdaptiveSp.SW1080
        else -> AdaptiveSp.DEFAULT
    }

}


/**
 * Retrieve an [AdaptiveSp] entry based on [IntSize.height].
 *
 * @since 1.0.0
 * @param resources Instance of Resources used for retrieve display metrics
 * @see Asp
 * @see currentWindowSize
 * @see IntSize.heightAdaptiveDp
 */
fun IntSize.heightAdaptiveSp(resources: Resources): AdaptiveSp {

    val heightByDensity = height / resources.displayMetrics.density

    return when {
        heightByDensity <= 300 -> AdaptiveSp.SW300
        heightByDensity <= 330 -> AdaptiveSp.SW330
        heightByDensity <= 360 -> AdaptiveSp.SW360
        heightByDensity <= 390 -> AdaptiveSp.SW390
        heightByDensity <= 420 -> AdaptiveSp.SW420
        heightByDensity <= 450 -> AdaptiveSp.SW450
        heightByDensity <= 480 -> AdaptiveSp.SW480
        heightByDensity <= 510 -> AdaptiveSp.SW510
        heightByDensity <= 540 -> AdaptiveSp.SW540
        heightByDensity <= 570 -> AdaptiveSp.SW570
        heightByDensity <= 600 -> AdaptiveSp.SW600
        heightByDensity <= 630 -> AdaptiveSp.SW630
        heightByDensity <= 660 -> AdaptiveSp.SW660
        heightByDensity <= 690 -> AdaptiveSp.SW690
        heightByDensity <= 720 -> AdaptiveSp.SW720
        heightByDensity <= 750 -> AdaptiveSp.SW750
        heightByDensity <= 780 -> AdaptiveSp.SW780
        heightByDensity <= 810 -> AdaptiveSp.SW810
        heightByDensity <= 840 -> AdaptiveSp.SW840
        heightByDensity <= 870 -> AdaptiveSp.SW870
        heightByDensity <= 900 -> AdaptiveSp.SW900
        heightByDensity <= 930 -> AdaptiveSp.SW930
        heightByDensity <= 960 -> AdaptiveSp.SW960
        heightByDensity <= 990 -> AdaptiveSp.SW990
        heightByDensity <= 1020 -> AdaptiveSp.SW1020
        heightByDensity <= 1050 -> AdaptiveSp.SW1050
        heightByDensity <= 1080 -> AdaptiveSp.SW1080
        heightByDensity > 1080 -> AdaptiveSp.SW1080
        else -> AdaptiveSp.DEFAULT
    }

}


/**
 * Retrieve an [AdaptiveSp] entry based on [DpSize.width].
 *
 * @since 1.0.0
 * @see Asp
 * @see currentWindowDpSize
 * @see DpSize.widthAdaptiveDp
 */
val DpSize.widthAdaptiveSp: AdaptiveSp
    get() = when {
        width <= 300.dp -> AdaptiveSp.SW300
        width <= 330.dp -> AdaptiveSp.SW330
        width <= 360.dp -> AdaptiveSp.SW360
        width <= 390.dp -> AdaptiveSp.SW390
        width <= 420.dp -> AdaptiveSp.SW420
        width <= 450.dp -> AdaptiveSp.SW450
        width <= 480.dp -> AdaptiveSp.SW480
        width <= 510.dp -> AdaptiveSp.SW510
        width <= 540.dp -> AdaptiveSp.SW540
        width <= 570.dp -> AdaptiveSp.SW570
        width <= 600.dp -> AdaptiveSp.SW600
        width <= 630.dp -> AdaptiveSp.SW630
        width <= 660.dp -> AdaptiveSp.SW660
        width <= 690.dp -> AdaptiveSp.SW690
        width <= 720.dp -> AdaptiveSp.SW720
        width <= 750.dp -> AdaptiveSp.SW750
        width <= 780.dp -> AdaptiveSp.SW780
        width <= 810.dp -> AdaptiveSp.SW810
        width <= 840.dp -> AdaptiveSp.SW840
        width <= 870.dp -> AdaptiveSp.SW870
        width <= 900.dp -> AdaptiveSp.SW900
        width <= 930.dp -> AdaptiveSp.SW930
        width <= 960.dp -> AdaptiveSp.SW960
        width <= 990.dp -> AdaptiveSp.SW990
        width <= 1020.dp -> AdaptiveSp.SW1020
        width <= 1050.dp -> AdaptiveSp.SW1050
        width <= 1080.dp -> AdaptiveSp.SW1080
        width > 1080.dp -> AdaptiveSp.SW1080
        else -> AdaptiveSp.DEFAULT
    }


/**
 * Retrieve an [AdaptiveSp] entry based on [DpSize.height].
 *
 * @since 1.0.0
 * @see Asp
 * @see currentWindowDpSize
 * @see DpSize.heightAdaptiveDp
 */
val DpSize.heightAdaptiveSp: AdaptiveSp
    get() = when {
        height <= 300.dp -> AdaptiveSp.SW300
        height <= 330.dp -> AdaptiveSp.SW330
        height <= 360.dp -> AdaptiveSp.SW360
        height <= 390.dp -> AdaptiveSp.SW390
        height <= 420.dp -> AdaptiveSp.SW420
        height <= 450.dp -> AdaptiveSp.SW450
        height <= 480.dp -> AdaptiveSp.SW480
        height <= 510.dp -> AdaptiveSp.SW510
        height <= 540.dp -> AdaptiveSp.SW540
        height <= 570.dp -> AdaptiveSp.SW570
        height <= 600.dp -> AdaptiveSp.SW600
        height <= 630.dp -> AdaptiveSp.SW630
        height <= 660.dp -> AdaptiveSp.SW660
        height <= 690.dp -> AdaptiveSp.SW690
        height <= 720.dp -> AdaptiveSp.SW720
        height <= 750.dp -> AdaptiveSp.SW750
        height <= 780.dp -> AdaptiveSp.SW780
        height <= 810.dp -> AdaptiveSp.SW810
        height <= 840.dp -> AdaptiveSp.SW840
        height <= 870.dp -> AdaptiveSp.SW870
        height <= 900.dp -> AdaptiveSp.SW900
        height <= 930.dp -> AdaptiveSp.SW930
        height <= 960.dp -> AdaptiveSp.SW960
        height <= 990.dp -> AdaptiveSp.SW990
        height <= 1020.dp -> AdaptiveSp.SW1020
        height <= 1050.dp -> AdaptiveSp.SW1050
        height <= 1080.dp -> AdaptiveSp.SW1080
        height > 1080.dp -> AdaptiveSp.SW1080
        else -> AdaptiveSp.DEFAULT
    }


/**
 * Retrieve an [AdaptiveSp] entry based on [WindowWidthSizeClass] entry.
 *
 * ```
 * WindowWidthSizeClass.COMPACT = AdaptiveSp.DEFAULT
 * WindowWidthSizeClass.MEDIUM = AdaptiveSp.SW600
 * WindowWidthSizeClass.EXPANDED = AdaptiveSp.SW840
 * ```
 *
 * @since 1.0.0
 * @see Asp
 * @see currentWindowAdaptiveInfo
 * @see WindowWidthSizeClass.adaptiveDp
 */
val WindowWidthSizeClass.adaptiveSp: AdaptiveSp
    get() = when (this) {
        WindowWidthSizeClass.COMPACT -> AdaptiveSp.DEFAULT
        WindowWidthSizeClass.MEDIUM -> AdaptiveSp.SW600
        WindowWidthSizeClass.EXPANDED -> AdaptiveSp.SW840
        else -> AdaptiveSp.DEFAULT
    }


/**
 * Retrieve an [AdaptiveSp] entry based on [WindowHeightSizeClass] entry.
 *
 * ```
 * WindowHeightSizeClass.COMPACT = AdaptiveSp.DEFAULT
 * WindowHeightSizeClass.MEDIUM = AdaptiveSp.SW480
 * WindowHeightSizeClass.EXPANDED = AdaptiveSp.SW900
 * ```
 *
 * @since 1.0.0
 * @see Asp
 * @see currentWindowAdaptiveInfo
 * @see WindowHeightSizeClass.adaptiveDp
 */
val WindowHeightSizeClass.adaptiveSp: AdaptiveSp
    get() = when (this) {
        WindowHeightSizeClass.COMPACT -> AdaptiveSp.DEFAULT
        WindowHeightSizeClass.MEDIUM -> AdaptiveSp.SW480
        WindowHeightSizeClass.EXPANDED -> AdaptiveSp.SW900
        else -> AdaptiveSp.DEFAULT
    }


/**
 * Load a dimension resource.
 *
 * @since 1.0.0
 * @param asp An [AdaptiveSp][AdaptiveSpLegacy] `entry`.
 * @return the [TextUnit] dimension associated with the resource
 * @see dimensionResource
 */
@Composable
@ReadOnlyComposable
fun dimensionAdaptiveSpResource(asp: AdaptiveSpLegacy): TextUnit =
    runCatching { dimensionResource(asp.dimen).value.sp }
        .getOrDefault(AdaptiveSp.DEFAULT.asp.from0To100._0asp)
