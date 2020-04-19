package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

fun main(args: Array<String>) {
    var initial = 0.0
    var adicional = 0.2
    var jInitial = 0.0

    while (initial <= 2) {
        for (j in 1..3){
           println(String.format("I=%.1f J=%.1f", initial, j + jInitial)
                   .replace(",",".")
                   .replace(".0",""))
         }
        initial += 0.2
        jInitial += 0.2
        adicional += 0.2
    }
}