/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val timeInSeconds = reader.nextInt().toLong()

    val hour = TimeUnit.SECONDS.toHours(timeInSeconds)
    val minutes = TimeUnit.SECONDS.toMinutes(timeInSeconds) % 60
    val seconds =  TimeUnit.SECONDS.toSeconds(timeInSeconds) % 60

    println("$hour:$minutes:$seconds")

}