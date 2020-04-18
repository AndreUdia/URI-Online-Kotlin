/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {
    var initial = 1

    println("I=1 J=60")

    for(i in 55.downTo(0) step 5){
        initial += 3
        println("I=$initial J=$i")
    }
}