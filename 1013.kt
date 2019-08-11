import java.util.*
import kotlin.math.absoluteValue

/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val list = listOf(reader.nextInt(),reader.nextInt(),reader.nextInt())

    println(list.maxBy { it.absoluteValue }.toString() + " eh o maior")

}