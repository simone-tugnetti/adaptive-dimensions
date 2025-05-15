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

package it.simonetugnetti.adaptivedimensions.compose.providers.dynamic

import android.content.res.Configuration
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.MaterialTheme as Material3Theme
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.currentWindowSize
import androidx.compose.material3.adaptive.currentWindowDpSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonSkippableComposable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.model.Adp
import it.simonetugnetti.adaptivedimensions.compose.providers.statics.BoxWithConstraintsStaticAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.providers.statics.CompositionLocalProviderStaticAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.providers.statics.LocalStaticAdp
import it.simonetugnetti.adaptivedimensions.compose.utils.adaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.utils.heightAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.utils.maxHeightAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.utils.maxWidthAdaptiveDp
import it.simonetugnetti.adaptivedimensions.compose.utils.widthAdaptiveDp


/**
 * Retrieve the [CompositionLocal] `key` of [Adp]
 * provided in [CompositionLocalProvider].
 *
 * Value linked with this `key` cause changes at re-composition
 * every time is provided a new value only for
 * the composable where is called, like in the example below.
 *
 * ```
 * CompositionLocalProvider(LocalAdp provides AdaptiveDp.SW300.adp) {
 *      LocalAdp.current._1adp // = 1.dp
 *      Composable(LocalAdp.current._1adp) // Re-compose
 *      Composable() // Static
 *      CompositionLocalProvider(LocalAdp provides AdaptiveDp.SW600.adp) {
 *          LocalAdp.current._1adp // = 2.dp
 *      }
 * }
 * ```
 *
 * @since 1.0.0
 * @see LocalStaticAdp
 * @see AdaptiveDp
 * @see ProvidableCompositionLocal
 * @see compositionLocalOf
 */
val LocalAdp = compositionLocalOf { AdaptiveDp.DEFAULT.adp }


/**
 * Retrieve the current value of [LocalAdp] called directly
 * in [MaterialTheme].
 *
 * ```
 * MaterialTheme.adp._1adp // = LocalAdp.current._1adp
 * ```
 *
 * @since 1.0.0
 * @see LocalAdp
 * @see AdaptiveDp
 */
val MaterialTheme.adp: Adp
    @Composable
    @ReadOnlyComposable
    get() = LocalAdp.current


/**
 * Retrieve the current value of [LocalAdp] called directly
 * in [MaterialTheme][Material3Theme].
 *
 * ```
 * MaterialTheme.adp._1adp // = LocalAdp.current._1adp
 * ```
 *
 * @since 1.0.0
 * @see LocalAdp
 * @see AdaptiveDp
 */
val Material3Theme.adp: Adp
    @Composable
    @ReadOnlyComposable
    get() = LocalAdp.current


