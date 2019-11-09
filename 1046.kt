/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val startTime = reader.nextInt()
    val endTime = reader.nextInt()

    val result = when{
        startTime >= endTime -> 24 - startTime + endTime
        else -> endTime - startTime
    }

    println("O JOGO DUROU $result HORA(S)")
}
