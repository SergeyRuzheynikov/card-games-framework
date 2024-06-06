package com.example.cardgamesframework.Dealer

import com.example.cardgamesframework.Table.Player
import com.example.cardgamesframework.Table.Table

class Dealer( var deck: Deck) : IDealer {
    //перемещение между коллекциями
//    val itemsToTransfer = list.filter { it % 2 == 1 }
//    oddList += itemsToTransfer
//    list -= itemsToTransfer
   // var mapSlots: MutableMap<CardSlot,Card<CardValue,CardSuit>> = mutableMapOf()

    var table: Table? = null
    var player1= Player("Isildur","Jack","Richard")
    var player2= Player("diman","Sergey","Ruzheynikov")

    var seats= mapOf(
        0u to player1,
        1u to player2,
    )

    fun initTable(){
        table=Table(2u,this, seats)
      }

    override fun shuffleCards() {
        deck.shuffleMe()
        deck.toString()
    }

    override fun printDeck() {

        deck.printMe()
    }

    fun takeCards(){
        deck.take(2).forEach {
            println(it.cardValue.toString() + it.cardSuit.toString())
        }

    }

    override fun dealCards() {
     //   val list = mutableListOf(1,2,3,4,5,6)
    //    val oddList = mutableListOf<Int>()

        table?.seats
     //   mapSlots.put()

//        val itemsToTransfer = deck
//        oddList += itemsToTransfer
//        list -= itemsToTransfer
    }
}