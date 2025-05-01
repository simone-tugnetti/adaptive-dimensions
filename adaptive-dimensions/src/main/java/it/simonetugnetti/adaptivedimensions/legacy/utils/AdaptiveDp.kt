package it.simonetugnetti.adaptivedimensions.legacy.utils

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import android.util.Log
import androidx.annotation.DimenRes
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveDp

/**
 * Retrieve an [AdaptiveDp] `entry` associated by the given
 * dimension resource ID.
 *
 * ```
 * // 1adp = AdaptiveDp._1adp
 * R.dimen._1adp.asAdaptiveDp()
 *
 * // Unknown = AdaptiveDp._0adp
 * R.dimen.another_res.asAdaptiveDp()
 * ```
 *
 * @since 1.0.0
 * @receiver Dimension Resource ID.
 * @return [AdaptiveDp] associated entry or [AdaptiveDp._0adp] otherwise.
 */
fun @receiver:DimenRes Int.asAdaptiveDp() =
    AdaptiveDp.entries.find { it.dimen == this } ?: AdaptiveDp._0adp

/**
 * Retrieve an `adp` dimensional for the resource ID.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param adp An [AdaptiveDp] entry.
 * @return Resource dimension `float` value based on screen width
 * and converted to pixel.
 * @see getAdaptiveDpExactDimension
 * @see getAdaptiveDpDimensionPixelOffset
 * @see getAdaptiveDpDimensionPixelSize
 */
fun Resources.getAdaptiveDpDimension(adp: AdaptiveDp) =
    try { getDimension(adp.dimen) }
    catch (e: NotFoundException) {
        logAdpError("Resource not Found", e)
        0f
    }

/**
 * Retrieve an `adp` exact dimensional for the resource ID.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param adp An [AdaptiveDp] entry.
 * @return A dp `integer` value based on screen width
 * divided by display density.
 * @see getAdaptiveDpDimension
 * @see getAdaptiveDpDimensionPixelOffset
 * @see getAdaptiveDpDimensionPixelSize
 */
fun Resources.getAdaptiveDpExactDimension(adp: AdaptiveDp) =
    try { (getDimension(adp.dimen) / displayMetrics.density).toInt() }
    catch (e: NotFoundException) {
        logAdpError("Resource not Found", e)
        0
    }
    catch (e: ArithmeticException) {
        logAdpError("Arithmetic Error", e)
        0
    }

/**
 * Retrieve an `adp` dimensional for the resource ID
 * for use as an offset in raw pixels.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param adp An [AdaptiveDp] entry.
 * @return Resource dimension value multiplied by
 * the appropriate metric and truncated to `integer` pixels.
 * @see getAdaptiveDpDimension
 * @see getAdaptiveDpExactDimension
 * @see getAdaptiveDpDimensionPixelSize
 */
fun Resources.getAdaptiveDpDimensionPixelOffset(adp: AdaptiveDp) =
    try { getDimensionPixelOffset(adp.dimen) }
    catch (e: NotFoundException) {
        logAdpError("Resource not Found", e)
        0
    }

/**
 * Retrieve an `adp` dimensional for the resource ID
 * for use as a size in raw pixels.
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @param adp An [AdaptiveDp] entry.
 * @return Resource dimension value multiplied by
 * the appropriate metric and truncated to `integer` pixels.
 * @see getAdaptiveDpDimension
 * @see getAdaptiveDpExactDimension
 * @see getAdaptiveDpDimensionPixelOffset
 */
fun Resources.getAdaptiveDpDimensionPixelSize(adp: AdaptiveDp) =
    try { getDimensionPixelSize(adp.dimen) }
    catch (e: NotFoundException) {
        logAdpError("Resource not Found", e)
        0
    }

/**
 * Retrieve a `list` of all `adp` dimensional resources IDs
 * stored in an array resource reference.
 *
 * ```
 * // [R. dimen._1adp, ... , R. dimen._600adp]
 * resources.getListOfAdaptiveDpDimenRes()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of adp dimensional resource IDs.
 */
