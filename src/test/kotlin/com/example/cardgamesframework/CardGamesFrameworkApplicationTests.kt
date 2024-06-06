package com.example.cardgamesframework

import com.example.cardgamesframework.Dealer.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CardGamesFrameworkApplicationTests {

    @Test
    fun contextLoads2() {
       var  deck=Deck()

        CardValue.values().forEach { v ->
            CardSuit.values().forEach { s ->
                deck.add(Card(v, s))

                print(v.vl + "" + s.ss + " ")

            }
            println("")
        }


        CardValue.values().forEach { v ->
            CardSuit.values().forEach { s ->


                print(v.vl + "" + s.ss + " ")

            }
            println("")
        }
        Dealer(deck).shuffleCards()

        Dealer(deck).printDeck()
        println("")
        println("")
        Dealer(deck).shuffleCards()

        Dealer(deck).printDeck()
        Dealer(deck).takeCards();
//any changes
//
//
//
//        var slotPlayer1= CardSlot(2)
//        var slotPlayer2= CardSlot(2)
//        var slotFlop= CardSlot(3)
//        var slotTurn= CardSlot(1)
//        var slotRiver= CardSlot(1)
    }

    @Test
    fun contextLoads() {

        // Manager().printDeck()
    }

}
