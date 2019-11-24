/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val number = reader.nextInt()

    val numbersFromOneToTen = (1..10).toList()

    for(i in 0..9){
        println("${numbersFromOneToTen[i]} x $number = ${multiplyTwoNumbers(numbersFromOneToTen[i], number)}")
    }
}

fun multiplyTwoNumbers(num1: Int, num2: Int): Any? {
    return num1 * num2
}



