/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val a = reader.nextDouble()
    val b = reader.nextDouble()
    val c = reader.nextDouble()

    val x1 = ((-(b) + sqrt((b*b) - (4 * a * c))) / (2 * a)).isNaN()
    val x2 = ((-(b) - sqrt((b*b) - (4 * a * c))) / (2 * a)).isNaN()

    if(!x1 && !x2){
        val r1 = (-(b) + sqrt((b*b) - (4 * a * c))) / (2 * a)
        val r2 = (-(b) - sqrt((b*b) - (4 * a * c))) / (2 * a)
        println("R1 = %.5f".format(r1))
        println("R2 = %.5f".format(r2))
    }else{
        println("Impossivel calcular")
    }
}