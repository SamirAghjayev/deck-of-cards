package com.accelario;

import com.accelario.enums.Rank;
import com.accelario.enums.Suit;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(final Suit suit,
                final Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
