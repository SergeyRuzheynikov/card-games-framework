package com.example.cardgamesframework.Dealer

interface IDeck: List<Map<ICardValue, ICardSuit>>{
   fun shuffleMe()

}