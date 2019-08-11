/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    val PI = 3.14159

    val reader = Scanner(System.`in`)

    var radius = reader.next().toDouble()

    fun sphereVolume(rad: Double) : Double{
        return (4/3.0) * PI * (rad.pow(3.0))
    }

    var temp = sphereVolume(radius)

    println("VOLUME = " + "%.3f".format(temp).replace(",","."))
}