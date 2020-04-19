package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var salary = reader.nextDouble()
    var taxes: Double
    var flag = true

    if(salary > 2000.00){
        salary -= 2000.00
    }else{
        println("Isento")
        flag = false
    }

    if(salary > 1000.00){
        taxes = 1000.00 * 8 / 100
        salary -= 1000.00
    } else{
        taxes = salary * 8 / 100
        salary = salary.minus(1000.00)
    }

    if(salary > 1500.00){
        taxes += 1500.00 * 18 / 100
        salary -= 1500.00
    } else if(salary > 0){
        taxes += salary * 18 / 100
        salary = salary.minus(1500.00)
    }

    if(salary > 0){
        taxes += salary * 28 / 100
    }

    if(flag){
        println(String.format("R$ %.2f",taxes).replace(",","."))
    }
}
