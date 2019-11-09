/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val initialHour = reader.nextInt()
    val initialMinute = reader.nextInt()
    val finalHour = reader.nextInt()
    val finalMinute = reader.nextInt()

    val hour = when{
        finalHour > initialHour && finalMinute <= initialMinute -> 0
        finalHour == initialHour && finalMinute < initialMinute -> 23
        finalHour == initialHour && finalMinute > initialMinute -> 0
        initialHour >= finalHour && finalMinute < initialMinute -> 23 - initialHour + finalHour
        initialHour >= finalHour && finalMinute >= initialMinute-> 24 - initialHour + finalHour
        else -> finalHour - initialHour
    }

    val minute = when{
        initialMinute > finalMinute -> 60 - initialMinute + finalMinute
        initialMinute == finalMinute -> 0
        else -> finalMinute - initialMinute
    }

    println("O JOGO DUROU $hour HORA(S) E $minute MINUTO(S)")
}
