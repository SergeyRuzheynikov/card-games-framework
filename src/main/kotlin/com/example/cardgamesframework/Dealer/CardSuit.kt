package com.example.cardgamesframework.Dealer
enum class CardSuit(val ss:Char,val suit: String) : ICardSuit{
    spades('s',"spades"),
    clubs('c',"clubs"),
    diamonds('d',"diamonds"),
    hearts('h',"hearts")
}