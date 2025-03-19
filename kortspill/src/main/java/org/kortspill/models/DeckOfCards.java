package org.kortspill.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    
    private final char[] suit = {'S', 'H', 'D', 'C'};
    private final ArrayList<PlayingCard> cardDeck = new ArrayList<>();

    public DeckOfCards() {
        for (char s : suit){
            for(int f = 1; f <= 13; f++){
                cardDeck.add(new PlayingCard(s, f));
            }
        }
    }

    
    private List<PlayingCard> dealHand(int n){
        
        List<PlayingCard> tempDeck = new ArrayList<>(cardDeck);
        List<PlayingCard> hand = new ArrayList<PlayingCard>(); 
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {  
            int index = random.nextInt(tempDeck.size()); 
            hand.add(tempDeck.get(index));
            tempDeck.remove(index);
        }
        return hand;
    }
 

    private boolean checkHand(PlayingCard hand){

        if (condition) {
            
        } else if (condition) {
            
        } 


        return false;
    }

}