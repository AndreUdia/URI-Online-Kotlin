package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val x = reader.nextFloat()
    val y = reader.nextFloat()

    when{
        x > 0.0 && y > 0.0 -> println("Q1")
        x > 0.0 && y < 0.0 -> println("Q4")
        x < 0.0 && y < 0.0 -> println("Q3")
        x < 0.0 && y > 0.0 -> println("Q2")
        y.roundToInt() == 0 && (x > 0.0 || x < 0.0) -> println("Eixo X")
        x.roundToInt() == 0 && (y > 0.0 || y < 0.0) -> println("Eixo Y")
        else -> println("Origem")
    }
}
