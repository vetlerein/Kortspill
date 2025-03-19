package org.kortspill.controller;

import org.kortspill.models.DeckOfCards;
import org.kortspill.view.View;


public class Controller {
    private View view;
    private DeckOfCards deck;

    public Controller(View view, DeckOfCards deck) {
        this.view = view;
        this.deck = deck;
    }

    public void handleDeal() {

    }
}