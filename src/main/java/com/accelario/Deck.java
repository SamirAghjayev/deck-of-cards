package com.accelario;

import com.accelario.enums.Rank;
import com.accelario.enums.Suit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    private int currentCard;

    public Deck() {
        currentCard = 0;
        for (int i = 0; i < Suit.values().length * Rank.values().length; i++) {
            cards.add(new Card(Suit.values()[i / Rank.values().length], Rank.values()[i % Rank.values().length]));
        }
    }


    public void shuffle() {
        currentCard = 0;
//        while (cards.size() > 0) {
//            int index = (int) (Math.random() * cards.size());
//            cards.add(cards.remove(index));
//        }

        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (currentCard < cards.size()) {
            return cards.get(currentCard++);
        } else {
            return null;
        }
    }

    public void fold(List<Card> cards) {
        this.cards.removeAll(cards);
    }

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "cards=" + cards +
                '}';
    }
}
