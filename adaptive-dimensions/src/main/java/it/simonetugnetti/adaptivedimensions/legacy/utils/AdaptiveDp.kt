package it.simonetugnetti.adaptivedimensions.legacy.utils

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import androidx.annotation.DrawableRes
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveDp

typealias AdaptiveDpDimenRes = @receiver:DrawableRes Int

val adaptiveDpEnumEntries = AdaptiveDp.entries

val listOfAdaptiveDpEnumDimenRes = mutableListOf<AdaptiveDpDimenRes>().apply {
    adaptiveDpEnumEntries.forEach {
        add(it.dimen)
    }
}.toList()

fun AdaptiveDpDimenRes.asAdaptiveDp() =
    adaptiveDpEnumEntries.find { it.dimen == this } ?: AdaptiveDp._0adp

fun Resources.getAdaptiveDpDimension(adp: AdaptiveDp) =
    try { getDimension(adp.dimen) }
    catch (_: NotFoundException) { 0f }

fun Resources.getAdaptiveDpExactDimension(adp: AdaptiveDp) =
    try { (getDimension(adp.dimen) / displayMetrics.density).toInt() }
    catch (_: NotFoundException) { 0 }

fun Resources.getAdaptiveDpDimensionPixelOffset(adp: AdaptiveDp) =
    try { getDimensionPixelOffset(adp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getAdaptiveDpDimensionPixelSize(adp: AdaptiveDp) =
    try { getDimensionPixelSize(adp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getListOfAdaptiveDpDimenRes() =
    try {
        val typedArray = obtainTypedArray(R.array.adps)
        val listOfAdaptiveDpResourceId = mutableListOf<AdaptiveDpDimenRes>()

        for (i in 0 until typedArray.length())
            listOfAdaptiveDpResourceId.add(typedArray.getResourceId(i, 0))

        listOfAdaptiveDpResourceId.toList().also {
            typedArray.recycle()
        }
    }
    catch (_: NotFoundException) { listOf() }
    catch (_: RuntimeException) { listOf() }

fun Resources.getListOfAdaptiveDpDimension() =
    mutableListOf<Float>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpDimension(it.asAdaptiveDp()))
        }
    }.toList()

fun Resources.getListOfAdaptiveDpExactDimension() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpExactDimension(it.asAdaptiveDp()))
        }
    }.toList()

fun Resources.getListOfAdaptiveDpDimensionPixelOffset() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpDimensionPixelOffset(it.asAdaptiveDp()))
        }
    }.toList()

fun Resources.getListOfAdaptiveDpDimensionPixelSize() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getAdaptiveDpDimensionPixelSize(it.asAdaptiveDp()))
        }
    }.toList()
