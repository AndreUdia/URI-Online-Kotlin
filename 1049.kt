/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val firstWord = reader.nextLine().toLowerCase().trim()
    val secondWord = reader.nextLine().toLowerCase().trim()
    val thirdWord = reader.nextLine().toLowerCase().trim()

    var animal = "any"

    if(firstWord.equals("vertebrado")){
        when{
            secondWord.equals("ave") -> {
                if (thirdWord == "carnivoro"){
                    animal = "aguia"
                }else if(thirdWord.equals("onivoro")){
                    animal = "pomba"
                }
            }
            secondWord.equals("mamifero") -> {
                if (thirdWord.equals("onivoro")){
                    animal = "homem"
                }else if(thirdWord.equals("herbivoro")){
                    animal = "vaca"
                }
            }

        }
    }
    if(firstWord.equals("invertebrado")){
        when{
            secondWord.equals("inseto") -> {
                if (thirdWord.equals("hematofago")){
                    animal = "pulga"
                }else if(thirdWord.equals("herbivoro")){
                    animal = "lagarta"
                }
            }
            secondWord.equals("anelideo") -> {
                if (thirdWord.equals("hematofago")){
                    animal = "sanguessuga"
                }else if(thirdWord.equals("onivoro")){
                    animal = "minhoca"
                }
            }
        }
    }

    println(animal)
}

