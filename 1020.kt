/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    var daysGiven: Int = reader.nextInt()

    val year = 0
    val month = 0
    val day = 0

    val yearMonthDay = listOf(365, 30, 1)
    val quantity = mutableListOf(year, month, day)

    fun countYearsMonthsDays(num: Int) : Int{
        return if(daysGiven % num >= 0 && daysGiven % num != daysGiven){
            val target = daysGiven / num
            daysGiven -= (target * num)
            target
        } else{
            0
        }
    }

    for(i in yearMonthDay.indices){
        quantity[i] = countYearsMonthsDays(yearMonthDay[i])
    }

    println("${quantity[0]} ano(s)")
    println("${quantity[1]} mes(es)")
    println("${quantity[2]} dia(s)")

}