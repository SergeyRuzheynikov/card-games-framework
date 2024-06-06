package com.example.cardgamesframework.CardBoxes

import com.example.cardgamesframework.Dealer.ICardSuit

enum class CardOwnerPlace(val ss:String,val suit: String) : ICardOwnerPlace {
    player("p","player"),

    flop("F","FLOP"),
    turn("T","TURN"),
    river("R","RIVER"),

}