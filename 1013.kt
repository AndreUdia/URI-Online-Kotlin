import java.util.*
import kotlin.math.absoluteValue

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    var list = listOf<Int>(reader.nextInt(),reader.nextInt(),reader.nextInt())

    println(list.maxBy { it.absoluteValue }.toString() + " eh o maior")

}