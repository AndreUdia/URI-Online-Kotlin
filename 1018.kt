import java.util.*

/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val money: Int = reader.nextInt()

    var notes = money

    val one = 0
    val two = 0
    val five = 0
    val ten = 0
    val twenty = 0
    val fifty = 0
    val hundred = 0

    val bankNotes = listOf(100, 50, 20, 10, 5, 2, 1)
    val quantity = mutableListOf(hundred, fifty, twenty, ten, five, two, one)

    fun countNotes(note: Int) : Int{
        return if(notes % note >= 0 && notes % note != notes){
            val target = notes / note
            notes -= (target * note)
            target
        } else{
            0
        }
    }

    println(money)

    for(i in bankNotes.indices){
        quantity[i] = countNotes(bankNotes[i])
        println("${quantity[i]} nota(s) de R$ ${bankNotes[i]},00")
    }


}