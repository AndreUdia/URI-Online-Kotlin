package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var highest = 0
    var position = 0

    for (index in 1..100) {
        val number = reader.nextInt()
        reader.nextLine()
        if (index > 1) {
            when {
                number > highest -> {
                    highest = number
                    position = index
                }
            }
        } else {
            highest = number
            position = index
        }
    }
    println(highest)
    println(position)
}