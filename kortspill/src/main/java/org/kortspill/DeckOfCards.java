package org.kortspill;

import java.util.ArrayList;

public class DeckOfCards {
    
    private final char[] suit = {'S', 'H', 'D', 'C'};
    private final char[] face = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
    private final ArrayList<PlayingCard> cardDeck = new ArrayList<>();

    public DeckOfCards() {
        
    }

    private void dealHand(int n){

    }
}

//TODO Gjør at konstruktøren lager alle 52 kortene
//? Da i en arraylist eller?