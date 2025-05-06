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
        else -> AdaptiveDp.DEFAULT
    }

/**
 * Retrieve an [AdaptiveDp] entry based on [IntSize.width].
 *
 * @since 1.0.0
 * @see Adp
 * @see currentWindowSize
 * @see widthAdaptiveSp
 */
val IntSize.widthAdaptiveDp: AdaptiveDp
    get() = when {
        width.dp <= 300.dp -> AdaptiveDp.SW300
        width.dp <= 330.dp -> AdaptiveDp.SW330
        width.dp <= 360.dp -> AdaptiveDp.SW360
        width.dp <= 390.dp -> AdaptiveDp.SW390
        width.dp <= 420.dp -> AdaptiveDp.SW420
        width.dp <= 450.dp -> AdaptiveDp.SW450
        width.dp <= 480.dp -> AdaptiveDp.SW480
        width.dp <= 510.dp -> AdaptiveDp.SW510
        width.dp <= 540.dp -> AdaptiveDp.SW540
        width.dp <= 570.dp -> AdaptiveDp.SW570
        width.dp <= 600.dp -> AdaptiveDp.SW600
        width.dp <= 630.dp -> AdaptiveDp.SW630
        width.dp <= 660.dp -> AdaptiveDp.SW660
        width.dp <= 690.dp -> AdaptiveDp.SW690
        width.dp <= 720.dp -> AdaptiveDp.SW720
        width.dp <= 750.dp -> AdaptiveDp.SW750
        width.dp <= 780.dp -> AdaptiveDp.SW780
        width.dp <= 810.dp -> AdaptiveDp.SW810
        width.dp <= 840.dp -> AdaptiveDp.SW840
        width.dp <= 870.dp -> AdaptiveDp.SW870
        width.dp <= 900.dp -> AdaptiveDp.SW900
        width.dp <= 930.dp -> AdaptiveDp.SW930
        width.dp <= 960.dp -> AdaptiveDp.SW960
        width.dp <= 990.dp -> AdaptiveDp.SW990
        width.dp <= 1020.dp -> AdaptiveDp.SW1020
        width.dp <= 1050.dp -> AdaptiveDp.SW1050
        width.dp <= 1080.dp -> AdaptiveDp.SW1080
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