fun Resources.getListOfAdaptiveDpDimenRes() =
    try {
        val typedArray = obtainTypedArray(R.array.adps)
        val listOfAdaptiveDpResourceId = mutableListOf<@receiver:DimenRes Int>()

        for (i in 0 until typedArray.length())
            listOfAdaptiveDpResourceId.add(typedArray.getResourceId(i, 0))

        listOfAdaptiveDpResourceId.toList().also {
            typedArray.recycle()
        }
    }
    catch (e: NotFoundException) {
        logAdpError("Array Resource not Found", e)
        listOf()
    }
    catch (e: RuntimeException) {
        logAdpError("Runtime error", e)
        listOf()
    }

/**
 * Retrieve a `list` of all `adp` dimensional for the resource IDs
 * stored in an array resource reference.
 *
 * ```
 * /*
 *   [getAdaptiveDpDimension(AdaptiveDp._1adp),
 *    ... ,
 *    getAdaptiveDpDimension(AdaptiveDp._600adp)]
 * */
 * resources.getListOfAdaptiveDpDimension()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of adp dimensional.
 * @see getListOfAdaptiveDpExactDimension
 * @see getListOfAdaptiveDpDimensionPixelOffset
 * @see getListOfAdaptiveDpDimensionPixelSize
 */
fun Resources.getListOfAdaptiveDpDimension() =
    mutableListOf<Float>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpDimension(it.asAdaptiveDp()))
        }
    }.toList()

/**
 * Retrieve a `list` of all `adp` exact dimensional
 * for the resource IDs stored in an array resource reference.
 *
 * ```
 * /*
 *   [getAdaptiveDpExactDimension(AdaptiveDp._1adp),
 *    ... ,
 *    getAdaptiveDpExactDimension(AdaptiveDp._600adp)]
 * */
 * resources.getListOfAdaptiveDpExactDimension()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of adp dimensional.
 * @see getListOfAdaptiveDpDimension
 * @see getListOfAdaptiveDpDimensionPixelOffset
 * @see getListOfAdaptiveDpDimensionPixelSize
 */
fun Resources.getListOfAdaptiveDpExactDimension() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpExactDimension(it.asAdaptiveDp()))
        }
    }.toList()

/**
 * Retrieve a `list` of all `adp` dimensional for the resource IDs,
 * for use as an offset in raw pixels, stored in an array resource reference.
 *
 * ```
 * /*
 *   [getAdaptiveDpDimensionPixelOffset(AdaptiveDp._1adp),
 *    ... ,
 *    getAdaptiveDpDimensionPixelOffset(AdaptiveDp._600adp)]
 * */
 * resources.getListOfAdaptiveDpDimensionPixelOffset()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of adp dimensional.
 * @see getListOfAdaptiveDpDimension
 * @see getListOfAdaptiveDpExactDimension
 * @see getListOfAdaptiveDpDimensionPixelSize
 */
fun Resources.getListOfAdaptiveDpDimensionPixelOffset() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpDimensionPixelOffset(it.asAdaptiveDp()))
        }
    }.toList()

/**
 * Retrieve a `list` of all `adp` dimensional for the resource IDs,
 * for use as a size in raw pixels, stored in an array resource reference.
 *
 * ```
 * /*
 *   [getAdaptiveDpDimensionPixelSize(AdaptiveDp._1adp),
 *    ... ,
 *    getAdaptiveDpDimensionPixelSize(AdaptiveDp._600adp)]
 * */
 * resources.getListOfAdaptiveDpDimensionPixelSize()
 * ```
 *
 * @since 1.0.0
 * @receiver Application [Resources] Instance.
 * @return List of adp dimensional.
 * @see getListOfAdaptiveDpDimension
 * @see getListOfAdaptiveDpExactDimension
 * @see getListOfAdaptiveDpDimensionPixelOffset
 */
fun Resources.getListOfAdaptiveDpDimensionPixelSize() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpDimensionPixelSize(it.asAdaptiveDp()))
        }
    }.toList()

/**
 * Default Log Error for [AdaptiveDp] structure.
 *
 * @since 1.0.0
 * @param message The message you would like logged.
 * @param throwable An exception to log.
 */
internal fun logAdpError(message: String, throwable: Throwable?) {
    Log.e(AdaptiveDp::class.simpleName, message, throwable)
}
