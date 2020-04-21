package com.cabomaldade.strings
/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)
    val tests = mutableListOf<String>()

    while(true) {
        val line = reader.nextLine()
        if (line == "0 0") {
            break
        }
        val splitedLine = line.split(" ")
        val failedNumber = splitedLine[0].toInt()
        val originalNumber = splitedLine[1].replace(failedNumber.toString(), "")

        if (originalNumber.isNotEmpty()){
            tests.add(originalNumber.toBigDecimal().toString())
        } else {
            tests.add("0")
        }
    }

    for (test in tests) {
        println(test.trim())
    }
}