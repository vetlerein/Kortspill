package org.kortspill.controller;

import org.kortspill.models.DeckOfCards;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class Controller {
    private DeckOfCards deck = new DeckOfCards();

    public Controller() {
    }

    public HBox handleDealButton(Button button) {
        HBox kortBox = new HBox();
        kortBox.setSpacing(10);
        for (int i = 0; i < 5; i++) {
            Label kort = new Label(deck.dealHand(5).get(i).getAsString());
            kortBox.getChildren().add(kort);
        }
        return kortBox;
    }

    public Label handleWinLabel() {
        Label resultLabel = new Label();
        deck.checkHand(deck.dealHand(5));
        if (deck.checkHand(deck.dealHand(5))) {
            resultLabel.setText("Flush");
            resultLabel.setFont(javafx.scene.text.Font.font("Times new roman", 30));

        } else {
            resultLabel.setText("Ingen Flush");
            resultLabel.setFont(javafx.scene.text.Font.font("Times new roman", 30));
        }

        return resultLabel;
    }
}