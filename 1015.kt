import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val line1 = reader.nextLine().split(" ")
    val line2 = reader.nextLine().split(" ")

    val x1: Double = line1[0].toDouble()
    val y1: Double = line1[1].toDouble()

    val x2: Double = line2[0].toDouble()
    val y2: Double = line2[1].toDouble()

    fun distanceOfTwoPoints(x1: Double, x2: Double, y1: Double, y2: Double) : Double {
        return sqrt(((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0)))
    }

    println("%.4f".format(distanceOfTwoPoints(x1, x2, y1, y2)))
}