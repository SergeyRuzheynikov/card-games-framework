package com.example.cardgamesframework.Dealer

class Deck() : ArrayList<Card<CardValue,CardSuit>>(52), IDeck{
    override fun shuffleMe() {
        TODO("Not yet implemented")
    }

    override fun contains(element: Map<ICardValue, ICardSuit>): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<Map<ICardValue, ICardSuit>>): Boolean {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: Map<ICardValue, ICardSuit>): Int {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: Map<ICardValue, ICardSuit>): Int {
        TODO("Not yet implemented")
    }


}