package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val a = reader.nextInt()
    val b = reader.nextInt()

    val c = maxOf(a,b)

    if(c % a == 0 && c % b == 0){
        println("Sao Multiplos")
    } else{
        println("Nao sao Multiplos")
    }

}
