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

package it.simonetugnetti.adaptivedimensions.compose.enums

import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_default
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw1020dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw1050dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw1080dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw300dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw330dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw360dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw390dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw420dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw450dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw480dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw510dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw540dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw570dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw600dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw630dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw660dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw690dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw720dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw750dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw780dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw810dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw840dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw870dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw900dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw930dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw960dp
import it.simonetugnetti.adaptivedimensions.compose.data.asp.asp_sw990dp
import it.simonetugnetti.adaptivedimensions.compose.model.Asp

/**
 * Constant Enumeration for Compose of **Adaptive Dps**
 *
 * Structure that contains all of [Asp] references
 * groped by device screen width.
 *
 * ```
 * // Enum.SmallestScreenWidth.Asp.Value
 * AdaptiveSp.SW300.asp._1asp
 * ```
 *
 * These are just constant values, for a responsive dimensions
 * you have to call composable functions in
 * [providers.dynamic][it.simonetugnetti.adaptivedimensions.compose.providers.dynamic] or
 * [providers.statics][it.simonetugnetti.adaptivedimensions.compose.providers.statics] packages
 * or extension variables in [utils][it.simonetugnetti.adaptivedimensions.compose.utils] package.
 *
 * @since 1.0.0
 * @see AdaptiveDp
 */
enum class AdaptiveSp(
    /**
     * Actual [Asp] reference selected for screen width.
     */
    val asp: Asp
) {
    DEFAULT(asp_default),
    SW300(asp_sw300dp),
    SW330(asp_sw330dp),
    SW360(asp_sw360dp),
    SW390(asp_sw390dp),
    SW420(asp_sw420dp),
    SW450(asp_sw450dp),
    SW480(asp_sw480dp),
    SW510(asp_sw510dp),
    SW540(asp_sw540dp),
    SW570(asp_sw570dp),
    SW600(asp_sw600dp),
    SW630(asp_sw630dp),
    SW660(asp_sw660dp),
    SW690(asp_sw690dp),
    SW720(asp_sw720dp),
    SW750(asp_sw750dp),
    SW780(asp_sw780dp),
    SW810(asp_sw810dp),
    SW840(asp_sw840dp),
    SW870(asp_sw870dp),
    SW900(asp_sw900dp),
    SW930(asp_sw930dp),
    SW960(asp_sw960dp),
    SW990(asp_sw990dp),
    SW1020(asp_sw1020dp),
    SW1050(asp_sw1050dp),
    SW1080(asp_sw1080dp);

    companion object {

        /**
         * Retrieve the size of [AdaptiveSp] entries.
         *
         * @since 1.0.0
         * @return Size of the entries.
         */
        fun size() = entries.size

        /**
         * Retrieve a list that contains
         * all [Asp] references in [AdaptiveSp].
         *
         * ```
         * // [asp_default, ... , asp_sw1080dp]
         * AdaptiveSp.listOfAsps()
         * ```
         *
         * @since 1.0.0
         * @return List of [Asp] references.
         */
        fun listOfAsps() = entries.map { it.asp }

    }

}
