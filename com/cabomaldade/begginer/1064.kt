package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var n1: Float
    var total = 0f
    var totalNumber = 0
    val sc = Scanner(System.`in`)
    for (i in 1..6) {
        n1 = sc.nextFloat()
        if (n1 > 0) {
            totalNumber += 1
            total += n1
        }
    }
    val average = total / totalNumber

    print("$totalNumber valores positivos\n")
    System.out.printf(Locale.US,"%.1f\n", average)
}
