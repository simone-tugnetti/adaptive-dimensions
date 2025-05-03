package it.simonetugnetti.adaptivedimensions.compose.providers.statics

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.MaterialTheme as Material3Theme
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.currentWindowSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonSkippableComposable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.model.Adp
import it.simonetugnetti.adaptivedimensions.compose.providers.dynamic.BoxWithConstraintsAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.providers.dynamic.CompositionLocalProviderAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.providers.dynamic.LocalAdp
import it.simonetugnetti.adaptivedimensions.compose.utils.adaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.utils.maxWidthAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.utils.widthAdaptiveDp

/**
 * Retrieve the [CompositionLocal] `key` of [Adp]
 * provided in [CompositionLocalProvider].
 *
 * Value linked with this `key` cause changes at re-composition
 * every time is provided a new value for all the composable inside the provider,
 * like in the example below.
 *
 * ```
 * CompositionLocalProvider(LocalStaticAdp provides AdaptiveDp.SW300.adp) {
 *      LocalStaticAdp.current._1adp // = 1.dp
 *      Composable(LocalAdp.current._1adp) // Re-compose
 *      Composable() // Re-compose
 *      CompositionLocalProvider(LocalStaticAdp provides AdaptiveDp.SW600.adp) {
 *          LocalStaticAdp.current._1adp // = 2.dp
 *      }
 * }
 * ```
 *
 * @since 1.0.0
 * @see LocalAdp
 * @see AdaptiveDp
 * @see ProvidableCompositionLocal
 * @see staticCompositionLocalOf
 */
val LocalStaticAdp = staticCompositionLocalOf { AdaptiveDp.DEFAULT.adp }

/**
 * Retrieve the current value of [LocalStaticAdp] called directly
 * in [MaterialTheme].
 *
 * ```
 * MaterialTheme.staticAdp._1adp // = LocalStaticAdp.current._1adp
 * ```
 *
 * @since 1.0.0
 * @see LocalStaticAdp
 * @see AdaptiveDp
 */
val MaterialTheme.staticAdp: Adp
    @Composable
    @ReadOnlyComposable
    get() = LocalStaticAdp.current

/**
 * Retrieve the current value of [LocalStaticAdp] called directly
 * in [MaterialTheme][Material3Theme].
 *
 * ```
 * MaterialTheme.staticAdp._1adp // = LocalStaticAdp.current._1adp
 * ```
 *
 * @since 1.0.0
 * @see LocalStaticAdp
 * @see AdaptiveDp
 */
val Material3Theme.staticAdp: Adp
    @Composable
    @ReadOnlyComposable
    get() = LocalStaticAdp.current

