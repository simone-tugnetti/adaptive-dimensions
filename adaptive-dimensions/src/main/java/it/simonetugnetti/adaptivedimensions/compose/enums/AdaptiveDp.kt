package it.simonetugnetti.adaptivedimensions.compose.enums

import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_default
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw1020dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw1050dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw1080dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw300dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw330dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw360dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw390dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw420dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw450dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw480dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw510dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw540dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw570dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw600dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw630dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw660dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw690dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw720dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw750dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw780dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw810dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw840dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw870dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw900dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw930dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw960dp
import it.simonetugnetti.adaptivedimensions.compose.data.adp.adp_sw990dp
import it.simonetugnetti.adaptivedimensions.compose.model.Adp

/**
 * Constant Enumeration for Compose of **Adaptive Dps**
 *
 * Structure that contains all of [Adp] references
 * groped by device screen width.
 *
 * ```
 * // Enum.SmallestScreenWidth.Adp.Value
 * AdaptiveDp.SW300.adp._1adp
 * ```
 *
 * These are just constant values, for a responsive dimensions
 * you have to call composable functions in
 * [providers.dynamic][it.simonetugnetti.adaptivedimensions.compose.providers.dynamic] or
 * [providers.statics][it.simonetugnetti.adaptivedimensions.compose.providers.statics] packages
 * or extension variables in [utils][it.simonetugnetti.adaptivedimensions.compose.utils] package.
 *
 * @since 1.0.0
 * @see AdaptiveSp
 */
enum class AdaptiveDp(
    /**
     * Actual [Adp] reference selected for screen width.
     */
    val adp: Adp
) {
    DEFAULT(adp_default),
    SW300(adp_sw300dp),
    SW330(adp_sw330dp),
    SW360(adp_sw360dp),
    SW390(adp_sw390dp),
    SW420(adp_sw420dp),
    SW450(adp_sw450dp),
    SW480(adp_sw480dp),
    SW510(adp_sw510dp),
    SW540(adp_sw540dp),
    SW570(adp_sw570dp),
    SW600(adp_sw600dp),
    SW630(adp_sw630dp),
    SW660(adp_sw660dp),
    SW690(adp_sw690dp),
    SW720(adp_sw720dp),
    SW750(adp_sw750dp),
    SW780(adp_sw780dp),
    SW810(adp_sw810dp),
    SW840(adp_sw840dp),
    SW870(adp_sw870dp),
    SW900(adp_sw900dp),
    SW930(adp_sw930dp),
    SW960(adp_sw960dp),
    SW990(adp_sw990dp),
    SW1020(adp_sw1020dp),
    SW1050(adp_sw1050dp),
    SW1080(adp_sw1080dp);

    companion object {

        /**
         * Retrieve the size of [AdaptiveDp] entries.
         *
         * @since 1.0.0
         * @return Size of the entries.
         */
        fun size() = entries.size

        /**
         * Retrieve a list that contains
         * all [Adp] references in [AdaptiveDp].
         *
         * ```
         * // [adp_default, ... , adp_sw600dp]
         * AdaptiveDp.listOfAdps()
         * ```
         *
         * @since 1.0.0
         * @return List of [Adp] references.
         */
        fun listOfAdps() = entries.map { it.adp }

    }

}
