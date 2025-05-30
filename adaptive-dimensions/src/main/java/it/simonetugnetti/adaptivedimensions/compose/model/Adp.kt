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

package it.simonetugnetti.adaptivedimensions.compose.model

import androidx.compose.ui.unit.Dp
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveDp
import kotlin.reflect.full.memberProperties

/**
 * Data model used to store `adp` values for
 * different devices screen width.
 *
 * For more info, check values in
 * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
 *
 * @constructor Adps values from zero to 800adp
 * @since 1.0.0
 * @see Asp
 * @see AdaptiveDp
 */
@ConsistentCopyVisibility
data class Adp internal constructor(
    val from0To100: From0To100,
    val from101To200: From101To200,
    val from201To300: From201To300,
    val from301To400: From301To400,
    val from401To500: From401To500,
    val from501To600: From501To600,
    val from601To700: From601To700,
    val from701To800: From701To800
) {

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from zero to 100adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From0To100 internal constructor(
        val _0adp: Dp,
        val _1adp: Dp,
        val _2adp: Dp,
        val _3adp: Dp,
        val _4adp: Dp,
        val _5adp: Dp,
        val _6adp: Dp,
        val _7adp: Dp,
        val _8adp: Dp,
        val _9adp: Dp,
        val _10adp: Dp,
        val _11adp: Dp,
        val _12adp: Dp,
        val _13adp: Dp,
        val _14adp: Dp,
        val _15adp: Dp,
        val _16adp: Dp,
        val _17adp: Dp,
        val _18adp: Dp,
        val _19adp: Dp,
        val _20adp: Dp,
        val _21adp: Dp,
        val _22adp: Dp,
        val _23adp: Dp,
        val _24adp: Dp,
        val _25adp: Dp,
        val _26adp: Dp,
        val _27adp: Dp,
        val _28adp: Dp,
        val _29adp: Dp,
        val _30adp: Dp,
        val _31adp: Dp,
        val _32adp: Dp,
        val _33adp: Dp,
        val _34adp: Dp,
        val _35adp: Dp,
        val _36adp: Dp,
        val _37adp: Dp,
        val _38adp: Dp,
        val _39adp: Dp,
        val _40adp: Dp,
        val _41adp: Dp,
        val _42adp: Dp,
        val _43adp: Dp,
        val _44adp: Dp,
        val _45adp: Dp,
        val _46adp: Dp,
        val _47adp: Dp,
        val _48adp: Dp,
        val _49adp: Dp,
        val _50adp: Dp,
        val _51adp: Dp,
        val _52adp: Dp,
        val _53adp: Dp,
        val _54adp: Dp,
        val _55adp: Dp,
        val _56adp: Dp,
        val _57adp: Dp,
        val _58adp: Dp,
        val _59adp: Dp,
        val _60adp: Dp,
        val _61adp: Dp,
        val _62adp: Dp,
        val _63adp: Dp,
        val _64adp: Dp,
        val _65adp: Dp,
        val _66adp: Dp,
        val _67adp: Dp,
        val _68adp: Dp,
        val _69adp: Dp,
        val _70adp: Dp,
        val _71adp: Dp,
        val _72adp: Dp,
        val _73adp: Dp,
        val _74adp: Dp,
        val _75adp: Dp,
        val _76adp: Dp,
        val _77adp: Dp,
        val _78adp: Dp,
        val _79adp: Dp,
        val _80adp: Dp,
        val _81adp: Dp,
        val _82adp: Dp,
        val _83adp: Dp,
        val _84adp: Dp,
        val _85adp: Dp,
        val _86adp: Dp,
        val _87adp: Dp,
        val _88adp: Dp,
        val _89adp: Dp,
        val _90adp: Dp,
        val _91adp: Dp,
        val _92adp: Dp,
        val _93adp: Dp,
        val _94adp: Dp,
        val _95adp: Dp,
        val _96adp: Dp,
        val _97adp: Dp,
        val _98adp: Dp,
        val _99adp: Dp,
        val _100adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From0To100] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 0..100)
                this@From0To100::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From0To100) as Dp)
                }

        }.toList()

    }

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from 101adp to 200adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From101To200 internal constructor(
        val _101adp: Dp,
        val _102adp: Dp,
        val _103adp: Dp,
        val _104adp: Dp,
        val _105adp: Dp,
        val _106adp: Dp,
        val _107adp: Dp,
        val _108adp: Dp,
        val _109adp: Dp,
        val _110adp: Dp,
        val _111adp: Dp,
        val _112adp: Dp,
        val _113adp: Dp,
        val _114adp: Dp,
        val _115adp: Dp,
        val _116adp: Dp,
        val _117adp: Dp,
        val _118adp: Dp,
        val _119adp: Dp,
        val _120adp: Dp,
        val _121adp: Dp,
        val _122adp: Dp,
        val _123adp: Dp,
        val _124adp: Dp,
        val _125adp: Dp,
        val _126adp: Dp,
        val _127adp: Dp,
        val _128adp: Dp,
        val _129adp: Dp,
        val _130adp: Dp,
        val _131adp: Dp,
        val _132adp: Dp,
        val _133adp: Dp,
        val _134adp: Dp,
        val _135adp: Dp,
        val _136adp: Dp,
        val _137adp: Dp,
        val _138adp: Dp,
        val _139adp: Dp,
        val _140adp: Dp,
        val _141adp: Dp,
        val _142adp: Dp,
        val _143adp: Dp,
        val _144adp: Dp,
        val _145adp: Dp,
        val _146adp: Dp,
        val _147adp: Dp,
        val _148adp: Dp,
        val _149adp: Dp,
        val _150adp: Dp,
        val _151adp: Dp,
        val _152adp: Dp,
        val _153adp: Dp,
        val _154adp: Dp,
        val _155adp: Dp,
        val _156adp: Dp,
        val _157adp: Dp,
        val _158adp: Dp,
        val _159adp: Dp,
        val _160adp: Dp,
        val _161adp: Dp,
        val _162adp: Dp,
        val _163adp: Dp,
        val _164adp: Dp,
        val _165adp: Dp,
        val _166adp: Dp,
        val _167adp: Dp,
        val _168adp: Dp,
        val _169adp: Dp,
        val _170adp: Dp,
        val _171adp: Dp,
        val _172adp: Dp,
        val _173adp: Dp,
        val _174adp: Dp,
        val _175adp: Dp,
        val _176adp: Dp,
        val _177adp: Dp,
        val _178adp: Dp,
        val _179adp: Dp,
        val _180adp: Dp,
        val _181adp: Dp,
        val _182adp: Dp,
        val _183adp: Dp,
        val _184adp: Dp,
        val _185adp: Dp,
        val _186adp: Dp,
        val _187adp: Dp,
        val _188adp: Dp,
        val _189adp: Dp,
        val _190adp: Dp,
        val _191adp: Dp,
        val _192adp: Dp,
        val _193adp: Dp,
        val _194adp: Dp,
        val _195adp: Dp,
        val _196adp: Dp,
        val _197adp: Dp,
        val _198adp: Dp,
        val _199adp: Dp,
        val _200adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From101To200] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 101..200)
                this@From101To200::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From101To200) as Dp)
                }

        }.toList()

    }

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from 201adp to 300adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From201To300 internal constructor(
        val _201adp: Dp,
        val _202adp: Dp,
        val _203adp: Dp,
        val _204adp: Dp,
        val _205adp: Dp,
        val _206adp: Dp,
        val _207adp: Dp,
        val _208adp: Dp,
        val _209adp: Dp,
        val _210adp: Dp,
        val _211adp: Dp,
        val _212adp: Dp,
        val _213adp: Dp,
        val _214adp: Dp,
        val _215adp: Dp,
        val _216adp: Dp,
        val _217adp: Dp,
        val _218adp: Dp,
        val _219adp: Dp,
        val _220adp: Dp,
        val _221adp: Dp,
        val _222adp: Dp,
        val _223adp: Dp,
        val _224adp: Dp,
        val _225adp: Dp,
        val _226adp: Dp,
        val _227adp: Dp,
        val _228adp: Dp,
        val _229adp: Dp,
        val _230adp: Dp,
        val _231adp: Dp,
        val _232adp: Dp,
        val _233adp: Dp,
        val _234adp: Dp,
        val _235adp: Dp,
        val _236adp: Dp,
        val _237adp: Dp,
        val _238adp: Dp,
        val _239adp: Dp,
        val _240adp: Dp,
        val _241adp: Dp,
        val _242adp: Dp,
        val _243adp: Dp,
        val _244adp: Dp,
        val _245adp: Dp,
        val _246adp: Dp,
        val _247adp: Dp,
        val _248adp: Dp,
        val _249adp: Dp,
        val _250adp: Dp,
        val _251adp: Dp,
        val _252adp: Dp,
        val _253adp: Dp,
        val _254adp: Dp,
        val _255adp: Dp,
        val _256adp: Dp,
        val _257adp: Dp,
        val _258adp: Dp,
        val _259adp: Dp,
        val _260adp: Dp,
        val _261adp: Dp,
        val _262adp: Dp,
        val _263adp: Dp,
        val _264adp: Dp,
        val _265adp: Dp,
        val _266adp: Dp,
        val _267adp: Dp,
        val _268adp: Dp,
        val _269adp: Dp,
        val _270adp: Dp,
        val _271adp: Dp,
        val _272adp: Dp,
        val _273adp: Dp,
        val _274adp: Dp,
        val _275adp: Dp,
        val _276adp: Dp,
        val _277adp: Dp,
        val _278adp: Dp,
        val _279adp: Dp,
        val _280adp: Dp,
        val _281adp: Dp,
        val _282adp: Dp,
        val _283adp: Dp,
        val _284adp: Dp,
        val _285adp: Dp,
        val _286adp: Dp,
        val _287adp: Dp,
        val _288adp: Dp,
        val _289adp: Dp,
        val _290adp: Dp,
        val _291adp: Dp,
        val _292adp: Dp,
        val _293adp: Dp,
        val _294adp: Dp,
        val _295adp: Dp,
        val _296adp: Dp,
        val _297adp: Dp,
        val _298adp: Dp,
        val _299adp: Dp,
        val _300adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From201To300] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 201..300)
                this@From201To300::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From201To300) as Dp)
                }

        }.toList()

    }

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from 301adp to 400adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From301To400 internal constructor(
        val _301adp: Dp,
        val _302adp: Dp,
        val _303adp: Dp,
        val _304adp: Dp,
        val _305adp: Dp,
        val _306adp: Dp,
        val _307adp: Dp,
        val _308adp: Dp,
        val _309adp: Dp,
        val _310adp: Dp,
        val _311adp: Dp,
        val _312adp: Dp,
        val _313adp: Dp,
        val _314adp: Dp,
        val _315adp: Dp,
        val _316adp: Dp,
        val _317adp: Dp,
        val _318adp: Dp,
        val _319adp: Dp,
        val _320adp: Dp,
        val _321adp: Dp,
        val _322adp: Dp,
        val _323adp: Dp,
        val _324adp: Dp,
        val _325adp: Dp,
        val _326adp: Dp,
        val _327adp: Dp,
        val _328adp: Dp,
        val _329adp: Dp,
        val _330adp: Dp,
        val _331adp: Dp,
        val _332adp: Dp,
        val _333adp: Dp,
        val _334adp: Dp,
        val _335adp: Dp,
        val _336adp: Dp,
        val _337adp: Dp,
        val _338adp: Dp,
        val _339adp: Dp,
        val _340adp: Dp,
        val _341adp: Dp,
        val _342adp: Dp,
        val _343adp: Dp,
        val _344adp: Dp,
        val _345adp: Dp,
        val _346adp: Dp,
        val _347adp: Dp,
        val _348adp: Dp,
        val _349adp: Dp,
        val _350adp: Dp,
        val _351adp: Dp,
        val _352adp: Dp,
        val _353adp: Dp,
        val _354adp: Dp,
        val _355adp: Dp,
        val _356adp: Dp,
        val _357adp: Dp,
        val _358adp: Dp,
        val _359adp: Dp,
        val _360adp: Dp,
        val _361adp: Dp,
        val _362adp: Dp,
        val _363adp: Dp,
        val _364adp: Dp,
        val _365adp: Dp,
        val _366adp: Dp,
        val _367adp: Dp,
        val _368adp: Dp,
        val _369adp: Dp,
        val _370adp: Dp,
        val _371adp: Dp,
        val _372adp: Dp,
        val _373adp: Dp,
        val _374adp: Dp,
        val _375adp: Dp,
        val _376adp: Dp,
        val _377adp: Dp,
        val _378adp: Dp,
        val _379adp: Dp,
        val _380adp: Dp,
        val _381adp: Dp,
        val _382adp: Dp,
        val _383adp: Dp,
        val _384adp: Dp,
        val _385adp: Dp,
        val _386adp: Dp,
        val _387adp: Dp,
        val _388adp: Dp,
        val _389adp: Dp,
        val _390adp: Dp,
        val _391adp: Dp,
        val _392adp: Dp,
        val _393adp: Dp,
        val _394adp: Dp,
        val _395adp: Dp,
        val _396adp: Dp,
        val _397adp: Dp,
        val _398adp: Dp,
        val _399adp: Dp,
        val _400adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From301To400] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 301..400)
                this@From301To400::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From301To400) as Dp)
                }

        }.toList()

    }

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from 401adp to 500adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From401To500 internal constructor(
        val _401adp: Dp,
        val _402adp: Dp,
        val _403adp: Dp,
        val _404adp: Dp,
        val _405adp: Dp,
        val _406adp: Dp,
        val _407adp: Dp,
        val _408adp: Dp,
        val _409adp: Dp,
        val _410adp: Dp,
        val _411adp: Dp,
        val _412adp: Dp,
        val _413adp: Dp,
        val _414adp: Dp,
        val _415adp: Dp,
        val _416adp: Dp,
        val _417adp: Dp,
        val _418adp: Dp,
        val _419adp: Dp,
        val _420adp: Dp,
        val _421adp: Dp,
        val _422adp: Dp,
        val _423adp: Dp,
        val _424adp: Dp,
        val _425adp: Dp,
        val _426adp: Dp,
        val _427adp: Dp,
        val _428adp: Dp,
        val _429adp: Dp,
        val _430adp: Dp,
        val _431adp: Dp,
        val _432adp: Dp,
        val _433adp: Dp,
        val _434adp: Dp,
        val _435adp: Dp,
        val _436adp: Dp,
        val _437adp: Dp,
        val _438adp: Dp,
        val _439adp: Dp,
        val _440adp: Dp,
        val _441adp: Dp,
        val _442adp: Dp,
        val _443adp: Dp,
        val _444adp: Dp,
        val _445adp: Dp,
        val _446adp: Dp,
        val _447adp: Dp,
        val _448adp: Dp,
        val _449adp: Dp,
        val _450adp: Dp,
        val _451adp: Dp,
        val _452adp: Dp,
        val _453adp: Dp,
        val _454adp: Dp,
        val _455adp: Dp,
        val _456adp: Dp,
        val _457adp: Dp,
        val _458adp: Dp,
        val _459adp: Dp,
        val _460adp: Dp,
        val _461adp: Dp,
        val _462adp: Dp,
        val _463adp: Dp,
        val _464adp: Dp,
        val _465adp: Dp,
        val _466adp: Dp,
        val _467adp: Dp,
        val _468adp: Dp,
        val _469adp: Dp,
        val _470adp: Dp,
        val _471adp: Dp,
        val _472adp: Dp,
        val _473adp: Dp,
        val _474adp: Dp,
        val _475adp: Dp,
        val _476adp: Dp,
        val _477adp: Dp,
        val _478adp: Dp,
        val _479adp: Dp,
        val _480adp: Dp,
        val _481adp: Dp,
        val _482adp: Dp,
        val _483adp: Dp,
        val _484adp: Dp,
        val _485adp: Dp,
        val _486adp: Dp,
        val _487adp: Dp,
        val _488adp: Dp,
        val _489adp: Dp,
        val _490adp: Dp,
        val _491adp: Dp,
        val _492adp: Dp,
        val _493adp: Dp,
        val _494adp: Dp,
        val _495adp: Dp,
        val _496adp: Dp,
        val _497adp: Dp,
        val _498adp: Dp,
        val _499adp: Dp,
        val _500adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From401To500] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 401..500)
                this@From401To500::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From401To500) as Dp)
                }

        }.toList()

    }

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from 501adp to 600adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From501To600 internal constructor(
        val _501adp: Dp,
        val _502adp: Dp,
        val _503adp: Dp,
        val _504adp: Dp,
        val _505adp: Dp,
        val _506adp: Dp,
        val _507adp: Dp,
        val _508adp: Dp,
        val _509adp: Dp,
        val _510adp: Dp,
        val _511adp: Dp,
        val _512adp: Dp,
        val _513adp: Dp,
        val _514adp: Dp,
        val _515adp: Dp,
        val _516adp: Dp,
        val _517adp: Dp,
        val _518adp: Dp,
        val _519adp: Dp,
        val _520adp: Dp,
        val _521adp: Dp,
        val _522adp: Dp,
        val _523adp: Dp,
        val _524adp: Dp,
        val _525adp: Dp,
        val _526adp: Dp,
        val _527adp: Dp,
        val _528adp: Dp,
        val _529adp: Dp,
        val _530adp: Dp,
        val _531adp: Dp,
        val _532adp: Dp,
        val _533adp: Dp,
        val _534adp: Dp,
        val _535adp: Dp,
        val _536adp: Dp,
        val _537adp: Dp,
        val _538adp: Dp,
        val _539adp: Dp,
        val _540adp: Dp,
        val _541adp: Dp,
        val _542adp: Dp,
        val _543adp: Dp,
        val _544adp: Dp,
        val _545adp: Dp,
        val _546adp: Dp,
        val _547adp: Dp,
        val _548adp: Dp,
        val _549adp: Dp,
        val _550adp: Dp,
        val _551adp: Dp,
        val _552adp: Dp,
        val _553adp: Dp,
        val _554adp: Dp,
        val _555adp: Dp,
        val _556adp: Dp,
        val _557adp: Dp,
        val _558adp: Dp,
        val _559adp: Dp,
        val _560adp: Dp,
        val _561adp: Dp,
        val _562adp: Dp,
        val _563adp: Dp,
        val _564adp: Dp,
        val _565adp: Dp,
        val _566adp: Dp,
        val _567adp: Dp,
        val _568adp: Dp,
        val _569adp: Dp,
        val _570adp: Dp,
        val _571adp: Dp,
        val _572adp: Dp,
        val _573adp: Dp,
        val _574adp: Dp,
        val _575adp: Dp,
        val _576adp: Dp,
        val _577adp: Dp,
        val _578adp: Dp,
        val _579adp: Dp,
        val _580adp: Dp,
        val _581adp: Dp,
        val _582adp: Dp,
        val _583adp: Dp,
        val _584adp: Dp,
        val _585adp: Dp,
        val _586adp: Dp,
        val _587adp: Dp,
        val _588adp: Dp,
        val _589adp: Dp,
        val _590adp: Dp,
        val _591adp: Dp,
        val _592adp: Dp,
        val _593adp: Dp,
        val _594adp: Dp,
        val _595adp: Dp,
        val _596adp: Dp,
        val _597adp: Dp,
        val _598adp: Dp,
        val _599adp: Dp,
        val _600adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From501To600] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 501..600)
                this@From501To600::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From501To600) as Dp)
                }

        }.toList()

    }

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from 601adp to 700adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From601To700 internal constructor(
        val _601adp: Dp,
        val _602adp: Dp,
        val _603adp: Dp,
        val _604adp: Dp,
        val _605adp: Dp,
        val _606adp: Dp,
        val _607adp: Dp,
        val _608adp: Dp,
        val _609adp: Dp,
        val _610adp: Dp,
        val _611adp: Dp,
        val _612adp: Dp,
        val _613adp: Dp,
        val _614adp: Dp,
        val _615adp: Dp,
        val _616adp: Dp,
        val _617adp: Dp,
        val _618adp: Dp,
        val _619adp: Dp,
        val _620adp: Dp,
        val _621adp: Dp,
        val _622adp: Dp,
        val _623adp: Dp,
        val _624adp: Dp,
        val _625adp: Dp,
        val _626adp: Dp,
        val _627adp: Dp,
        val _628adp: Dp,
        val _629adp: Dp,
        val _630adp: Dp,
        val _631adp: Dp,
        val _632adp: Dp,
        val _633adp: Dp,
        val _634adp: Dp,
        val _635adp: Dp,
        val _636adp: Dp,
        val _637adp: Dp,
        val _638adp: Dp,
        val _639adp: Dp,
        val _640adp: Dp,
        val _641adp: Dp,
        val _642adp: Dp,
        val _643adp: Dp,
        val _644adp: Dp,
        val _645adp: Dp,
        val _646adp: Dp,
        val _647adp: Dp,
        val _648adp: Dp,
        val _649adp: Dp,
        val _650adp: Dp,
        val _651adp: Dp,
        val _652adp: Dp,
        val _653adp: Dp,
        val _654adp: Dp,
        val _655adp: Dp,
        val _656adp: Dp,
        val _657adp: Dp,
        val _658adp: Dp,
        val _659adp: Dp,
        val _660adp: Dp,
        val _661adp: Dp,
        val _662adp: Dp,
        val _663adp: Dp,
        val _664adp: Dp,
        val _665adp: Dp,
        val _666adp: Dp,
        val _667adp: Dp,
        val _668adp: Dp,
        val _669adp: Dp,
        val _670adp: Dp,
        val _671adp: Dp,
        val _672adp: Dp,
        val _673adp: Dp,
        val _674adp: Dp,
        val _675adp: Dp,
        val _676adp: Dp,
        val _677adp: Dp,
        val _678adp: Dp,
        val _679adp: Dp,
        val _680adp: Dp,
        val _681adp: Dp,
        val _682adp: Dp,
        val _683adp: Dp,
        val _684adp: Dp,
        val _685adp: Dp,
        val _686adp: Dp,
        val _687adp: Dp,
        val _688adp: Dp,
        val _689adp: Dp,
        val _690adp: Dp,
        val _691adp: Dp,
        val _692adp: Dp,
        val _693adp: Dp,
        val _694adp: Dp,
        val _695adp: Dp,
        val _696adp: Dp,
        val _697adp: Dp,
        val _698adp: Dp,
        val _699adp: Dp,
        val _700adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From601To700] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 601..700)
                this@From601To700::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From601To700) as Dp)
                }

        }.toList()

    }

    /**
     * Data model used to store `adp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [adp][it.simonetugnetti.adaptivedimensions.compose.data.adp] package
     *
     * @constructor Adps values from 701adp to 800adp
     * @since 1.0.0
     * @see Adp
     */
    @ConsistentCopyVisibility
    data class From701To800 internal constructor(
        val _701adp: Dp,
        val _702adp: Dp,
        val _703adp: Dp,
        val _704adp: Dp,
        val _705adp: Dp,
        val _706adp: Dp,
        val _707adp: Dp,
        val _708adp: Dp,
        val _709adp: Dp,
        val _710adp: Dp,
        val _711adp: Dp,
        val _712adp: Dp,
        val _713adp: Dp,
        val _714adp: Dp,
        val _715adp: Dp,
        val _716adp: Dp,
        val _717adp: Dp,
        val _718adp: Dp,
        val _719adp: Dp,
        val _720adp: Dp,
        val _721adp: Dp,
        val _722adp: Dp,
        val _723adp: Dp,
        val _724adp: Dp,
        val _725adp: Dp,
        val _726adp: Dp,
        val _727adp: Dp,
        val _728adp: Dp,
        val _729adp: Dp,
        val _730adp: Dp,
        val _731adp: Dp,
        val _732adp: Dp,
        val _733adp: Dp,
        val _734adp: Dp,
        val _735adp: Dp,
        val _736adp: Dp,
        val _737adp: Dp,
        val _738adp: Dp,
        val _739adp: Dp,
        val _740adp: Dp,
        val _741adp: Dp,
        val _742adp: Dp,
        val _743adp: Dp,
        val _744adp: Dp,
        val _745adp: Dp,
        val _746adp: Dp,
        val _747adp: Dp,
        val _748adp: Dp,
        val _749adp: Dp,
        val _750adp: Dp,
        val _751adp: Dp,
        val _752adp: Dp,
        val _753adp: Dp,
        val _754adp: Dp,
        val _755adp: Dp,
        val _756adp: Dp,
        val _757adp: Dp,
        val _758adp: Dp,
        val _759adp: Dp,
        val _760adp: Dp,
        val _761adp: Dp,
        val _762adp: Dp,
        val _763adp: Dp,
        val _764adp: Dp,
        val _765adp: Dp,
        val _766adp: Dp,
        val _767adp: Dp,
        val _768adp: Dp,
        val _769adp: Dp,
        val _770adp: Dp,
        val _771adp: Dp,
        val _772adp: Dp,
        val _773adp: Dp,
        val _774adp: Dp,
        val _775adp: Dp,
        val _776adp: Dp,
        val _777adp: Dp,
        val _778adp: Dp,
        val _779adp: Dp,
        val _780adp: Dp,
        val _781adp: Dp,
        val _782adp: Dp,
        val _783adp: Dp,
        val _784adp: Dp,
        val _785adp: Dp,
        val _786adp: Dp,
        val _787adp: Dp,
        val _788adp: Dp,
        val _789adp: Dp,
        val _790adp: Dp,
        val _791adp: Dp,
        val _792adp: Dp,
        val _793adp: Dp,
        val _794adp: Dp,
        val _795adp: Dp,
        val _796adp: Dp,
        val _797adp: Dp,
        val _798adp: Dp,
        val _799adp: Dp,
        val _800adp: Dp
    ) {

        /**
         * Retrieve a `list` of all [Dp] values in [From701To800] data model
         *
         * @since 1.0.0
         * @return List of [Dp] values
         */
        fun getAllAdps() = mutableListOf<Dp>().apply {

            for (i in 701..800)
                this@From701To800::class.memberProperties.find {
                    it.name == "_${i}adp"
                }?.let {
                    add(it.getter.call(this@From701To800) as Dp)
                }

        }.toList()

    }

}
