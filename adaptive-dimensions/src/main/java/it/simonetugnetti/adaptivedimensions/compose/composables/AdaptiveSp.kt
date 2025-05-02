package it.simonetugnetti.adaptivedimensions.compose.composables

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.currentWindowSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveSp
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveSp as AdaptiveSpLegacy
import it.simonetugnetti.adaptivedimensions.compose.utils.adaptiveSp
import it.simonetugnetti.adaptivedimensions.compose.utils.maxWidthAdaptiveSp
import it.simonetugnetti.adaptivedimensions.compose.utils.widthAdaptiveSp

val LocalAsp = compositionLocalOf { AdaptiveSp.DEFAULT.asp }

val LocalStaticAsp = staticCompositionLocalOf { AdaptiveSp.DEFAULT.asp }

@Composable
@UiComposable
fun CompositionLocalProviderWindowWidthSizeAdaptiveSp(
    content: @Composable @UiComposable () -> Unit
) {

    val windowSizeClass = currentWindowAdaptiveInfo().windowSizeClass
    val asp = windowSizeClass.windowWidthSizeClass.adaptiveSp.asp

    CompositionLocalProvider(LocalAsp provides asp) {
        content()
    }

}

@Composable
@UiComposable
fun CompositionLocalProviderContainerSizeAdaptiveSp(
    content: @Composable @UiComposable () -> Unit
) {

    val asp = currentWindowSize().widthAdaptiveSp.asp

    CompositionLocalProvider(LocalAsp provides asp) {
        content()
    }

}

@Composable
@UiComposable
fun BoxWithConstraintsAdaptiveSp(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    content: @Composable @UiComposable () -> Unit
) {

    BoxWithConstraints(
        modifier = modifier,
        contentAlignment = contentAlignment,
        propagateMinConstraints = propagateMinConstraints
    ) {

        CompositionLocalProvider(LocalAsp provides maxWidthAdaptiveSp.asp) {
            content()
        }

    }

}

@Composable
@UiComposable
fun BoxWithConstraintsAdaptiveSp(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    sw300dp: (@Composable @UiComposable () -> Unit)? = null,
    sw330dp: (@Composable @UiComposable () -> Unit)? = null,
    sw360dp: (@Composable @UiComposable () -> Unit)? = null,
    sw390dp: (@Composable @UiComposable () -> Unit)? = null,
    sw420dp: (@Composable @UiComposable () -> Unit)? = null,
    sw450dp: (@Composable @UiComposable () -> Unit)? = null,
    sw480dp: (@Composable @UiComposable () -> Unit)? = null,
    sw510dp: (@Composable @UiComposable () -> Unit)? = null,
    sw540dp: (@Composable @UiComposable () -> Unit)? = null,
    sw570dp: (@Composable @UiComposable () -> Unit)? = null,
    sw600dp: (@Composable @UiComposable () -> Unit)? = null,
    sw630dp: (@Composable @UiComposable () -> Unit)? = null,
    sw660dp: (@Composable @UiComposable () -> Unit)? = null,
    sw690dp: (@Composable @UiComposable () -> Unit)? = null,
    sw720dp: (@Composable @UiComposable () -> Unit)? = null,
    sw750dp: (@Composable @UiComposable () -> Unit)? = null,
    sw780dp: (@Composable @UiComposable () -> Unit)? = null,
    sw810dp: (@Composable @UiComposable () -> Unit)? = null,
    sw840dp: (@Composable @UiComposable () -> Unit)? = null,
    sw870dp: (@Composable @UiComposable () -> Unit)? = null,
    sw900dp: (@Composable @UiComposable () -> Unit)? = null,
    sw930dp: (@Composable @UiComposable () -> Unit)? = null,
    sw960dp: (@Composable @UiComposable () -> Unit)? = null,
    sw990dp: (@Composable @UiComposable () -> Unit)? = null,
    sw1020dp: (@Composable @UiComposable () -> Unit)? = null,
    sw1050dp: (@Composable @UiComposable () -> Unit)? = null,
    sw1080dp: (@Composable @UiComposable () -> Unit)? = null
) {

    BoxWithConstraints(
        modifier = modifier,
        contentAlignment = contentAlignment,
        propagateMinConstraints = propagateMinConstraints
    ) {

        when {
            maxWidth <= 300.dp && sw300dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW300, sw300dp)
            maxWidth <= 330.dp && sw330dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW330, sw330dp)
            maxWidth <= 360.dp && sw360dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW360, sw360dp)
            maxWidth <= 390.dp && sw390dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW390, sw390dp)
            maxWidth <= 420.dp && sw420dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW420, sw420dp)
            maxWidth <= 450.dp && sw450dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW450, sw450dp)
            maxWidth <= 480.dp && sw480dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW480, sw480dp)
            maxWidth <= 510.dp && sw510dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW510, sw510dp)
            maxWidth <= 540.dp && sw540dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW540, sw540dp)
            maxWidth <= 570.dp && sw570dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW570, sw570dp)
            maxWidth <= 600.dp && sw600dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW600, sw600dp)
            maxWidth <= 630.dp && sw630dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW630, sw630dp)
            maxWidth <= 660.dp && sw660dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW660, sw660dp)
            maxWidth <= 690.dp && sw690dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW690, sw690dp)
            maxWidth <= 720.dp && sw720dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW720, sw720dp)
            maxWidth <= 750.dp && sw750dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW750, sw750dp)
            maxWidth <= 780.dp && sw780dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW780, sw780dp)
            maxWidth <= 810.dp && sw810dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW810, sw810dp)
            maxWidth <= 840.dp && sw840dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW840, sw840dp)
            maxWidth <= 870.dp && sw870dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW870, sw870dp)
            maxWidth <= 900.dp && sw900dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW900, sw900dp)
            maxWidth <= 930.dp && sw930dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW930, sw930dp)
            maxWidth <= 960.dp && sw960dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW960, sw960dp)
            maxWidth <= 990.dp && sw990dp != null -> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW990, sw990dp)
            maxWidth <= 1020.dp && sw1020dp != null-> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW1020, sw1020dp)
            maxWidth <= 1050.dp && sw1050dp != null-> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW1050, sw1050dp)
            maxWidth <= 1080.dp && sw1080dp != null-> BoxWithConstraintAdaptiveSpSingleItem(
                AdaptiveSp.SW1080, sw1080dp)
            else -> Unit
        }

    }

}

@Composable
@UiComposable
private fun BoxWithConstraintAdaptiveSpSingleItem(
    adaptiveDp: AdaptiveSp,
    content: @Composable @UiComposable () -> Unit
) {
    CompositionLocalProvider(LocalAsp provides adaptiveDp.asp) {
        content()
    }
}

@Composable
@ReadOnlyComposable
fun dimensionAdaptiveSpResource(asp: AdaptiveSpLegacy): TextUnit =
    runCatching { dimensionResource(asp.dimen).value.sp }
        .getOrDefault(AdaptiveSp.DEFAULT.asp.zero)
