package it.simonetugnetti.adaptivedimensions.legacy.samples

import android.content.res.Resources
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveSp
import it.simonetugnetti.adaptivedimensions.legacy.utils.getAdaptiveSpDimension

internal fun Resources.adaptiveSpEnumSample() {

    // With generic constant
    getDimension(R.dimen._1asp)

    // With Enum Structure of Adaptive Sp
    getDimension(AdaptiveSp._1asp.dimen)

    // With Enum Structure of Adaptive Sp and helper function
    getAdaptiveSpDimension(AdaptiveSp._1asp)

}
