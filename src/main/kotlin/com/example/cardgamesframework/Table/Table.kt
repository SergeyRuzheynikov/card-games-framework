package com.example.cardgamesframework.Table

import com.example.cardgamesframework.Dealer.IDealer

class Table(
    var countSeats: UInt,
    override val dealer: IDealer,
    override val seats: Map<UInt, IPlayer>
) : ITable {
   init {
        if (countSeats > 9u) {
            this.countSeats = 9u
        }
    }


}