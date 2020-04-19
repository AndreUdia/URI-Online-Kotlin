package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val a = reader.nextDouble()
    val b = reader.nextDouble()
    val c = reader.nextDouble()

    val list = listOf(a, b, c)

    val listOrdered = list.sortedDescending()

    if (listOrdered[0] >= listOrdered[1] + listOrdered[2]){
        println("NAO FORMA TRIANGULO")
    } else {
        if (listOrdered[0].pow(2.0) == listOrdered[1].pow(2.0) + listOrdered[2].pow(2.0)) println("TRIANGULO RETANGULO")
        if (listOrdered[0].pow(2.0) > listOrdered[1].pow(2.0) + listOrdered[2].pow(2.0)) println("TRIANGULO OBTUSANGULO")
        if (listOrdered[0].pow(2.0) < listOrdered[1].pow(2.0) + listOrdered[2].pow(2.0)) println("TRIANGULO ACUTANGULO")
        if (listOrdered[0] == listOrdered[1] && listOrdered[1] == listOrdered[2])
            println("TRIANGULO EQUILATERO")
        if (
            (listOrdered[0] == listOrdered[1] && listOrdered[1] != listOrdered[2]) ||
            (listOrdered[1] == listOrdered[2] && listOrdered[2] != listOrdered[0])
        ) println("TRIANGULO ISOSCELES")
    }

}