/**
 * Update [LocalStaticAdp] key by the given `adaptiveDp`.
 *
 * @since 1.0.0
 * @param adaptiveDp An [AdaptiveDp] entry
 * @param content Composable inside [CompositionLocalProvider]
 * @see CompositionLocalProviderAdaptiveDp
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderStaticAdaptiveDp(
    adaptiveDp: AdaptiveDp,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalStaticAdp provides adaptiveDp.adp) {
        content()
    }
}

/**
 * Update [LocalStaticAdp] key by the given [WindowWidthSizeClass] `entry`.
 *
 * Unlike using [currentWindowSize], this only provides
 * three [AdaptiveDp] entries. For more info, check [adaptiveDp].
 *
 * @since 1.0.0
 * @param windowWidthSizeClass An actual [WindowWidthSizeClass] entry.
 * @param content Composable inside the [CompositionLocalProvider]
 * @see currentWindowAdaptiveInfo
 * @see WindowSizeClass
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderStaticAdaptiveDp(
    windowWidthSizeClass: WindowWidthSizeClass =
        currentWindowAdaptiveInfo()
            .windowSizeClass
            .windowWidthSizeClass,
    content: @Composable () -> Unit
) {

    CompositionLocalProviderStaticAdaptiveDp(windowWidthSizeClass.adaptiveDp) {
        content()
    }

}

/**
 * Update [LocalStaticAdp] key by the given [WindowWidthSizeClass] `entry`.
 *
 * Unlike using [currentWindowSize], this only provides
 * three [AdaptiveDp] entries. For more info, check [adaptiveDp].
 *
 * @since 1.0.0
 * @param windowWidthSizeClass An actual [WindowWidthSizeClass] entry.
 * @param compact Composable for [WindowWidthSizeClass.COMPACT]
 * @param medium Composable for [WindowWidthSizeClass.MEDIUM]
 * @param expanded Composable for [WindowWidthSizeClass.EXPANDED]
 * @see currentWindowAdaptiveInfo
 * @see WindowSizeClass
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderStaticAdaptiveDp(
    windowWidthSizeClass: WindowWidthSizeClass =
        currentWindowAdaptiveInfo()
            .windowSizeClass
            .windowWidthSizeClass,
    compact: @Composable () -> Unit,
    medium: @Composable () -> Unit = { },
    expanded: @Composable () -> Unit = { }
) {

    CompositionLocalProviderStaticAdaptiveDp(windowWidthSizeClass.adaptiveDp) {
        when (windowWidthSizeClass) {
            WindowWidthSizeClass.COMPACT -> compact()
            WindowWidthSizeClass.MEDIUM -> medium()
            WindowWidthSizeClass.EXPANDED -> expanded()
        }
    }

}

/**
 * Update [LocalStaticAdp] key by the given [IntSize]
 * and taken its `width` dimension.
 *
 * @since 1.0.0
 * @param windowSize An [IntSize] instance.
 * @param content Composable inside the [CompositionLocalProvider]
 * @see currentWindowSize
 * @see widthAdaptiveDp
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderStaticAdaptiveDp(
    windowSize: IntSize = currentWindowSize(),
    content: @Composable () -> Unit
) {

    CompositionLocalProviderStaticAdaptiveDp(windowSize.widthAdaptiveDp) {
        content()
    }

}

/**
 * Update [LocalStaticAdp] key by the given [IntSize]
 * and taken its `width` dimension.
 *
 * @since 1.0.0
 * @param windowSize An [IntSize] instance.
 * @see currentWindowSize
 * @see widthAdaptiveDp
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderStaticAdaptiveDp(
    windowSize: IntSize = currentWindowSize(),
    sw300dp: @Composable () -> Unit,
    sw330dp: @Composable () -> Unit = { },
    sw360dp: @Composable () -> Unit = { },
    sw390dp: @Composable () -> Unit = { },
    sw420dp: @Composable () -> Unit = { },
    sw450dp: @Composable () -> Unit = { },
    sw480dp: @Composable () -> Unit = { },
    sw510dp: @Composable () -> Unit = { },
    sw540dp: @Composable () -> Unit = { },
    sw570dp: @Composable () -> Unit = { },
    sw600dp: @Composable () -> Unit = { },
    sw630dp: @Composable () -> Unit = { },
    sw660dp: @Composable () -> Unit = { },
    sw690dp: @Composable () -> Unit = { },
    sw720dp: @Composable () -> Unit = { },
    sw750dp: @Composable () -> Unit = { },
    sw780dp: @Composable () -> Unit = { },
    sw810dp: @Composable () -> Unit = { },
    sw840dp: @Composable () -> Unit = { },
    sw870dp: @Composable () -> Unit = { },
    sw900dp: @Composable () -> Unit = { },
    sw930dp: @Composable () -> Unit = { },
    sw960dp: @Composable () -> Unit = { },
    sw990dp: @Composable () -> Unit = { },
    sw1020dp: @Composable () -> Unit = { },
    sw1050dp: @Composable () -> Unit = { },
    sw1080dp: @Composable () -> Unit = { }
) {

    val width = windowSize.width.dp

    CompositionLocalProviderStaticAdaptiveDp(windowSize.widthAdaptiveDp) {
        when {
            width <= 300.dp -> sw300dp()
            width <= 330.dp -> sw330dp()
            width <= 360.dp -> sw360dp()
            width <= 390.dp -> sw390dp()
            width <= 420.dp -> sw420dp()
            width <= 450.dp -> sw450dp()
            width <= 480.dp -> sw480dp()
            width <= 510.dp -> sw510dp()
            width <= 540.dp -> sw540dp()
            width <= 570.dp -> sw570dp()
            width <= 600.dp -> sw600dp()
            width <= 630.dp -> sw630dp()
            width <= 660.dp -> sw660dp()
            width <= 690.dp -> sw690dp()
            width <= 720.dp -> sw720dp()
            width <= 750.dp -> sw750dp()
            width <= 780.dp -> sw780dp()
            width <= 810.dp -> sw810dp()
            width <= 840.dp -> sw840dp()
            width <= 870.dp -> sw870dp()
            width <= 900.dp -> sw900dp()
            width <= 930.dp -> sw930dp()
            width <= 960.dp -> sw960dp()
            width <= 990.dp -> sw990dp()
            width <= 1020.dp -> sw1020dp()
            width <= 1050.dp -> sw1050dp()
            width <= 1080.dp -> sw1080dp()
            else -> Unit
        }
    }

}

/**
 * Update [LocalStaticAdp] key by the given `adaptiveDp`
 * based on actual screen `width`, obtained
 * using [BoxWithConstraints] composable.
 *
 * @since 1.0.0
 * @param modifier Modifier to be applied to the layout.
 * @param contentAlignment The default alignment inside the [BoxWithConstraints].
 * @param propagateMinConstraints Whether the incoming min constraints should be passed to content.
 * @param content The content of the [BoxWithConstraints].
 * @see BoxWithConstraintsAdaptiveDp
 * @see BoxWithConstraintsScope
 * @see maxWidthAdaptiveDp
 */
