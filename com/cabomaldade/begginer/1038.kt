package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val productCode = reader.nextInt()
    val quantity = reader.nextInt()

    val products = mapOf(1 to 4.00, 2 to 4.50, 3 to 5.00, 4 to 2.00, 5 to 1.50)

    for(key in products.keys){
        if(productCode == key){
            println("Total: R$ %.2f".format(products[key]?.times(quantity)))
        }
    }
}
