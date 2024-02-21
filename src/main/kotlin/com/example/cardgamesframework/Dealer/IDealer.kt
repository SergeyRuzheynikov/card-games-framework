package com.example.cardgamesframework.Dealer

interface IDealer {
    var deck: IDeck

    fun unpackingCards()
    fun shuffleCards()
    fun dealCards()


}