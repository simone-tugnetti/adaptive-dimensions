package it.simonetugnetti.adaptivedimensions.utils

import android.content.res.Resources
import android.content.res.Resources.NotFoundException
import it.simonetugnetti.adaptivedimensions.R
import it.simonetugnetti.adaptivedimensions.enums.AdaptiveDp

val adaptiveDpEnumEntries = AdaptiveDp.entries

val listOfAdaptiveDpEnumDimenRes = mutableListOf<Int>().apply {
    adaptiveDpEnumEntries.forEach {
        add(it.dimen)
    }
}.toList()

fun Resources.getAdaptiveDpDimension(adp: AdaptiveDp) =
    try { getDimension(adp.dimen) }
    catch (_: NotFoundException) { 0f }

fun Resources.getAdaptiveDpDimensionPixelOffset(adp: AdaptiveDp) =
    try { getDimensionPixelOffset(adp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getAdaptiveDpDimensionPixelSize(adp: AdaptiveDp) =
    try { getDimensionPixelSize(adp.dimen) }
    catch (_: NotFoundException) { 0 }

fun Resources.getListOfAdaptiveDpDimenRes(): List<Int> {
    val typedArray = obtainTypedArray(R.array.array_of_adp)
    val listOfAdaptiveDpResourceId = mutableListOf<Int>()

    for (i in 0 until typedArray.length())
        listOfAdaptiveDpResourceId.add(typedArray.getResourceId(i, 0))

    return listOfAdaptiveDpResourceId.toList().also {
        typedArray.recycle()
    }

}

fun Resources.getListOfAdaptiveDpDimension() =
    mutableListOf<Float>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getDimension(it))
        }
    }.toList()

fun Resources.getListOfAdaptiveDpDimensionPixelOffset() =
    mutableListOf<Int>().apply {
        getListOfAdaptiveDpDimenRes().forEach {
            add(getDimensionPixelOffset(it))
        }
    }.toList()
