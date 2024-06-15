package players;

import cards.Card;
import java.util.ArrayList;

public class Banker extends Player {
    
    private ArrayList<Card> deck;

    public Banker(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
    
    
}
