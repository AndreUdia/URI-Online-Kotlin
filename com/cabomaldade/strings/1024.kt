package com.cabomaldade.strings
/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var numberOfTests = reader.nextInt()
    reader.nextLine()

    while(numberOfTests > 0) {
        val textsArray = reader.nextLine().toCharArray()
        var textShifted = ""

        for (text in textsArray) {
            val textInt = text.toInt()

            textShifted += if (textInt in 65..90 || textInt in 97..122){
                (textInt + 3).toChar().toString()
            } else {
                text.toString()
            }
        }
        val textReversed = textShifted.reversed()
        val firstHalf = textReversed
                .substring(0, textReversed.length / 2)
        val secondHalf = textReversed
                .substring(textReversed.length / 2, textReversed.length)

        val truncated = secondHalf.toCharArray()

        var wordEncrypded = firstHalf

        for (letter in truncated) {
            wordEncrypded += (letter.toInt() -1).toChar().toString()
        }

        println(wordEncrypded)

        numberOfTests --
    }
}