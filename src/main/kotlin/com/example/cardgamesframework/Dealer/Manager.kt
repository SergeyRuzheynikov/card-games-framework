package com.example.cardgamesframework.Dealer

class Manager {

    fun generateDeck() {
        CardValue.values().forEach { v ->
            CardSuit.values().forEach { s ->
                Deck().add(Card(v, s))
            }
        }
    }


    fun printDeck(){
        Deck().forEach {
            //println(it.cardValue.name,it.cardSuit.name)
            println("32131")
        }
    }




}