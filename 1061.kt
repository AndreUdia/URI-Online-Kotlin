/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.time.LocalDateTime
import java.time.Month
import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val initialDay = reader.nextLine().split(" ")[1].toLong()
    val tempInitialHour = reader.nextLine().toCharArray()
    val finalDay = reader.nextLine().split(" ")[1].toInt()
    val tempFinalHour = reader.nextLine().toCharArray()

    val initialHour = (tempInitialHour[0].toString() + tempInitialHour[1].toString()).toLong()
    val initialMinute = (tempInitialHour[5].toString() + tempInitialHour[6].toString()).toLong()
    val initialSecond = (tempInitialHour[10].toString() + tempInitialHour[11].toString()).toLong()

    val finalHour = (tempFinalHour[0].toString() + tempFinalHour[1].toString()).toInt()
    val finalMinute = (tempFinalHour[5].toString() + tempFinalHour[6].toString()).toInt()
    val finalSecond = (tempFinalHour[10].toString() + tempFinalHour[11].toString()).toInt()

    val finishDate = LocalDateTime.of(2000, Month.APRIL, finalDay, finalHour, finalMinute, finalSecond)

    val diferenceBetweenDates = finishDate.minusDays(initialDay).minusHours(initialHour).minusMinutes(initialMinute).minusSeconds(initialSecond)

    if(diferenceBetweenDates.month.toString() == "APRIL"){
        println("${diferenceBetweenDates.dayOfMonth} dia(s)")
    }
    else{
        println("0 dia(s)")
    }
    println("${diferenceBetweenDates.hour} hora(s)")
    println("${diferenceBetweenDates.minute} minuto(s)")
    println("${diferenceBetweenDates.second} segundo(s)")
}
