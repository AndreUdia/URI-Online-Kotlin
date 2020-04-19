package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var counter = 0

    for(i in 0..4){
        val temp = reader.nextInt()
        if(temp % 2 == 0){
            counter++
        }
    }
    println("$counter valores pares")
}
