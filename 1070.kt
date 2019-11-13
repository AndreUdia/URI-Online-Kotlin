/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val number = reader.nextInt()

    for(i in number..number + 10 step 2){
        println(i+1)
    }
}