package it.simonetugnetti.adaptivedimensions.legacy.utils

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import android.util.Log
import androidx.annotation.DimenRes
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveSp

/**
 * Retrieve an [AdaptiveSp] `entry` associated by the given
 * dimensional resource ID.
 *
 * ```
 * // 1asp = AdaptiveSp._1asp
 * R.dimen._1asp.asAdaptiveSp()
 *
 * // Unknown = AdaptiveSp._0asp
 * R.dimen.another_res.asAdaptiveSp()
 * ```
 *
 * @since 1.0.0
 * @receiver Dimension Resource ID.
 * @return [AdaptiveSp] associated entry or [AdaptiveSp._0asp] otherwise.
 */
fun @receiver:DimenRes Int.asAdaptiveSp() =
    AdaptiveSp.entries.find { it.dimen == this } ?: AdaptiveSp._0asp

/**
 * Retrieve an `asp` dimensional for the resource ID.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param asp An [AdaptiveSp] entry.
 * @return Resource dimension `float` value based on screen width
 * and converted to pixel.
 * @see getAdaptiveSpExactDimension
 * @see getAdaptiveSpDimensionPixelOffset
 * @see getAdaptiveSpDimensionPixelSize
 */
fun Resources.getAdaptiveSpDimension(asp: AdaptiveSp) =
    try { getDimension(asp.dimen) }
    catch (e: NotFoundException) {
        logAspError("Resource not Found", e)
        0f
    }

/**
 * Retrieve an `asp` exact dimensional for the resource ID.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param asp An [AdaptiveSp] entry.
 * @return A dp `integer` value based on screen width
 * divided by display density.
 * @see getAdaptiveSpDimension
 * @see getAdaptiveSpDimensionPixelOffset
 * @see getAdaptiveSpDimensionPixelSize
 */
fun Resources.getAdaptiveSpExactDimension(asp: AdaptiveSp) =
    try { (getDimension(asp.dimen) / displayMetrics.density).toInt() }
    catch (e: NotFoundException) {
        logAspError("Resource not Found", e)
        0
    }
    catch (e: ArithmeticException) {
        logAspError("Arithmetic Error", e)
        0
    }

/**
 * Retrieve an `asp` dimensional for the resource ID
 * for use as an offset in raw pixels.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param asp An [AdaptiveSp] entry.
 * @return Resource dimension value multiplied by
 * the appropriate metric and truncated to `integer` pixels.
 * @see getAdaptiveSpDimension
 * @see getAdaptiveSpExactDimension
 * @see getAdaptiveSpDimensionPixelSize
 */
fun Resources.getAdaptiveSpDimensionPixelOffset(asp: AdaptiveSp) =
    try { getDimensionPixelOffset(asp.dimen) }
    catch (e: NotFoundException) {
        logAspError("Resource not Found", e)
        0
    }

/**
 * Retrieve an `asp` dimensional for the resource ID
 * for use as a size in raw pixels.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param asp An [AdaptiveSp] entry.
 * @return Resource dimension value multiplied by
 * the appropriate metric and truncated to `integer` pixels.
 * @see getAdaptiveSpDimension
 * @see getAdaptiveSpExactDimension
 * @see getAdaptiveSpDimensionPixelOffset
 */
fun Resources.getAdaptiveSpDimensionPixelSize(asp: AdaptiveSp) =
    try { getDimensionPixelSize(asp.dimen) }
    catch (e: NotFoundException) {
        logAspError("Resource not Found", e)
        0
    }

/**
 * Retrieve a `list` of all `asp` dimensional resources IDs
 * stored in an array resource reference.
 *
 * ```
 * // [R. dimen._1asp, ... , R. dimen._600asp]
 * resources.getListOfAdaptiveSpDimenRes()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of asp dimensional resource IDs.
 */
