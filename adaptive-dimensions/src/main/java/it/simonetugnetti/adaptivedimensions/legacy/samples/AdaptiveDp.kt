package it.simonetugnetti.adaptivedimensions.legacy.samples

import android.content.res.Resources
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveDp
import it.simonetugnetti.adaptivedimensions.legacy.utils.getAdaptiveDpDimension

internal fun Resources.adaptiveDpEnumSample() {

    // With generic constant
    getDimension(R.dimen._1adp)

    // With Enum Structure of Adaptive Dp
    getDimension(AdaptiveDp._1adp.dimen)

    // With Enum Structure of Adaptive Dp and helper function
    getAdaptiveDpDimension(AdaptiveDp._1adp)

}
