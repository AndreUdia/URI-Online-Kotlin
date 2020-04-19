package com.cabomaldade.begginer/*
    Created by Cabomaldade - André Vasconcelos Souto
    Tecnólogo em Sistemas Para Internet - IFTM - Uberlândia - MG
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    reader.useLocale(Locale.ENGLISH)

    val firstWord = reader.nextLine().toLowerCase().trim()
    val secondWord = reader.nextLine().toLowerCase().trim()
    val thirdWord = reader.nextLine().toLowerCase().trim()

    val aguia = Animal("aguia", "vertebrado", "ave", "carnivoro")
    val pomba = Animal("pomba", "vertebrado", "ave", "onivoro")
    val homem = Animal("homem", "vertebrado", "mamifero", "onivoro")
    val vaca = Animal("vaca", "vertebrado", "mamifero", "herbivoro")
    val pulga = Animal("pulga", "invertebrado", "inseto", "hematofago")
    val lagarta = Animal("lagarta", "invertebrado", "inseto", "herbivoro")
    val sanguessuga = Animal("sanguessuga", "invertebrado", "anelideo", "hematofago")
    val minhoca = Animal("minhoca", "invertebrado", "anelideo", "onivoro")

    val listaDeAnimais = listOf(aguia,pomba,homem,vaca,pulga,lagarta,sanguessuga,minhoca)

    val animalInformado = listaDeAnimais
        .filter { it.tipo == firstWord && it.especie == secondWord && it.alimentacao == thirdWord}

    println(animalInformado[0].nome)
}

data class Animal(var nome: String, var tipo: String, var especie: String, var alimentacao: String)
