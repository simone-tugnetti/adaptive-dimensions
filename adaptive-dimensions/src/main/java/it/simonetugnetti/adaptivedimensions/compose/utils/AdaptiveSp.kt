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
 * @see adaptiveDp
 */
val WindowWidthSizeClass.adaptiveSp: AdaptiveSp
    get() = when (this) {
        WindowWidthSizeClass.COMPACT -> AdaptiveSp.DEFAULT
        WindowWidthSizeClass.MEDIUM -> AdaptiveSp.SW600
        WindowWidthSizeClass.EXPANDED -> AdaptiveSp.SW840
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
