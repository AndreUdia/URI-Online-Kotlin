package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

fun main(args: Array<String>) {
    for(i in 1..9 step 2) {
        for (j in 7.downTo(5)){
            println("I=$i J=$j")
        }
    }
}