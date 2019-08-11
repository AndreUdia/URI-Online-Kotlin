/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val list = mutableListOf<Int>(reader.nextInt(), reader.nextInt(), reader.nextInt(), reader.nextInt())

    val a = list[0]
    val b = list[1]
    val c = list[2]
    val d = list[3]

    fun checkThings(a: Int, b:Int, c:Int, d: Int) : Boolean{
        return b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0
    }

    if (!checkThings(a, b, c, d)) println("Valores nao aceitos") else println("Valores aceitos")

}

