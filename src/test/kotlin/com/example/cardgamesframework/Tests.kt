package com.example.cardgamesframework

import com.example.cardgamesframework.Dealer.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class Tests {

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

    }

    @Test
    fun contextLoads() {

        // Manager().printDeck()
    }

}