/**
 * Update [LocalAdp] key by the given `adaptiveDp`.
 *
 * @since 1.0.0
 * @param adaptiveDp An [AdaptiveDp] entry
 * @param content Composable inside [CompositionLocalProvider]
 * @see CompositionLocalProviderStaticAdaptiveDp
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderAdaptiveDp(
    adaptiveDp: AdaptiveDp,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalAdp provides adaptiveDp.adp) {
        content()
    }
}


/**
 * Update [LocalAdp] key by the given [WindowSizeClass].
 *
 * Unlike using [currentWindowSize] and [currentWindowDpSize], this only provides
 * three [AdaptiveDp] entries. For more info, check [adaptiveDp].
 *
 * @since 1.0.0
 * @param windowSizeClass An actual [WindowSizeClass] instance.
 * @param content Composable inside the [CompositionLocalProvider]
 * @see currentWindowAdaptiveInfo
 * @see WindowSizeClass
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderAdaptiveDpByWindowSizeClass(
    windowSizeClass: WindowSizeClass = currentWindowAdaptiveInfo().windowSizeClass,
    content: @Composable () -> Unit
) {

    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    CompositionLocalProviderAdaptiveDp(
        if (isPortrait) windowSizeClass.windowWidthSizeClass.adaptiveDp
        else windowSizeClass.windowHeightSizeClass.adaptiveDp
    ) {
        content()
    }

}


/**
 * Update [LocalAdp] key by the given [WindowSizeClass].
 *
 * Unlike using [currentWindowSize] and [currentWindowDpSize], this only provides
 * three [AdaptiveDp] entries. For more info, check [adaptiveDp].
 *
 * @since 1.0.0
 * @param windowSizeClass An actual [WindowSizeClass] instance.
 * @param compact Composable for `COMPACT` size.
 * @param medium Composable for `MEDIUM` size.
 * @param expanded Composable for `EXPANDED` size.
 * @see currentWindowAdaptiveInfo
 * @see WindowSizeClass
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderAdaptiveDpByWindowSizeClass(
    windowSizeClass: WindowSizeClass = currentWindowAdaptiveInfo().windowSizeClass,
    compact: @Composable () -> Unit,
    medium: @Composable () -> Unit = { },
    expanded: @Composable () -> Unit = { }
) {

    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    val windowWidthSizeClass = windowSizeClass.windowWidthSizeClass
    val windowHeightSizeClass = windowSizeClass.windowHeightSizeClass

    CompositionLocalProviderAdaptiveDp(
        if (isPortrait) windowWidthSizeClass.adaptiveDp
        else windowHeightSizeClass.adaptiveDp
    ) {
        if (isPortrait)
            when (windowWidthSizeClass) {
                WindowWidthSizeClass.COMPACT -> compact()
                WindowWidthSizeClass.MEDIUM -> medium()
                WindowWidthSizeClass.EXPANDED -> expanded()
            }
        else when (windowHeightSizeClass) {
            WindowHeightSizeClass.COMPACT -> compact()
            WindowHeightSizeClass.MEDIUM -> medium()
            WindowHeightSizeClass.EXPANDED -> expanded()
        }
    }

}


/**
 * Update [LocalAdp] key by the given [IntSize].
 *
 * @since 1.0.0
 * @param windowSize An [IntSize] instance.
 * @param content Composable inside the [CompositionLocalProvider]
 * @see currentWindowSize
 * @see IntSize.widthAdaptiveDp
 * @see IntSize.heightAdaptiveDp
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderAdaptiveDpByWindowSize(
    windowSize: IntSize = currentWindowSize(),
    content: @Composable () -> Unit
) {

    val resources = LocalContext.current.resources
    val configuration = LocalConfiguration.current

    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    CompositionLocalProviderAdaptiveDp(
        if (isPortrait) windowSize.widthAdaptiveDp(resources)
        else windowSize.heightAdaptiveDp(resources)
    ) {
        content()
    }

}


/**
 * Update [LocalAdp] key by the given [IntSize].
 *
 * @since 1.0.0
 * @param windowSize An [IntSize] instance.
 * @see currentWindowSize
 * @see IntSize.widthAdaptiveDp
 * @see IntSize.heightAdaptiveDp
 */
@Composable
@NonSkippableComposable
fun CompositionLocalProviderAdaptiveDpByWindowSize(
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

    val resources = LocalContext.current.resources
    val configuration = LocalConfiguration.current

    val widthByDensity = windowSize.width / resources.displayMetrics.density
    val heightByDensity = windowSize.height / resources.displayMetrics.density
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    CompositionLocalProviderAdaptiveDp(
        if (isPortrait) windowSize.widthAdaptiveDp(resources)
        else windowSize.heightAdaptiveDp(resources)
    ) {
        when {
            (if (isPortrait) widthByDensity else heightByDensity) <= 300 -> sw300dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 330 -> sw330dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 360 -> sw360dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 390 -> sw390dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 420 -> sw420dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 450 -> sw450dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 480 -> sw480dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 510 -> sw510dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 540 -> sw540dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 570 -> sw570dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 600 -> sw600dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 630 -> sw630dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 660 -> sw660dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 690 -> sw690dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 720 -> sw720dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 750 -> sw750dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 780 -> sw780dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 810 -> sw810dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 840 -> sw840dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 870 -> sw870dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 900 -> sw900dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 930 -> sw930dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 960 -> sw960dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 990 -> sw990dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 1020 -> sw1020dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 1050 -> sw1050dp()
            (if (isPortrait) widthByDensity else heightByDensity) <= 1080 -> sw1080dp()
            (if (isPortrait) widthByDensity else heightByDensity) > 1080 -> sw1080dp()
        }
    }

}


