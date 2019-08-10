import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    var kms: Int = reader.nextInt()

    fun distanceInKm(kms: Int): Int{
        return (60 * kms) / 30
    }

    var temp = distanceInKm(kms)

    println("${temp} minutos")

}