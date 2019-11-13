/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var x = reader.nextInt()
    var y = reader.nextInt()

    var result = 0

    if(x < y) {
        if(x >= 0){
            x -= 1
        }else{
            x += 1
        }
        for (i in x until y) {
            if (i % 2 != 0) {
                result += i
            }
        }
    } else if(x > y){
        if(x <= 0){
            x += 1
        }else{
            x -= 1
        }
        y += 1
        for (i in x downTo y) {
            if (i % 2 != 0) {
                result += i
            }
        }
    }
    println(result)
}
