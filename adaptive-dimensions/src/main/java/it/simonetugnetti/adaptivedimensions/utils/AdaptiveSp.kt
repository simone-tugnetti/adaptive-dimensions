package it.simonetugnetti.adaptivedimensions.utils

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.enums.AdaptiveSp

val adaptiveSpEnumEntries = AdaptiveSp.entries

val listOfAdaptiveSpEnumDimenRes = mutableListOf<Int>().apply {
    adaptiveSpEnumEntries.forEach {
        add(it.dimen)
    }
}.toList()

fun Resources.getAdaptiveSpDimension(asp: AdaptiveSp) =
    try { getDimension(asp.dimen) }
    catch (_: NotFoundException) { 0f }

fun Resources.getAdaptiveSpDimensionPixelOffset(asp: AdaptiveSp) =
    try { getDimensionPixelOffset(asp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getAdaptiveSpDimensionPixelSize(asp: AdaptiveSp) =
    try { getDimensionPixelSize(asp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getListOfAdaptiveSpDimenRes(): List<Int> {
    val typedArray = obtainTypedArray(R.array.array_of_asp)
    val listOfAdaptiveDpResourceId = mutableListOf<Int>()

    for (i in 0 until typedArray.length())
        listOfAdaptiveDpResourceId.add(typedArray.getResourceId(i, 0))

    return listOfAdaptiveDpResourceId.toList().also {
        typedArray.recycle()
    }

}

fun Resources.getListOfAdaptiveSpDimension() =
    mutableListOf<Float>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getDimension(it))
        }
    }.toList()

fun Resources.getListOfAdaptiveSpDimensionPixelOffset() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveSpDimenRes().forEach {
            add(getDimensionPixelOffset(it))
        }
    }.toList()
