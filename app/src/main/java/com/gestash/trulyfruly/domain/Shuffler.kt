package com.gestash.trulyfruly.domain

import com.gestash.trulyfruly.model.Card

class Shuffler {

    private val cardsFactory = CardsFactory()

    fun shuffle():List<Card>{
        val cards = cardsFactory.createDeck()
        return cards.shuffled()
    }
}