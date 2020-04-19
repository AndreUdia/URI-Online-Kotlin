package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val ddd = reader.nextInt()

    val listOfDDDs = mapOf(
        61 to "Brasilia",
        71 to "Salvador",
        11 to "Sao Paulo",
        21 to "Rio de Janeiro",
        32 to "Juiz de Fora",
        19 to "Campinas",
        27 to "Vitoria",
        31 to "Belo Horizonte"
    )
    if(listOfDDDs.containsKey(ddd)){
        println(listOfDDDs.get(ddd))
    }
    else{
        println("DDD nao cadastrado")
    }
}

