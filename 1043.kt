/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val a = reader.nextFloat()
    val b = reader.nextFloat()
    val c = reader.nextFloat()

    if (a + b > c && a + c > b && b + c > a){
        println("Perimetro = ${a + b + c}")
    } else{
        println("Area = ${0.5 * (a + b) * c}")
    }

}
