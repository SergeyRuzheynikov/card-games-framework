package com.example.cardgamesframework.Dealer

class Deck():ArrayList<Card<CardValue, CardSuit>>(), IDeck {
     override fun shuffleMe(){
        shuffle()

    }

    override fun printMe(){
        this.forEach {
            println(it.cardValue.vl+""+it.cardSuit.ss)
        }

    }
    fun addCards(newCards: ArrayList<Card<CardValue,CardSuit>>) {
        addAll(newCards)
    }
}