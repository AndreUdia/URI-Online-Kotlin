package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var numberOfTests = reader.nextInt()
    val listOfAverage: ArrayList<Float> = ArrayList()

    reader.nextLine()

    while(numberOfTests > 0){
        val temp = reader.nextLine().trim().split(" ")
        val sum = (((temp[0].toFloat() * 2) + (temp[1].toFloat() * 3) + (temp[2].toFloat() * 5))) / 10
        listOfAverage.add(sum)
        numberOfTests --
    }
    val temp = listOfAverage.iterator()

    while(temp.hasNext()){
            println(String.format("%.1f",temp.next()).replace(",", "."))
    }
}
