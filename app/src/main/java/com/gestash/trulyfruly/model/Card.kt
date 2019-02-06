package com.gestash.trulyfruly.model

data class Card(
    val suit: Suit,
    val rank: Rank,
    val isVisible: Boolean
)

enum class Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES
}

enum class Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
}