/**
 * Update [LocalAdp] key by the given [DpSize].
 *
 * @since 1.0.0
 * @param windowDpSize A [DpSize] instance.
 * @param content Composable inside the [CompositionLocalProvider]
 * @see currentWindowDpSize
 * @see DpSize.widthAdaptiveDp
 * @see DpSize.heightAdaptiveDp
 */
@ExperimentalMaterial3AdaptiveApi
@Composable
@NonSkippableComposable
fun CompositionLocalProviderAdaptiveDpByWindowDpSize(
    windowDpSize: DpSize = currentWindowDpSize(),
    content: @Composable () -> Unit
) {

    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    CompositionLocalProviderAdaptiveDp(
        if (isPortrait) windowDpSize.widthAdaptiveDp
        else windowDpSize.heightAdaptiveDp
    ) {
        content()
    }

}


/**
 * Update [LocalAdp] key by the given [DpSize].
 *
 * @since 1.0.0
 * @param windowDpSize An [DpSize] instance.
 * @see currentWindowDpSize
 * @see DpSize.widthAdaptiveDp
 * @see DpSize.heightAdaptiveDp
 */
@ExperimentalMaterial3AdaptiveApi
@Composable
@NonSkippableComposable
fun CompositionLocalProviderAdaptiveDpByWindowDpSize(
    windowDpSize: DpSize = currentWindowDpSize(),
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

    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    val width = windowDpSize.width
    val height = windowDpSize.height

    CompositionLocalProviderAdaptiveDp(
        if (isPortrait) windowDpSize.widthAdaptiveDp
        else windowDpSize.heightAdaptiveDp
    ) {
        when {
            (if (isPortrait) width else height) <= 300.dp -> sw300dp()
            (if (isPortrait) width else height) <= 330.dp -> sw330dp()
            (if (isPortrait) width else height) <= 360.dp -> sw360dp()
            (if (isPortrait) width else height) <= 390.dp -> sw390dp()
            (if (isPortrait) width else height) <= 420.dp -> sw420dp()
            (if (isPortrait) width else height) <= 450.dp -> sw450dp()
            (if (isPortrait) width else height) <= 480.dp -> sw480dp()
            (if (isPortrait) width else height) <= 510.dp -> sw510dp()
            (if (isPortrait) width else height) <= 540.dp -> sw540dp()
            (if (isPortrait) width else height) <= 570.dp -> sw570dp()
            (if (isPortrait) width else height) <= 600.dp -> sw600dp()
            (if (isPortrait) width else height) <= 630.dp -> sw630dp()
            (if (isPortrait) width else height) <= 660.dp -> sw660dp()
            (if (isPortrait) width else height) <= 690.dp -> sw690dp()
            (if (isPortrait) width else height) <= 720.dp -> sw720dp()
            (if (isPortrait) width else height) <= 750.dp -> sw750dp()
            (if (isPortrait) width else height) <= 780.dp -> sw780dp()
            (if (isPortrait) width else height) <= 810.dp -> sw810dp()
            (if (isPortrait) width else height) <= 840.dp -> sw840dp()
            (if (isPortrait) width else height) <= 870.dp -> sw870dp()
            (if (isPortrait) width else height) <= 900.dp -> sw900dp()
            (if (isPortrait) width else height) <= 930.dp -> sw930dp()
            (if (isPortrait) width else height) <= 960.dp -> sw960dp()
            (if (isPortrait) width else height) <= 990.dp -> sw990dp()
            (if (isPortrait) width else height) <= 1020.dp -> sw1020dp()
            (if (isPortrait) width else height) <= 1050.dp -> sw1050dp()
            (if (isPortrait) width else height) <= 1080.dp -> sw1080dp()
            (if (isPortrait) width else height) > 1080.dp -> sw1080dp()
        }
    }

}


/**
 * Update [LocalAdp] key by the given `adaptiveDp`
 * based on actual screen `width` and `height`, obtained
 * using [BoxWithConstraints] composable.
 *
 * @since 1.0.0
 * @param modifier Modifier to be applied to the layout.
 * @param contentAlignment The default alignment inside the [BoxWithConstraints].
 * @param propagateMinConstraints Whether the incoming min constraints should be passed to content.
 * @param content The content of the [BoxWithConstraints].
 * @see BoxWithConstraintsStaticAdaptiveDp
 * @see BoxWithConstraintsScope
 * @see maxWidthAdaptiveDp
 * @see maxHeightAdaptiveDp
 */
