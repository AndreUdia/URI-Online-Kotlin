/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    var n = reader.nextInt()
    var coelhos = 0.0
    var ratos = 0.0
    var sapos = 0.0

    reader.nextLine()

    while (n > 0) {
        val input = reader.nextLine().split(" ")
        val amount = input[0].trim().toInt()
        when (input[1].trim()) {
            "C" -> coelhos += amount
            "R" -> ratos += amount
            else -> sapos += amount
        }
        n--
    }

    val total = coelhos + ratos + sapos

    println("Total: ${total.toInt()} cobaias\n" +
            "Total de coelhos: ${coelhos.toInt()}\n" +
            "Total de ratos: ${ratos.toInt()}\n" +
            "Total de sapos: ${sapos.toInt()}\n" +
            "Percentual de coelhos: ${formatPercentual(coelhos, total)} %\n" +
            "Percentual de ratos: ${formatPercentual(ratos, total)} %\n" +
            "Percentual de sapos: ${formatPercentual(sapos, total)} %")

}

fun formatPercentual(valor: Double, total: Double): String{
    val temp = (valor / total) * 100
    return String.format("%.2f", temp).replace(",", ".")
}
