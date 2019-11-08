/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val n1 = reader.nextInt()
    val n2 = reader.nextInt()
    val n3 = reader.nextInt()

    val list = mutableListOf(1 to n1, 2 to n2, 3 to n3)

    list.sortBy { it.second }

    for(i in list){
        println(i.second)
    }
    println()

    println("$n1\n$n2\n$n3")
}
