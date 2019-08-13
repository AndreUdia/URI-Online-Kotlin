/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*
import kotlin.math.absoluteValue

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    // Read four numbers witch one with one decimal point
    val n1 = reader.nextFloat().absoluteValue
    val n2 = reader.nextFloat().absoluteValue
    val n3 = reader.nextFloat().absoluteValue
    val n4 = reader.nextFloat().absoluteValue

    // Calculate the average with weight
    val average = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10

    // Print message "Media: " followed by the calculeted result
    println("Media: %.1f".format(average).replace(",", "."))

    // check if is approved exam reproved
    when {
        average >= 7.0 -> println("Aluno aprovado.")
        average < 5 -> println("Aluno reprovado.")
        else -> {
            println("Aluno em exame.")

            val n5 = reader.nextFloat().absoluteValue

            println("Nota do exame: %.1f".format(n5).replace(",", "."))

            val average2 = (average + n5) / 2

            if( average2 >= 5){
                println("Aluno aprovado.")
            } else{
                println("Aluno reprovado.")
            }
            println("Media final: %.1f".format(average2).replace(",", "."))
        }
    }
}
