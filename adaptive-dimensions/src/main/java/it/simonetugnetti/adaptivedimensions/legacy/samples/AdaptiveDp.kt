package it.simonetugnetti.adaptivedimensions.legacy.samples

import android.content.Context
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveDp
import it.simonetugnetti.adaptivedimensions.legacy.utils.getAdaptiveDpDimension

internal fun Context.adaptiveDpEnumSample() {

    /*
     * 1adp for Screen width 300dp = 1dp
     * 1adp for Screen width 600dp = 2dp
     */

    // With Resource Receiver
    resources.getDimension(R.dimen._1adp)
    resources.getDimension(AdaptiveDp._1adp.dimen)
    resources.getAdaptiveDpDimension(AdaptiveDp._1adp)

    // With Enum Entry Receiver
    AdaptiveDp._1adp.getDimension(resources)
    AdaptiveDp._1adp.getDimensionPixelOffset(resources)

}
