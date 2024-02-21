package com.example.cardgamesframework.Table

import com.example.cardgamesframework.Dealer.IDealer

interface ITable {
    val dealer: IDealer
    val seats: Map<UInt,IPlayer>
}