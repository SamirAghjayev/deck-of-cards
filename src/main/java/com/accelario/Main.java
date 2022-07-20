package com.accelario;

public class Main {
    public static void main(String[] args) {
        var deckOfCards = new Deck();
        System.out.println(deckOfCards);
        deckOfCards.shuffle();
        System.out.println(deckOfCards.dealCard());
        System.out.println(deckOfCards.dealCard());
        System.out.println(deckOfCards.dealCard());
        System.out.println(deckOfCards);
    }
}