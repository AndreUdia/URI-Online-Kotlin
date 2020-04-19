package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val oldSalary = reader.nextDouble()

    val percent: Int
    val newSalary: Double

    when{
        oldSalary in 0.00..400.00 -> {
            newSalary = oldSalary + (oldSalary * 15 / 100)
            percent = 15
        }
        oldSalary in 400.01..800.00 -> {
            newSalary = oldSalary + (oldSalary * 12 / 100)
            percent = 12
        }
        oldSalary in 800.01..1200.00 -> {
            newSalary = oldSalary + (oldSalary * 10 / 100)
            percent = 10
        }
        oldSalary in 1200.01..2000.00 -> {
            newSalary = oldSalary + (oldSalary * 7 / 100)
            percent = 7
        }
        else -> {
            newSalary = oldSalary + (oldSalary * 4 / 100)
            percent = 4
        }
    }

    val readjustment = (newSalary - oldSalary)

    val readjustmentGained = String.format("%.2f", readjustment).replace(",",".")

    println("Novo salario: " + String.format("%.2f", newSalary).replace(",","."))
    println("Reajuste ganho: $readjustmentGained")
    println("Em percentual: $percent %")

}
