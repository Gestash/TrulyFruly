package com.gestash.trulyfruly.domain

import com.gestash.trulyfruly.model.Card
import com.gestash.trulyfruly.model.Rank
import com.gestash.trulyfruly.model.Suit

class CardsFactory {

    fun createDeck(): List<Card> {
        val cards = arrayListOf<Card>()
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                val card = Card(suit, rank, true)
                cards.add(card)
            }
        }
        return cards
    }

}