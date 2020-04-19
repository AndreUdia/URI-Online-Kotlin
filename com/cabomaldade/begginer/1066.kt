package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var even = 0
    var odd = 0
    var positive = 0
    var negative = 0


    for(i in 0..4){
        val temp = reader.nextInt()
        if(temp % 2 == 0){
            even++
        }else{
            odd++
        }
        if(temp > 0){
            positive++
        }else if(temp < 0){
            negative++
        }
    }
    println("$even valor(es) par(es)")
    println("$odd valor(es) impar(es)")
    println("$positive valor(es) positivo(s)")
    println("$negative valor(es) negativo(s)")
}