@Composable
@UiComposable
fun BoxWithConstraintsStaticAdaptiveDp(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    content: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit)
) {

    BoxWithConstraints(
        modifier = modifier,
        contentAlignment = contentAlignment,
        propagateMinConstraints = propagateMinConstraints
    ) {

        CompositionLocalProviderStaticAdaptiveDp(maxWidthAdaptiveDp) {
            content()
        }

    }

}

/**
 * Update [LocalStaticAdp] key by the given `adaptiveDp` and show a specific `composable`
 * based on actual screen `width`, obtained using [BoxWithConstraints] composable.
 *
 * @since 1.0.0
 * @param modifier Modifier to be applied to the layout.
 * @param contentAlignment The default alignment inside the [BoxWithConstraints].
 * @param propagateMinConstraints Whether the incoming min constraints should be passed to content.
 * @see BoxWithConstraintsScope
 * @see maxWidthAdaptiveDp
 */
@Composable
@UiComposable
fun BoxWithConstraintsStaticAdaptiveDp(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    sw300dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit),
    sw330dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw360dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw390dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw420dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw450dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw480dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw510dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw540dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw570dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw600dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw630dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw660dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw690dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw720dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw750dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw780dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw810dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw840dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw870dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw900dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw930dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw960dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw990dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw1020dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw1050dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
    sw1080dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { }
) {

    BoxWithConstraints(
        modifier = modifier,
        contentAlignment = contentAlignment,
        propagateMinConstraints = propagateMinConstraints
    ) {

        CompositionLocalProviderStaticAdaptiveDp(maxWidthAdaptiveDp) {
            when {
                maxWidth <= 300.dp -> sw300dp()
                maxWidth <= 330.dp -> sw330dp()
                maxWidth <= 360.dp -> sw360dp()
                maxWidth <= 390.dp -> sw390dp()
                maxWidth <= 420.dp -> sw420dp()
                maxWidth <= 450.dp -> sw450dp()
                maxWidth <= 480.dp -> sw480dp()
                maxWidth <= 510.dp -> sw510dp()
                maxWidth <= 540.dp -> sw540dp()
                maxWidth <= 570.dp -> sw570dp()
                maxWidth <= 600.dp -> sw600dp()
                maxWidth <= 630.dp -> sw630dp()
                maxWidth <= 660.dp -> sw660dp()
                maxWidth <= 690.dp -> sw690dp()
                maxWidth <= 720.dp -> sw720dp()
                maxWidth <= 750.dp -> sw750dp()
                maxWidth <= 780.dp -> sw780dp()
                maxWidth <= 810.dp -> sw810dp()
                maxWidth <= 840.dp -> sw840dp()
                maxWidth <= 870.dp -> sw870dp()
                maxWidth <= 900.dp -> sw900dp()
                maxWidth <= 930.dp -> sw930dp()
                maxWidth <= 960.dp -> sw960dp()
                maxWidth <= 990.dp -> sw990dp()
                maxWidth <= 1020.dp -> sw1020dp()
                maxWidth <= 1050.dp -> sw1050dp()
                maxWidth <= 1080.dp -> sw1080dp()
                else -> Unit
            }
        }

    }

}
