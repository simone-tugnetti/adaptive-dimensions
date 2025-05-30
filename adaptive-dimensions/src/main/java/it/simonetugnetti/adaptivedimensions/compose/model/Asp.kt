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

import androidx.compose.ui.unit.TextUnit
import it.simonetugnetti.adaptivedimensions.compose.enums.AdaptiveSp
import kotlin.reflect.full.memberProperties

/**
 * Data model used to store `asp` values for
 * different devices screen width.
 *
 * For more info, check values in
 * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
 *
 * @constructor Asps values from zero to 600asp
 * @since 1.0.0
 * @see Adp
 * @see AdaptiveSp
 */
@ConsistentCopyVisibility
data class Asp internal constructor(
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
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Asps values from zero to 100asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From0To100 internal constructor(
        val _0asp: TextUnit,
        val _1asp: TextUnit,
        val _2asp: TextUnit,
        val _3asp: TextUnit,
        val _4asp: TextUnit,
        val _5asp: TextUnit,
        val _6asp: TextUnit,
        val _7asp: TextUnit,
        val _8asp: TextUnit,
        val _9asp: TextUnit,
        val _10asp: TextUnit,
        val _11asp: TextUnit,
        val _12asp: TextUnit,
        val _13asp: TextUnit,
        val _14asp: TextUnit,
        val _15asp: TextUnit,
        val _16asp: TextUnit,
        val _17asp: TextUnit,
        val _18asp: TextUnit,
        val _19asp: TextUnit,
        val _20asp: TextUnit,
        val _21asp: TextUnit,
        val _22asp: TextUnit,
        val _23asp: TextUnit,
        val _24asp: TextUnit,
        val _25asp: TextUnit,
        val _26asp: TextUnit,
        val _27asp: TextUnit,
        val _28asp: TextUnit,
        val _29asp: TextUnit,
        val _30asp: TextUnit,
        val _31asp: TextUnit,
        val _32asp: TextUnit,
        val _33asp: TextUnit,
        val _34asp: TextUnit,
        val _35asp: TextUnit,
        val _36asp: TextUnit,
        val _37asp: TextUnit,
        val _38asp: TextUnit,
        val _39asp: TextUnit,
        val _40asp: TextUnit,
        val _41asp: TextUnit,
        val _42asp: TextUnit,
        val _43asp: TextUnit,
        val _44asp: TextUnit,
        val _45asp: TextUnit,
        val _46asp: TextUnit,
        val _47asp: TextUnit,
        val _48asp: TextUnit,
        val _49asp: TextUnit,
        val _50asp: TextUnit,
        val _51asp: TextUnit,
        val _52asp: TextUnit,
        val _53asp: TextUnit,
        val _54asp: TextUnit,
        val _55asp: TextUnit,
        val _56asp: TextUnit,
        val _57asp: TextUnit,
        val _58asp: TextUnit,
        val _59asp: TextUnit,
        val _60asp: TextUnit,
        val _61asp: TextUnit,
        val _62asp: TextUnit,
        val _63asp: TextUnit,
        val _64asp: TextUnit,
        val _65asp: TextUnit,
        val _66asp: TextUnit,
        val _67asp: TextUnit,
        val _68asp: TextUnit,
        val _69asp: TextUnit,
        val _70asp: TextUnit,
        val _71asp: TextUnit,
        val _72asp: TextUnit,
        val _73asp: TextUnit,
        val _74asp: TextUnit,
        val _75asp: TextUnit,
        val _76asp: TextUnit,
        val _77asp: TextUnit,
        val _78asp: TextUnit,
        val _79asp: TextUnit,
        val _80asp: TextUnit,
        val _81asp: TextUnit,
        val _82asp: TextUnit,
        val _83asp: TextUnit,
        val _84asp: TextUnit,
        val _85asp: TextUnit,
        val _86asp: TextUnit,
        val _87asp: TextUnit,
        val _88asp: TextUnit,
        val _89asp: TextUnit,
        val _90asp: TextUnit,
        val _91asp: TextUnit,
        val _92asp: TextUnit,
        val _93asp: TextUnit,
        val _94asp: TextUnit,
        val _95asp: TextUnit,
        val _96asp: TextUnit,
        val _97asp: TextUnit,
        val _98asp: TextUnit,
        val _99asp: TextUnit,
        val _100asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From0To100] data model.
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAsps() = mutableListOf<TextUnit>().apply {

            for (i in 0..100)
                this@From0To100::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From0To100) as TextUnit)
                }

        }.toList()

    }

    /**
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Asps values from 101asp to 200asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From101To200 internal constructor(
        val _101asp: TextUnit,
        val _102asp: TextUnit,
        val _103asp: TextUnit,
        val _104asp: TextUnit,
        val _105asp: TextUnit,
        val _106asp: TextUnit,
        val _107asp: TextUnit,
        val _108asp: TextUnit,
        val _109asp: TextUnit,
        val _110asp: TextUnit,
        val _111asp: TextUnit,
        val _112asp: TextUnit,
        val _113asp: TextUnit,
        val _114asp: TextUnit,
        val _115asp: TextUnit,
        val _116asp: TextUnit,
        val _117asp: TextUnit,
        val _118asp: TextUnit,
        val _119asp: TextUnit,
        val _120asp: TextUnit,
        val _121asp: TextUnit,
        val _122asp: TextUnit,
        val _123asp: TextUnit,
        val _124asp: TextUnit,
        val _125asp: TextUnit,
        val _126asp: TextUnit,
        val _127asp: TextUnit,
        val _128asp: TextUnit,
        val _129asp: TextUnit,
        val _130asp: TextUnit,
        val _131asp: TextUnit,
        val _132asp: TextUnit,
        val _133asp: TextUnit,
        val _134asp: TextUnit,
        val _135asp: TextUnit,
        val _136asp: TextUnit,
        val _137asp: TextUnit,
        val _138asp: TextUnit,
        val _139asp: TextUnit,
        val _140asp: TextUnit,
        val _141asp: TextUnit,
        val _142asp: TextUnit,
        val _143asp: TextUnit,
        val _144asp: TextUnit,
        val _145asp: TextUnit,
        val _146asp: TextUnit,
        val _147asp: TextUnit,
        val _148asp: TextUnit,
        val _149asp: TextUnit,
        val _150asp: TextUnit,
        val _151asp: TextUnit,
        val _152asp: TextUnit,
        val _153asp: TextUnit,
        val _154asp: TextUnit,
        val _155asp: TextUnit,
        val _156asp: TextUnit,
        val _157asp: TextUnit,
        val _158asp: TextUnit,
        val _159asp: TextUnit,
        val _160asp: TextUnit,
        val _161asp: TextUnit,
        val _162asp: TextUnit,
        val _163asp: TextUnit,
        val _164asp: TextUnit,
        val _165asp: TextUnit,
        val _166asp: TextUnit,
        val _167asp: TextUnit,
        val _168asp: TextUnit,
        val _169asp: TextUnit,
        val _170asp: TextUnit,
        val _171asp: TextUnit,
        val _172asp: TextUnit,
        val _173asp: TextUnit,
        val _174asp: TextUnit,
        val _175asp: TextUnit,
        val _176asp: TextUnit,
        val _177asp: TextUnit,
        val _178asp: TextUnit,
        val _179asp: TextUnit,
        val _180asp: TextUnit,
        val _181asp: TextUnit,
        val _182asp: TextUnit,
        val _183asp: TextUnit,
        val _184asp: TextUnit,
        val _185asp: TextUnit,
        val _186asp: TextUnit,
        val _187asp: TextUnit,
        val _188asp: TextUnit,
        val _189asp: TextUnit,
        val _190asp: TextUnit,
        val _191asp: TextUnit,
        val _192asp: TextUnit,
        val _193asp: TextUnit,
        val _194asp: TextUnit,
        val _195asp: TextUnit,
        val _196asp: TextUnit,
        val _197asp: TextUnit,
        val _198asp: TextUnit,
        val _199asp: TextUnit,
        val _200asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From101To200] data model.
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAsps() = mutableListOf<TextUnit>().apply {

            for (i in 101..200)
                this@From101To200::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From101To200) as TextUnit)
                }

        }.toList()

    }

    /**
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Asps values from 201asp to 300asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From201To300 internal constructor(
        val _201asp: TextUnit,
        val _202asp: TextUnit,
        val _203asp: TextUnit,
        val _204asp: TextUnit,
        val _205asp: TextUnit,
        val _206asp: TextUnit,
        val _207asp: TextUnit,
        val _208asp: TextUnit,
        val _209asp: TextUnit,
        val _210asp: TextUnit,
        val _211asp: TextUnit,
        val _212asp: TextUnit,
        val _213asp: TextUnit,
        val _214asp: TextUnit,
        val _215asp: TextUnit,
        val _216asp: TextUnit,
        val _217asp: TextUnit,
        val _218asp: TextUnit,
        val _219asp: TextUnit,
        val _220asp: TextUnit,
        val _221asp: TextUnit,
        val _222asp: TextUnit,
        val _223asp: TextUnit,
        val _224asp: TextUnit,
        val _225asp: TextUnit,
        val _226asp: TextUnit,
        val _227asp: TextUnit,
        val _228asp: TextUnit,
        val _229asp: TextUnit,
        val _230asp: TextUnit,
        val _231asp: TextUnit,
        val _232asp: TextUnit,
        val _233asp: TextUnit,
        val _234asp: TextUnit,
        val _235asp: TextUnit,
        val _236asp: TextUnit,
        val _237asp: TextUnit,
        val _238asp: TextUnit,
        val _239asp: TextUnit,
        val _240asp: TextUnit,
        val _241asp: TextUnit,
        val _242asp: TextUnit,
        val _243asp: TextUnit,
        val _244asp: TextUnit,
        val _245asp: TextUnit,
        val _246asp: TextUnit,
        val _247asp: TextUnit,
        val _248asp: TextUnit,
        val _249asp: TextUnit,
        val _250asp: TextUnit,
        val _251asp: TextUnit,
        val _252asp: TextUnit,
        val _253asp: TextUnit,
        val _254asp: TextUnit,
        val _255asp: TextUnit,
        val _256asp: TextUnit,
        val _257asp: TextUnit,
        val _258asp: TextUnit,
        val _259asp: TextUnit,
        val _260asp: TextUnit,
        val _261asp: TextUnit,
        val _262asp: TextUnit,
        val _263asp: TextUnit,
        val _264asp: TextUnit,
        val _265asp: TextUnit,
        val _266asp: TextUnit,
        val _267asp: TextUnit,
        val _268asp: TextUnit,
        val _269asp: TextUnit,
        val _270asp: TextUnit,
        val _271asp: TextUnit,
        val _272asp: TextUnit,
        val _273asp: TextUnit,
        val _274asp: TextUnit,
        val _275asp: TextUnit,
        val _276asp: TextUnit,
        val _277asp: TextUnit,
        val _278asp: TextUnit,
        val _279asp: TextUnit,
        val _280asp: TextUnit,
        val _281asp: TextUnit,
        val _282asp: TextUnit,
        val _283asp: TextUnit,
        val _284asp: TextUnit,
        val _285asp: TextUnit,
        val _286asp: TextUnit,
        val _287asp: TextUnit,
        val _288asp: TextUnit,
        val _289asp: TextUnit,
        val _290asp: TextUnit,
        val _291asp: TextUnit,
        val _292asp: TextUnit,
        val _293asp: TextUnit,
        val _294asp: TextUnit,
        val _295asp: TextUnit,
        val _296asp: TextUnit,
        val _297asp: TextUnit,
        val _298asp: TextUnit,
        val _299asp: TextUnit,
        val _300asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From201To300] data model.
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAsps() = mutableListOf<TextUnit>().apply {

            for (i in 201..300)
                this@From201To300::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From201To300) as TextUnit)
                }

        }.toList()

    }

    /**
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Asps values from 301asp to 400asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From301To400 internal constructor(
        val _301asp: TextUnit,
        val _302asp: TextUnit,
        val _303asp: TextUnit,
        val _304asp: TextUnit,
        val _305asp: TextUnit,
        val _306asp: TextUnit,
        val _307asp: TextUnit,
        val _308asp: TextUnit,
        val _309asp: TextUnit,
        val _310asp: TextUnit,
        val _311asp: TextUnit,
        val _312asp: TextUnit,
        val _313asp: TextUnit,
        val _314asp: TextUnit,
        val _315asp: TextUnit,
        val _316asp: TextUnit,
        val _317asp: TextUnit,
        val _318asp: TextUnit,
        val _319asp: TextUnit,
        val _320asp: TextUnit,
        val _321asp: TextUnit,
        val _322asp: TextUnit,
        val _323asp: TextUnit,
        val _324asp: TextUnit,
        val _325asp: TextUnit,
        val _326asp: TextUnit,
        val _327asp: TextUnit,
        val _328asp: TextUnit,
        val _329asp: TextUnit,
        val _330asp: TextUnit,
        val _331asp: TextUnit,
        val _332asp: TextUnit,
        val _333asp: TextUnit,
        val _334asp: TextUnit,
        val _335asp: TextUnit,
        val _336asp: TextUnit,
        val _337asp: TextUnit,
        val _338asp: TextUnit,
        val _339asp: TextUnit,
        val _340asp: TextUnit,
        val _341asp: TextUnit,
        val _342asp: TextUnit,
        val _343asp: TextUnit,
        val _344asp: TextUnit,
        val _345asp: TextUnit,
        val _346asp: TextUnit,
        val _347asp: TextUnit,
        val _348asp: TextUnit,
        val _349asp: TextUnit,
        val _350asp: TextUnit,
        val _351asp: TextUnit,
        val _352asp: TextUnit,
        val _353asp: TextUnit,
        val _354asp: TextUnit,
        val _355asp: TextUnit,
        val _356asp: TextUnit,
        val _357asp: TextUnit,
        val _358asp: TextUnit,
        val _359asp: TextUnit,
        val _360asp: TextUnit,
        val _361asp: TextUnit,
        val _362asp: TextUnit,
        val _363asp: TextUnit,
        val _364asp: TextUnit,
        val _365asp: TextUnit,
        val _366asp: TextUnit,
        val _367asp: TextUnit,
        val _368asp: TextUnit,
        val _369asp: TextUnit,
        val _370asp: TextUnit,
        val _371asp: TextUnit,
        val _372asp: TextUnit,
        val _373asp: TextUnit,
        val _374asp: TextUnit,
        val _375asp: TextUnit,
        val _376asp: TextUnit,
        val _377asp: TextUnit,
        val _378asp: TextUnit,
        val _379asp: TextUnit,
        val _380asp: TextUnit,
        val _381asp: TextUnit,
        val _382asp: TextUnit,
        val _383asp: TextUnit,
        val _384asp: TextUnit,
        val _385asp: TextUnit,
        val _386asp: TextUnit,
        val _387asp: TextUnit,
        val _388asp: TextUnit,
        val _389asp: TextUnit,
        val _390asp: TextUnit,
        val _391asp: TextUnit,
        val _392asp: TextUnit,
        val _393asp: TextUnit,
        val _394asp: TextUnit,
        val _395asp: TextUnit,
        val _396asp: TextUnit,
        val _397asp: TextUnit,
        val _398asp: TextUnit,
        val _399asp: TextUnit,
        val _400asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From301To400] data model.
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAsps() = mutableListOf<TextUnit>().apply {

            for (i in 301..400)
                this@From301To400::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From301To400) as TextUnit)
                }

        }.toList()

    }

    /**
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Asps values from 401asp to 500asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From401To500 internal constructor(
        val _401asp: TextUnit,
        val _402asp: TextUnit,
        val _403asp: TextUnit,
        val _404asp: TextUnit,
        val _405asp: TextUnit,
        val _406asp: TextUnit,
        val _407asp: TextUnit,
        val _408asp: TextUnit,
        val _409asp: TextUnit,
        val _410asp: TextUnit,
        val _411asp: TextUnit,
        val _412asp: TextUnit,
        val _413asp: TextUnit,
        val _414asp: TextUnit,
        val _415asp: TextUnit,
        val _416asp: TextUnit,
        val _417asp: TextUnit,
        val _418asp: TextUnit,
        val _419asp: TextUnit,
        val _420asp: TextUnit,
        val _421asp: TextUnit,
        val _422asp: TextUnit,
        val _423asp: TextUnit,
        val _424asp: TextUnit,
        val _425asp: TextUnit,
        val _426asp: TextUnit,
        val _427asp: TextUnit,
        val _428asp: TextUnit,
        val _429asp: TextUnit,
        val _430asp: TextUnit,
        val _431asp: TextUnit,
        val _432asp: TextUnit,
        val _433asp: TextUnit,
        val _434asp: TextUnit,
        val _435asp: TextUnit,
        val _436asp: TextUnit,
        val _437asp: TextUnit,
        val _438asp: TextUnit,
        val _439asp: TextUnit,
        val _440asp: TextUnit,
        val _441asp: TextUnit,
        val _442asp: TextUnit,
        val _443asp: TextUnit,
        val _444asp: TextUnit,
        val _445asp: TextUnit,
        val _446asp: TextUnit,
        val _447asp: TextUnit,
        val _448asp: TextUnit,
        val _449asp: TextUnit,
        val _450asp: TextUnit,
        val _451asp: TextUnit,
        val _452asp: TextUnit,
        val _453asp: TextUnit,
        val _454asp: TextUnit,
        val _455asp: TextUnit,
        val _456asp: TextUnit,
        val _457asp: TextUnit,
        val _458asp: TextUnit,
        val _459asp: TextUnit,
        val _460asp: TextUnit,
        val _461asp: TextUnit,
        val _462asp: TextUnit,
        val _463asp: TextUnit,
        val _464asp: TextUnit,
        val _465asp: TextUnit,
        val _466asp: TextUnit,
        val _467asp: TextUnit,
        val _468asp: TextUnit,
        val _469asp: TextUnit,
        val _470asp: TextUnit,
        val _471asp: TextUnit,
        val _472asp: TextUnit,
        val _473asp: TextUnit,
        val _474asp: TextUnit,
        val _475asp: TextUnit,
        val _476asp: TextUnit,
        val _477asp: TextUnit,
        val _478asp: TextUnit,
        val _479asp: TextUnit,
        val _480asp: TextUnit,
        val _481asp: TextUnit,
        val _482asp: TextUnit,
        val _483asp: TextUnit,
        val _484asp: TextUnit,
        val _485asp: TextUnit,
        val _486asp: TextUnit,
        val _487asp: TextUnit,
        val _488asp: TextUnit,
        val _489asp: TextUnit,
        val _490asp: TextUnit,
        val _491asp: TextUnit,
        val _492asp: TextUnit,
        val _493asp: TextUnit,
        val _494asp: TextUnit,
        val _495asp: TextUnit,
        val _496asp: TextUnit,
        val _497asp: TextUnit,
        val _498asp: TextUnit,
        val _499asp: TextUnit,
        val _500asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From401To500] data model.
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAsps() = mutableListOf<TextUnit>().apply {

            for (i in 401..500)
                this@From401To500::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From401To500) as TextUnit)
                }

        }.toList()

    }

    /**
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Asps values from 501asp to 600asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From501To600 internal constructor(
        val _501asp: TextUnit,
        val _502asp: TextUnit,
        val _503asp: TextUnit,
        val _504asp: TextUnit,
        val _505asp: TextUnit,
        val _506asp: TextUnit,
        val _507asp: TextUnit,
        val _508asp: TextUnit,
        val _509asp: TextUnit,
        val _510asp: TextUnit,
        val _511asp: TextUnit,
        val _512asp: TextUnit,
        val _513asp: TextUnit,
        val _514asp: TextUnit,
        val _515asp: TextUnit,
        val _516asp: TextUnit,
        val _517asp: TextUnit,
        val _518asp: TextUnit,
        val _519asp: TextUnit,
        val _520asp: TextUnit,
        val _521asp: TextUnit,
        val _522asp: TextUnit,
        val _523asp: TextUnit,
        val _524asp: TextUnit,
        val _525asp: TextUnit,
        val _526asp: TextUnit,
        val _527asp: TextUnit,
        val _528asp: TextUnit,
        val _529asp: TextUnit,
        val _530asp: TextUnit,
        val _531asp: TextUnit,
        val _532asp: TextUnit,
        val _533asp: TextUnit,
        val _534asp: TextUnit,
        val _535asp: TextUnit,
        val _536asp: TextUnit,
        val _537asp: TextUnit,
        val _538asp: TextUnit,
        val _539asp: TextUnit,
        val _540asp: TextUnit,
        val _541asp: TextUnit,
        val _542asp: TextUnit,
        val _543asp: TextUnit,
        val _544asp: TextUnit,
        val _545asp: TextUnit,
        val _546asp: TextUnit,
        val _547asp: TextUnit,
        val _548asp: TextUnit,
        val _549asp: TextUnit,
        val _550asp: TextUnit,
        val _551asp: TextUnit,
        val _552asp: TextUnit,
        val _553asp: TextUnit,
        val _554asp: TextUnit,
        val _555asp: TextUnit,
        val _556asp: TextUnit,
        val _557asp: TextUnit,
        val _558asp: TextUnit,
        val _559asp: TextUnit,
        val _560asp: TextUnit,
        val _561asp: TextUnit,
        val _562asp: TextUnit,
        val _563asp: TextUnit,
        val _564asp: TextUnit,
        val _565asp: TextUnit,
        val _566asp: TextUnit,
        val _567asp: TextUnit,
        val _568asp: TextUnit,
        val _569asp: TextUnit,
        val _570asp: TextUnit,
        val _571asp: TextUnit,
        val _572asp: TextUnit,
        val _573asp: TextUnit,
        val _574asp: TextUnit,
        val _575asp: TextUnit,
        val _576asp: TextUnit,
        val _577asp: TextUnit,
        val _578asp: TextUnit,
        val _579asp: TextUnit,
        val _580asp: TextUnit,
        val _581asp: TextUnit,
        val _582asp: TextUnit,
        val _583asp: TextUnit,
        val _584asp: TextUnit,
        val _585asp: TextUnit,
        val _586asp: TextUnit,
        val _587asp: TextUnit,
        val _588asp: TextUnit,
        val _589asp: TextUnit,
        val _590asp: TextUnit,
        val _591asp: TextUnit,
        val _592asp: TextUnit,
        val _593asp: TextUnit,
        val _594asp: TextUnit,
        val _595asp: TextUnit,
        val _596asp: TextUnit,
        val _597asp: TextUnit,
        val _598asp: TextUnit,
        val _599asp: TextUnit,
        val _600asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From501To600] data model.
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAsps() = mutableListOf<TextUnit>().apply {

            for (i in 501..600)
                this@From501To600::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From501To600) as TextUnit)
                }

        }.toList()

    }

    /**
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Adps values from 601asp to 700asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From601To700 internal constructor(
        val _601asp: TextUnit,
        val _602asp: TextUnit,
        val _603asp: TextUnit,
        val _604asp: TextUnit,
        val _605asp: TextUnit,
        val _606asp: TextUnit,
        val _607asp: TextUnit,
        val _608asp: TextUnit,
        val _609asp: TextUnit,
        val _610asp: TextUnit,
        val _611asp: TextUnit,
        val _612asp: TextUnit,
        val _613asp: TextUnit,
        val _614asp: TextUnit,
        val _615asp: TextUnit,
        val _616asp: TextUnit,
        val _617asp: TextUnit,
        val _618asp: TextUnit,
        val _619asp: TextUnit,
        val _620asp: TextUnit,
        val _621asp: TextUnit,
        val _622asp: TextUnit,
        val _623asp: TextUnit,
        val _624asp: TextUnit,
        val _625asp: TextUnit,
        val _626asp: TextUnit,
        val _627asp: TextUnit,
        val _628asp: TextUnit,
        val _629asp: TextUnit,
        val _630asp: TextUnit,
        val _631asp: TextUnit,
        val _632asp: TextUnit,
        val _633asp: TextUnit,
        val _634asp: TextUnit,
        val _635asp: TextUnit,
        val _636asp: TextUnit,
        val _637asp: TextUnit,
        val _638asp: TextUnit,
        val _639asp: TextUnit,
        val _640asp: TextUnit,
        val _641asp: TextUnit,
        val _642asp: TextUnit,
        val _643asp: TextUnit,
        val _644asp: TextUnit,
        val _645asp: TextUnit,
        val _646asp: TextUnit,
        val _647asp: TextUnit,
        val _648asp: TextUnit,
        val _649asp: TextUnit,
        val _650asp: TextUnit,
        val _651asp: TextUnit,
        val _652asp: TextUnit,
        val _653asp: TextUnit,
        val _654asp: TextUnit,
        val _655asp: TextUnit,
        val _656asp: TextUnit,
        val _657asp: TextUnit,
        val _658asp: TextUnit,
        val _659asp: TextUnit,
        val _660asp: TextUnit,
        val _661asp: TextUnit,
        val _662asp: TextUnit,
        val _663asp: TextUnit,
        val _664asp: TextUnit,
        val _665asp: TextUnit,
        val _666asp: TextUnit,
        val _667asp: TextUnit,
        val _668asp: TextUnit,
        val _669asp: TextUnit,
        val _670asp: TextUnit,
        val _671asp: TextUnit,
        val _672asp: TextUnit,
        val _673asp: TextUnit,
        val _674asp: TextUnit,
        val _675asp: TextUnit,
        val _676asp: TextUnit,
        val _677asp: TextUnit,
        val _678asp: TextUnit,
        val _679asp: TextUnit,
        val _680asp: TextUnit,
        val _681asp: TextUnit,
        val _682asp: TextUnit,
        val _683asp: TextUnit,
        val _684asp: TextUnit,
        val _685asp: TextUnit,
        val _686asp: TextUnit,
        val _687asp: TextUnit,
        val _688asp: TextUnit,
        val _689asp: TextUnit,
        val _690asp: TextUnit,
        val _691asp: TextUnit,
        val _692asp: TextUnit,
        val _693asp: TextUnit,
        val _694asp: TextUnit,
        val _695asp: TextUnit,
        val _696asp: TextUnit,
        val _697asp: TextUnit,
        val _698asp: TextUnit,
        val _699asp: TextUnit,
        val _700asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From601To700] data model
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAdps() = mutableListOf<TextUnit>().apply {

            for (i in 601..700)
                this@From601To700::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From601To700) as TextUnit)
                }

        }.toList()

    }

    /**
     * Data model used to store `asp` values for
     * different devices screen width.
     *
     * For more info, check values in
     * [asp][it.simonetugnetti.adaptivedimensions.compose.data.asp] package
     *
     * @constructor Adps values from 701asp to 800asp
     * @since 1.0.0
     * @see Asp
     */
    @ConsistentCopyVisibility
    data class From701To800 internal constructor(
        val _701asp: TextUnit,
        val _702asp: TextUnit,
        val _703asp: TextUnit,
        val _704asp: TextUnit,
        val _705asp: TextUnit,
        val _706asp: TextUnit,
        val _707asp: TextUnit,
        val _708asp: TextUnit,
        val _709asp: TextUnit,
        val _710asp: TextUnit,
        val _711asp: TextUnit,
        val _712asp: TextUnit,
        val _713asp: TextUnit,
        val _714asp: TextUnit,
        val _715asp: TextUnit,
        val _716asp: TextUnit,
        val _717asp: TextUnit,
        val _718asp: TextUnit,
        val _719asp: TextUnit,
        val _720asp: TextUnit,
        val _721asp: TextUnit,
        val _722asp: TextUnit,
        val _723asp: TextUnit,
        val _724asp: TextUnit,
        val _725asp: TextUnit,
        val _726asp: TextUnit,
        val _727asp: TextUnit,
        val _728asp: TextUnit,
        val _729asp: TextUnit,
        val _730asp: TextUnit,
        val _731asp: TextUnit,
        val _732asp: TextUnit,
        val _733asp: TextUnit,
        val _734asp: TextUnit,
        val _735asp: TextUnit,
        val _736asp: TextUnit,
        val _737asp: TextUnit,
        val _738asp: TextUnit,
        val _739asp: TextUnit,
        val _740asp: TextUnit,
        val _741asp: TextUnit,
        val _742asp: TextUnit,
        val _743asp: TextUnit,
        val _744asp: TextUnit,
        val _745asp: TextUnit,
        val _746asp: TextUnit,
        val _747asp: TextUnit,
        val _748asp: TextUnit,
        val _749asp: TextUnit,
        val _750asp: TextUnit,
        val _751asp: TextUnit,
        val _752asp: TextUnit,
        val _753asp: TextUnit,
        val _754asp: TextUnit,
        val _755asp: TextUnit,
        val _756asp: TextUnit,
        val _757asp: TextUnit,
        val _758asp: TextUnit,
        val _759asp: TextUnit,
        val _760asp: TextUnit,
        val _761asp: TextUnit,
        val _762asp: TextUnit,
        val _763asp: TextUnit,
        val _764asp: TextUnit,
        val _765asp: TextUnit,
        val _766asp: TextUnit,
        val _767asp: TextUnit,
        val _768asp: TextUnit,
        val _769asp: TextUnit,
        val _770asp: TextUnit,
        val _771asp: TextUnit,
        val _772asp: TextUnit,
        val _773asp: TextUnit,
        val _774asp: TextUnit,
        val _775asp: TextUnit,
        val _776asp: TextUnit,
        val _777asp: TextUnit,
        val _778asp: TextUnit,
        val _779asp: TextUnit,
        val _780asp: TextUnit,
        val _781asp: TextUnit,
        val _782asp: TextUnit,
        val _783asp: TextUnit,
        val _784asp: TextUnit,
        val _785asp: TextUnit,
        val _786asp: TextUnit,
        val _787asp: TextUnit,
        val _788asp: TextUnit,
        val _789asp: TextUnit,
        val _790asp: TextUnit,
        val _791asp: TextUnit,
        val _792asp: TextUnit,
        val _793asp: TextUnit,
        val _794asp: TextUnit,
        val _795asp: TextUnit,
        val _796asp: TextUnit,
        val _797asp: TextUnit,
        val _798asp: TextUnit,
        val _799asp: TextUnit,
        val _800asp: TextUnit
    ) {

        /**
         * Retrieve a `list` of all [TextUnit] values in [From701To800] data model
         *
         * @since 1.0.0
         * @return List of [TextUnit] values
         */
        fun getAllAdps() = mutableListOf<TextUnit>().apply {

            for (i in 701..800)
                this@From701To800::class.memberProperties.find {
                    it.name == "_${i}asp"
                }?.let {
                    add(it.getter.call(this@From701To800) as TextUnit)
                }

        }.toList()

    }

}
