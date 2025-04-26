package it.simonetugnetti.adaptivedimensions.resources.utils

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.resources.enums.AdaptiveDp
import it.simonetugnetti.adaptivedimensions.resources.enums.AdaptiveSp

val adaptiveSpEnumEntries = AdaptiveSp.entries

val listOfAdaptiveSpEnumDimenRes = mutableListOf<Int>().apply {
    adaptiveSpEnumEntries.forEach {
        add(it.dimen)
    }
}.toList()

fun Int.asAdaptiveSp() = adaptiveSpEnumEntries.find { it.dimen == this } ?: AdaptiveSp._0

fun Resources.getAdaptiveSpDimension(asp: AdaptiveSp) =
    try { getDimension(asp.dimen) }
    catch (_: NotFoundException) { 0f }

fun Resources.getAdaptiveSpDimensionPixelOffset(asp: AdaptiveSp) =
    try { getDimensionPixelOffset(asp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getAdaptiveSpDimensionPixelSize(asp: AdaptiveSp) =
    try { getDimensionPixelSize(asp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getListOfAdaptiveSpDimenRes() =
    try {
        val typedArray = obtainTypedArray(R.array.array_of_asp)
        val listOfAdaptiveDpDimenRes = mutableListOf<Int>()

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
