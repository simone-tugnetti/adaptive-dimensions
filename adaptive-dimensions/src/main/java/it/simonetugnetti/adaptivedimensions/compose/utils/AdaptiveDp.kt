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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowWidthSizeClass
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.model.Adp
import it.simonetugnetti.adaptivedimensions.resources.enums.AdaptiveDp as AdaptiveDpLegacy


/**
 * Retrieve an [AdaptiveDp] entry based on [BoxWithConstraintsScope.maxWidth].
 *
 * @since 1.0.0
 * @receiver Scope of [BoxWithConstraints] composable.
 * @see Adp
 * @see maxWidthAdaptiveSp
 */
val BoxWithConstraintsScope.maxWidthAdaptiveDp: AdaptiveDp
    get() = when {
        maxWidth <= 300.dp -> AdaptiveDp.SW300
        maxWidth <= 330.dp -> AdaptiveDp.SW330
        maxWidth <= 360.dp -> AdaptiveDp.SW360
        maxWidth <= 390.dp -> AdaptiveDp.SW390
        maxWidth <= 420.dp -> AdaptiveDp.SW420
        maxWidth <= 450.dp -> AdaptiveDp.SW450
        maxWidth <= 480.dp -> AdaptiveDp.SW480
        maxWidth <= 510.dp -> AdaptiveDp.SW510
        maxWidth <= 540.dp -> AdaptiveDp.SW540
        maxWidth <= 570.dp -> AdaptiveDp.SW570
        maxWidth <= 600.dp -> AdaptiveDp.SW600
        maxWidth <= 630.dp -> AdaptiveDp.SW630
        maxWidth <= 660.dp -> AdaptiveDp.SW660
        maxWidth <= 690.dp -> AdaptiveDp.SW690
        maxWidth <= 720.dp -> AdaptiveDp.SW720
        maxWidth <= 750.dp -> AdaptiveDp.SW750
        maxWidth <= 780.dp -> AdaptiveDp.SW780
        maxWidth <= 810.dp -> AdaptiveDp.SW810
        maxWidth <= 840.dp -> AdaptiveDp.SW840
        maxWidth <= 870.dp -> AdaptiveDp.SW870
        maxWidth <= 900.dp -> AdaptiveDp.SW900
        maxWidth <= 930.dp -> AdaptiveDp.SW930
        maxWidth <= 960.dp -> AdaptiveDp.SW960
        maxWidth <= 990.dp -> AdaptiveDp.SW990
        maxWidth <= 1020.dp -> AdaptiveDp.SW1020
        maxWidth <= 1050.dp -> AdaptiveDp.SW1050
        maxWidth <= 1080.dp -> AdaptiveDp.SW1080
        maxWidth > 1080.dp -> AdaptiveDp.SW1080
        else -> AdaptiveDp.DEFAULT
    }


/**
 * Retrieve an [AdaptiveDp] entry based on [IntSize.width].
 *
 * @since 1.0.0
 * @param resources Instance of Resources used for retrieve display metrics
 * @see Adp
 * @see currentWindowSize
 * @see IntSize.widthAdaptiveSp
 */
fun IntSize.widthAdaptiveDp(resources: Resources): AdaptiveDp {

    val widthByDensity = width / resources.displayMetrics.density

    return when {
        widthByDensity <= 300 -> AdaptiveDp.SW300
        widthByDensity <= 330 -> AdaptiveDp.SW330
        widthByDensity <= 360 -> AdaptiveDp.SW360
        widthByDensity <= 390 -> AdaptiveDp.SW390
        widthByDensity <= 420 -> AdaptiveDp.SW420
        widthByDensity <= 450 -> AdaptiveDp.SW450
        widthByDensity <= 480 -> AdaptiveDp.SW480
        widthByDensity <= 510 -> AdaptiveDp.SW510
        widthByDensity <= 540 -> AdaptiveDp.SW540
        widthByDensity <= 570 -> AdaptiveDp.SW570
        widthByDensity <= 600 -> AdaptiveDp.SW600
        widthByDensity <= 630 -> AdaptiveDp.SW630
        widthByDensity <= 660 -> AdaptiveDp.SW660
        widthByDensity <= 690 -> AdaptiveDp.SW690
        widthByDensity <= 720 -> AdaptiveDp.SW720
        widthByDensity <= 750 -> AdaptiveDp.SW750
        widthByDensity <= 780 -> AdaptiveDp.SW780
        widthByDensity <= 810 -> AdaptiveDp.SW810
        widthByDensity <= 840 -> AdaptiveDp.SW840
        widthByDensity <= 870 -> AdaptiveDp.SW870
        widthByDensity <= 900 -> AdaptiveDp.SW900
        widthByDensity <= 930 -> AdaptiveDp.SW930
        widthByDensity <= 960 -> AdaptiveDp.SW960
        widthByDensity <= 990 -> AdaptiveDp.SW990
        widthByDensity <= 1020 -> AdaptiveDp.SW1020
        widthByDensity <= 1050 -> AdaptiveDp.SW1050
        widthByDensity <= 1080 -> AdaptiveDp.SW1080
        widthByDensity > 1080 -> AdaptiveDp.SW1080
        else -> AdaptiveDp.DEFAULT
    }

}


