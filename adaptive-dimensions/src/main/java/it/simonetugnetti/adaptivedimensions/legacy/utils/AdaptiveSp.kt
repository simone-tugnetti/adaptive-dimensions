package it.simonetugnetti.adaptivedimensions.legacy.utils

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.legacy.enums.AdaptiveSp

typealias AdaptiveSpDimenRes = Int

val adaptiveSpEnumEntries = AdaptiveSp.entries

val listOfAdaptiveSpEnumDimenRes = mutableListOf<AdaptiveSpDimenRes>().apply {
    adaptiveSpEnumEntries.forEach {
        add(it.dimen)
    }
}.toList()

fun Int.asAdaptiveSp() = adaptiveSpEnumEntries.find { it.dimen == this } ?: AdaptiveSp._0asp

fun Resources.getAdaptiveSpDimension(asp: AdaptiveSp) =
    try { getDimension(asp.dimen) }
    catch (_: NotFoundException) { 0f }

fun Resources.getAdaptiveSpExactDimension(asp: AdaptiveSp) =
    try { (getDimension(asp.dimen) / displayMetrics.density).toInt() }
    catch (_: NotFoundException) { 0 }

fun Resources.getAdaptiveSpDimensionPixelOffset(asp: AdaptiveSp) =
    try { getDimensionPixelOffset(asp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getAdaptiveSpDimensionPixelSize(asp: AdaptiveSp) =
    try { getDimensionPixelSize(asp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getListOfAdaptiveSpDimenRes() =
    try {
        val typedArray = obtainTypedArray(R.array.asps)
        val listOfAdaptiveDpDimenRes = mutableListOf<AdaptiveSpDimenRes>()

        for (i in 0 until typedArray.length())
            listOfAdaptiveDpDimenRes.add(typedArray.getResourceId(i, 0))

        listOfAdaptiveDpDimenRes.toList().also {
            typedArray.recycle()
        }
    }
    catch (_: NotFoundException) { listOf() }
    catch (_: RuntimeException) { listOf() }

fun Resources.getListOfAdaptiveSpDimension() =
    mutableListOf<Float>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpDimension(it.asAdaptiveSp()))
        }
    }.toList()

fun Resources.getListOfAdaptiveSpExactDimension() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpExactDimension(it.asAdaptiveSp()))
        }
    }.toList()

fun Resources.getListOfAdaptiveSpDimensionPixelOffset() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpDimensionPixelOffset(it.asAdaptiveSp()))
        }
    }.toList()

fun Resources.getListOfAdaptiveSpDimensionPixelSize() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getAdaptiveSpDimensionPixelSize(it.asAdaptiveSp()))
        }
    }.toList()
