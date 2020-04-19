package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val numberLimit = reader.nextInt()

    for(i in 1..numberLimit){
        if(i % 2 == 0){
            println("$i^2 = ${i * i}")
        }
    }
}