/**
 * Retrieve an [AdaptiveDp] entry based on [DpSize.width].
 *
 * @since 1.0.0
 * @see Adp
 * @see currentWindowDpSize
 * @see DpSize.widthAdaptiveSp
 */
val DpSize.widthAdaptiveDp: AdaptiveDp
    get() = when {
        width <= 300.dp -> AdaptiveDp.SW300
        width <= 330.dp -> AdaptiveDp.SW330
        width <= 360.dp -> AdaptiveDp.SW360
        width <= 390.dp -> AdaptiveDp.SW390
        width <= 420.dp -> AdaptiveDp.SW420
        width <= 450.dp -> AdaptiveDp.SW450
        width <= 480.dp -> AdaptiveDp.SW480
        width <= 510.dp -> AdaptiveDp.SW510
        width <= 540.dp -> AdaptiveDp.SW540
        width <= 570.dp -> AdaptiveDp.SW570
        width <= 600.dp -> AdaptiveDp.SW600
        width <= 630.dp -> AdaptiveDp.SW630
        width <= 660.dp -> AdaptiveDp.SW660
        width <= 690.dp -> AdaptiveDp.SW690
        width <= 720.dp -> AdaptiveDp.SW720
        width <= 750.dp -> AdaptiveDp.SW750
        width <= 780.dp -> AdaptiveDp.SW780
        width <= 810.dp -> AdaptiveDp.SW810
        width <= 840.dp -> AdaptiveDp.SW840
        width <= 870.dp -> AdaptiveDp.SW870
        width <= 900.dp -> AdaptiveDp.SW900
        width <= 930.dp -> AdaptiveDp.SW930
        width <= 960.dp -> AdaptiveDp.SW960
        width <= 990.dp -> AdaptiveDp.SW990
        width <= 1020.dp -> AdaptiveDp.SW1020
        width <= 1050.dp -> AdaptiveDp.SW1050
        width <= 1080.dp -> AdaptiveDp.SW1080
        width > 1080.dp -> AdaptiveDp.SW1080
        else -> AdaptiveDp.DEFAULT
    }


/**
 * Retrieve an [AdaptiveDp] entry based on [WindowWidthSizeClass] entry.
 *
 * ```
 * WindowWidthSizeClass.COMPACT = AdaptiveDp.DEFAULT
 * WindowWidthSizeClass.MEDIUM = AdaptiveDp.SW600
 * WindowWidthSizeClass.EXPANDED = AdaptiveDp.SW840
 * ```
 *
 * @since 1.0.0
 * @see Adp
 * @see currentWindowAdaptiveInfo
 * @see adaptiveSp
 */
val WindowWidthSizeClass.adaptiveDp: AdaptiveDp
    get() = when (this) {
        WindowWidthSizeClass.COMPACT -> AdaptiveDp.DEFAULT
        WindowWidthSizeClass.MEDIUM -> AdaptiveDp.SW600
        WindowWidthSizeClass.EXPANDED -> AdaptiveDp.SW840
        else -> AdaptiveDp.DEFAULT
    }


/**
 * Load a dimension resource.
 *
 * @since 1.0.0
 * @param adp An [AdaptiveDp][AdaptiveDpLegacy] `entry`.
 * @return the [Dp] dimension associated with the resource
 * @see dimensionResource
 */
@Composable
@ReadOnlyComposable
fun dimensionAdaptiveDpResource(adp: AdaptiveDpLegacy): Dp =
    runCatching { dimensionResource(adp.dimen) }
        .getOrDefault(AdaptiveDp.DEFAULT.adp.from0To100._0adp)
