import java.util.*

/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val km: Int = reader.nextInt()
    val fuelSpent: Double = reader.next().toDouble()

    fun consumptionPerLiters (kms: Int, fuelSpent: Double) : Double {
        return kms / fuelSpent
    }

    println("%.3f".format(consumptionPerLiters(km, fuelSpent)).replace(",",".") + " km/l")
}