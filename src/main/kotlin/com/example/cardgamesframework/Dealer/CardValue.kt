package com.example.cardgamesframework.Dealer
enum class CardValue(val vl: Char, var value: String): ICardValue {
    Ace('A', "Ace" ),
    King('K', "King"),
    Queen('Q', "Queen"),
    Jack('J', "Jack"),
    Ten('T', "Ten"),
    Nine('9', "Nine"),
    Eight('8', "Eight"),
    Seven('7', "Seven"),
    Six('6', "Six"),
    Five('5', "Five"),
    Fourth('4', "Fourth"),
    Three('3', "Three"),
    Deuce('2', "Deuce"),
}
