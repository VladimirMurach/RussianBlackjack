package players;

import cards.Card;
import java.util.ArrayList;
import java.util.Collections;

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

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        return deck.removeFirst();
    }

}
