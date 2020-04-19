package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

fun main(args: Array<String>) {
    var jInitial = 5
    var jFinal: Int
    for(i in 1..9 step 2) {
        jInitial += 2
        jFinal = jInitial - 2
        for (j in jInitial.downTo(jFinal)){
            println("I=$i J=$j")
        }
    }
}