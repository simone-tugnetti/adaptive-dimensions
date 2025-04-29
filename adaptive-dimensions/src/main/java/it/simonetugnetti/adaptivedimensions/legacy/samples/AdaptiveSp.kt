package it.simonetugnetti.adaptivedimensions.legacy.samples

import android.content.Context
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveSp
import it.simonetugnetti.adaptivedimensions.legacy.utils.getAdaptiveSpDimension

internal fun Context.adaptiveSpEnumSample() {

    /*
     * 1asp for Screen width 300dp = 1sp
     * 1asp for Screen width 600dp = 2sp
     */

    // With Resource Receiver
    resources.getDimension(R.dimen._1asp)
    resources.getDimension(AdaptiveSp._1asp.dimen)
    resources.getAdaptiveSpDimension(AdaptiveSp._1asp)

    // With Enum Entry Receiver
    AdaptiveSp._1asp.getDimension(resources)
    AdaptiveSp._1asp.getDimensionPixelOffset(resources)

}