fun Resources.getListOfAdaptiveSpDimenRes() =
    try {
        val typedArray = obtainTypedArray(R.array.asps)
        val listOfAdaptiveSpResourceId = mutableListOf<@receiver:DimenRes Int>()

        for (i in 0 until typedArray.length())
            listOfAdaptiveSpResourceId.add(typedArray.getResourceId(i, 0))

        listOfAdaptiveSpResourceId.toList().also {
            typedArray.recycle()
        }
    }
    catch (e: NotFoundException) {
        logAspError("Array Resource not Found", e)
        listOf()
    }
    catch (e: RuntimeException) {
        logAspError("Runtime error", e)
        listOf()
    }

/**
 * Retrieve a `list` of all `asp` dimensional for the resource IDs
 * stored in an array resource reference.
 *
 * ```
 * /*
 *   [getAdaptiveSpDimension(AdaptiveSp._1asp),
 *    ... ,
 *    getAdaptiveSpDimension(AdaptiveSp._600asp)]
 * */
 * resources.getListOfAdaptiveSpDimension()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of asp dimensional.
 * @see getListOfAdaptiveSpExactDimension
 * @see getListOfAdaptiveSpDimensionPixelOffset
 * @see getListOfAdaptiveSpDimensionPixelSize
 */
fun Resources.getListOfAdaptiveSpDimension() =
    mutableListOf<Float>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpDimension(it.asAdaptiveSp()))
        }
    }.toList()

/**
 * Retrieve a `list` of all `asp` exact dimensional
 * for the resource IDs stored in an array resource reference.
 *
 * ```
 * /*
 *   [getAdaptiveSpExactDimension(AdaptiveSp._1asp),
 *    ... ,
 *    getAdaptiveSpExactDimension(AdaptiveSp._600asp)]
 * */
 * resources.getListOfAdaptiveSpExactDimension()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of asp exact dimensional.
 * @see getListOfAdaptiveSpDimension
 * @see getListOfAdaptiveSpDimensionPixelOffset
 * @see getListOfAdaptiveSpDimensionPixelSize
 */
fun Resources.getListOfAdaptiveSpExactDimension() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpExactDimension(it.asAdaptiveSp()))
        }
    }.toList()

/**
 * Retrieve a `list` of all `asp` dimensional for the resource IDs,
 * for use as an offset in raw pixels, stored in an array resource reference.
 *
 * ```
 * /*
 *   [getAdaptiveSpDimensionPixelOffset(AdaptiveSp._1asp),
 *    ... ,
 *    getAdaptiveSpDimensionPixelOffset(AdaptiveSp._600asp)]
 * */
 * resources.getListOfAdaptiveSpDimensionPixelOffset()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of asp dimensional.
 * @see getListOfAdaptiveSpDimension
 * @see getListOfAdaptiveSpExactDimension
 * @see getListOfAdaptiveSpDimensionPixelSize
 */
fun Resources.getListOfAdaptiveSpDimensionPixelOffset() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpDimensionPixelOffset(it.asAdaptiveSp()))
        }
    }.toList()

/**
 * Retrieve a `list` of all `asp` dimensional for the resource IDs,
 * for use as a size in raw pixels, stored in an array resource reference
 *
 * ```
 * /*
 *   [getAdaptiveSpDimensionPixelSize(AdaptiveSp._1asp),
 *    ... ,
 *    getAdaptiveSpDimensionPixelSize(AdaptiveSp._600asp)]
 * */
 * resources.getListOfAdaptiveSpDimensionPixelSize()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance
 * @return List of asp dimensional
 * @see getListOfAdaptiveSpDimension
 * @see getListOfAdaptiveSpExactDimension
 * @see getListOfAdaptiveSpDimensionPixelOffset
 */
fun Resources.getListOfAdaptiveSpDimensionPixelSize() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpDimensionPixelSize(it.asAdaptiveSp()))
        }
    }.toList()

/**
 * Default Log Error for [AdaptiveSp] structure.
 *
 * @since 1.0.0
 * @param message The message you would like logged.
 * @param throwable An exception to log.
 */
internal fun logAspError(message: String, throwable: Throwable?) {
    Log.e(AdaptiveSp::class.simpleName, message, throwable)
}
