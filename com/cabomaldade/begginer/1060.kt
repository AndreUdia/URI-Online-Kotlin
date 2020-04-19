package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val listOfNumbers: ArrayList<Double> = ArrayList()

    for(i in 0..5){
        val tempInt = reader.nextDouble()
        listOfNumbers.add(tempInt)
    }

    val listOfPositives = listOfNumbers.filter { it > 0}

    println("${listOfPositives.size} valores positivos")
}
