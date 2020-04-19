package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val money: Float = reader.nextFloat()

    var cents = money.toString().split(".")[1].toInt()

    var notes = money.toInt()

    //Notes
    val two = 0
    val five = 0
    val ten = 0
    val twenty = 0
    val fifty = 0
    val hundred = 0

    //Coins
    val one = 0
    val fiftyCents = 0
    val twentyFiveCents = 0
    val tenCents = 0
    val fiveCents = 0
    val oneCent = 0

    val bankNotesAndCoinOfOne = listOf(100, 50, 20, 10, 5, 2, 1)
    val bankCoins = listOf(50, 25, 10, 5, 1)
    val quantityNotesAndCoinOfOne = mutableListOf(hundred, fifty, twenty, ten, five, two, one)
    val quantityCoins = mutableListOf(fiftyCents, twentyFiveCents, tenCents, fiveCents, oneCent)

    fun countNotesAndCoinOfOne(note: Int) : Int{
        return if(notes % note >= 0 && notes % note != notes){
            val target = notes / note
            notes -= (target * note)
            target
        } else{
            0
        }
    }

    fun countCoins(coin: Int) : Int{
        return if(cents % coin >= 0 && cents % coin != cents){
            val target = cents / coin
            cents -= (target * coin)
            target
        } else{
            0
        }
    }

    println("NOTAS:")

    for(i in bankNotesAndCoinOfOne.indices){
        if(bankNotesAndCoinOfOne[i] != 1){
            quantityNotesAndCoinOfOne[i] = countNotesAndCoinOfOne(bankNotesAndCoinOfOne[i])
            println("${quantityNotesAndCoinOfOne[i]} nota(s) de R$ ${bankNotesAndCoinOfOne[i]}.00")
        }
    }

    println("MOEDAS:")
    quantityNotesAndCoinOfOne[6] = countNotesAndCoinOfOne(bankNotesAndCoinOfOne[6])
    println("${quantityNotesAndCoinOfOne[6]} moeda(s) de R$ 1.00")

    for(i in bankCoins.indices){
        if(bankCoins[i] != 5 && bankCoins[i] != 1) {
            quantityCoins[i] = countCoins(bankCoins[i])
            println("${quantityCoins[i]} moeda(s) de R$ 0.${bankCoins[i]}")
        } else{
            quantityCoins[i] = countCoins(bankCoins[i])
            println("${quantityCoins[i]} moeda(s) de R$ 0.0${bankCoins[i]}")
        }

    }

}