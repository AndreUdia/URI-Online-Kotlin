/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val num = reader.nextDouble()

    when{
        num in 0.0..25.0 -> println("Intervalo [0,25]")
        (num > 25.0 && num <= 50.0) -> println("Intervalo (25,50]")
        (num > 50.0 && num <= 75.0) -> println("Intervalo (50,75]")
        (num > 75.0 && num <= 100.0) -> println("Intervalo (75,100]")
        num !in 0.0..100.0 -> println("Fora de intervalo")
    }
}
