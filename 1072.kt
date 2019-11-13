/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var quantityOfNumbers = reader.nextInt()

    var inTheRange10To20 = 0
    var notInTheRange10To20 = 0

    while(quantityOfNumbers > 0){
        val number = reader.nextInt()
        if(number in 10..20) {
            inTheRange10To20++
        }else{
            notInTheRange10To20++
        }
        quantityOfNumbers -= 1
    }
    println("$inTheRange10To20 in")
    println("$notInTheRange10To20 out")
}
