/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var quantityOfNumbers = reader.nextInt()

    while (quantityOfNumbers > 0){
        val number = reader.nextInt()
        when {
            number > 0 -> when{
                number % 2 == 0 -> println("EVEN POSITIVE")
                else -> println("ODD POSITIVE")
            }
            number < 0 -> when{
                number % 2 == 0 -> println("EVEN NEGATIVE")
                else -> println("ODD NEGATIVE")
            }
            else -> println("NULL")
        }
        quantityOfNumbers -= 1
    }
}