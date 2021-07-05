package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {
    
    val reader = Scanner(System.`in`)

    val numberOfTestCases = reader.nextInt()
    
    var sum = 0

    for (i in 1..numberOfTestCases) {
        
        val line = reader.nextLine()
        
        val num1 = line.split(" ")[0].toInt()
        val num2 = line.split(" ")[1].toInt()
        
        if (num1 < num2) {
            for(i in num1 + 1 until num2) {
                var temp =  if (i % 2 != 0) i else 0
                sum += temp
            }
            println(sum)
        } else if (num1 > num2) {
            for(i in num1 - 1 downTo num2 + 1) {
                var temp =  if (i % 2 != 0) i else 0
                sum += temp
            }
            println(sum)
        } else {
            println(sum)
        }
        sum = 0
    }
}
