package it.simonetugnetti.adaptivedimensions.compose.utils

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.currentWindowSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.window.core.layout.WindowWidthSizeClass
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveSp
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveSp as AdaptiveSpLegacy
import it.simonetugnetti.adaptivedimensions.compose.model.Asp
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveDp

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
        else -> AdaptiveSp.DEFAULT
    }

/**
 * Retrieve an [AdaptiveSp] entry based on [IntSize.width].
 *
 * @since 1.0.0
 * @see Asp
 * @see currentWindowSize
 * @see widthAdaptiveDp
 */
val IntSize.widthAdaptiveSp: AdaptiveSp
    get() = when {
        width.dp <= 300.dp -> AdaptiveSp.SW300
        width.dp <= 330.dp -> AdaptiveSp.SW330
        width.dp <= 360.dp -> AdaptiveSp.SW360
        width.dp <= 390.dp -> AdaptiveSp.SW390
        width.dp <= 420.dp -> AdaptiveSp.SW420
        width.dp <= 450.dp -> AdaptiveSp.SW450
        width.dp <= 480.dp -> AdaptiveSp.SW480
        width.dp <= 510.dp -> AdaptiveSp.SW510
        width.dp <= 540.dp -> AdaptiveSp.SW540
        width.dp <= 570.dp -> AdaptiveSp.SW570
        width.dp <= 600.dp -> AdaptiveSp.SW600
        width.dp <= 630.dp -> AdaptiveSp.SW630
        width.dp <= 660.dp -> AdaptiveSp.SW660
        width.dp <= 690.dp -> AdaptiveSp.SW690
        width.dp <= 720.dp -> AdaptiveSp.SW720
        width.dp <= 750.dp -> AdaptiveSp.SW750
        width.dp <= 780.dp -> AdaptiveSp.SW780
        width.dp <= 810.dp -> AdaptiveSp.SW810
        width.dp <= 840.dp -> AdaptiveSp.SW840
        width.dp <= 870.dp -> AdaptiveSp.SW870
        width.dp <= 900.dp -> AdaptiveSp.SW900
        width.dp <= 930.dp -> AdaptiveSp.SW930
        width.dp <= 960.dp -> AdaptiveSp.SW960
        width.dp <= 990.dp -> AdaptiveSp.SW990
        width.dp <= 1020.dp -> AdaptiveSp.SW1020
        width.dp <= 1050.dp -> AdaptiveSp.SW1050
        width.dp <= 1080.dp -> AdaptiveSp.SW1080
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
        .getOrDefault(AdaptiveSp.DEFAULT.asp.zero)