@Composable
@UiComposable
fun BoxWithConstraintsAdaptiveDp(
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

        val configuration = LocalConfiguration.current
        val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

        CompositionLocalProviderAdaptiveDp(
            if (isPortrait) maxWidthAdaptiveDp
            else maxHeightAdaptiveDp
        ) {
            content()
        }

    }

}


/**
 * Update [LocalAdp] key by the given `adaptiveDp`
 * and show a specific `composable` based on actual screen `width` and `height`,
 * obtained using [BoxWithConstraints] composable.
 *
 * @since 1.0.0
 * @param modifier Modifier to be applied to the layout.
 * @param contentAlignment The default alignment inside the [BoxWithConstraints].
 * @param propagateMinConstraints Whether the incoming min constraints should be passed to content.
 * @see BoxWithConstraintsStaticAdaptiveDp
 * @see BoxWithConstraintsScope
 * @see maxWidthAdaptiveDp
 * @see maxHeightAdaptiveDp
 */
@Composable
@UiComposable
fun BoxWithConstraintsAdaptiveDp(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    sw300dp: @Composable @UiComposable (BoxWithConstraintsScope.() -> Unit) = { },
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

        val configuration = LocalConfiguration.current
        val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

        CompositionLocalProviderAdaptiveDp(
            if (isPortrait) maxWidthAdaptiveDp
            else maxHeightAdaptiveDp
        ) {
            when {
                (if (isPortrait) maxWidth else maxHeight) <= 300.dp -> sw300dp()
                (if (isPortrait) maxWidth else maxHeight) <= 330.dp -> sw330dp()
                (if (isPortrait) maxWidth else maxHeight) <= 360.dp -> sw360dp()
                (if (isPortrait) maxWidth else maxHeight) <= 390.dp -> sw390dp()
                (if (isPortrait) maxWidth else maxHeight) <= 420.dp -> sw420dp()
                (if (isPortrait) maxWidth else maxHeight) <= 450.dp -> sw450dp()
                (if (isPortrait) maxWidth else maxHeight) <= 480.dp -> sw480dp()
                (if (isPortrait) maxWidth else maxHeight) <= 510.dp -> sw510dp()
                (if (isPortrait) maxWidth else maxHeight) <= 540.dp -> sw540dp()
                (if (isPortrait) maxWidth else maxHeight) <= 570.dp -> sw570dp()
                (if (isPortrait) maxWidth else maxHeight) <= 600.dp -> sw600dp()
                (if (isPortrait) maxWidth else maxHeight) <= 630.dp -> sw630dp()
                (if (isPortrait) maxWidth else maxHeight) <= 660.dp -> sw660dp()
                (if (isPortrait) maxWidth else maxHeight) <= 690.dp -> sw690dp()
                (if (isPortrait) maxWidth else maxHeight) <= 720.dp -> sw720dp()
                (if (isPortrait) maxWidth else maxHeight) <= 750.dp -> sw750dp()
                (if (isPortrait) maxWidth else maxHeight) <= 780.dp -> sw780dp()
                (if (isPortrait) maxWidth else maxHeight) <= 810.dp -> sw810dp()
                (if (isPortrait) maxWidth else maxHeight) <= 840.dp -> sw840dp()
                (if (isPortrait) maxWidth else maxHeight) <= 870.dp -> sw870dp()
                (if (isPortrait) maxWidth else maxHeight) <= 900.dp -> sw900dp()
                (if (isPortrait) maxWidth else maxHeight) <= 930.dp -> sw930dp()
                (if (isPortrait) maxWidth else maxHeight) <= 960.dp -> sw960dp()
                (if (isPortrait) maxWidth else maxHeight) <= 990.dp -> sw990dp()
                (if (isPortrait) maxWidth else maxHeight) <= 1020.dp -> sw1020dp()
                (if (isPortrait) maxWidth else maxHeight) <= 1050.dp -> sw1050dp()
                (if (isPortrait) maxWidth else maxHeight) <= 1080.dp -> sw1080dp()
                (if (isPortrait) maxWidth else maxHeight) > 1080.dp -> sw1080dp()
            }
        }

    }

}
