import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val hours: Int = reader.nextInt()
    val speedAverage: Int = reader.nextInt()

    val distance: Double = (hours * speedAverage) * 1.0

    val litersNeeded: Double = distance / 12

    println("%.3f".format(litersNeeded).replace(",","."))

}