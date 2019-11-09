/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {

    unitTest()

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val premiacao = 376.0848  // 36.9369  //
    var trx: Double
    val aposta = 336

    var dice: Int
    var jogadas: Double
    var acertos = 0
    var erros = 0
    var cont = 0

    var abaixoDe10 = 0
    var entre10e15 = 0
    var entre15e20 = 0
    var entre20e25 = 0
    var entre25e30 = 0
    var acimade30 = 0


    while(cont < 1) {
        trx = 15000.0
        jogadas = 0.0

        while (trx > 0) {
            jogadas ++
            dice = nextInt(0, 100)
            trx -= aposta
            if (dice < 88) {
                trx += premiacao
                acertos ++
            } else{
                erros ++
            }
        }
        cont ++

        println(jogadas)

        when{
            jogadas < 50 -> abaixoDe10 ++
            jogadas in 51.0..75.0 -> entre10e15 ++
            jogadas in 76.0..100.0 -> entre15e20 ++
            jogadas in 201.0..250.0 -> entre20e25 ++
            jogadas in 251.0..400.0 -> entre25e30 ++
            else -> acimade30 ++
        }

        //println("Jogadas: $jogadas")

        //println("Trx now: $trx")


    }

    val temp = erros + acertos

    println("Menos que 10 mil: $abaixoDe10")
    println("De 10 a 15 mil:  $entre10e15")
    println("de 15 a 20 mil:  $entre15e20")
    println("de 20 a 25 mil:  $entre20e25")
    println("de 25 a 30 mil:  $entre25e30")
    println("Mais de 30 mil:  $acimade30")



    println("Quantidades de jogadas $temp")


}
