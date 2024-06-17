package players;

import cards.Card;
import java.util.ArrayList;
import java.util.Collections;

public class Banker extends Player {

    private ArrayList<Card> deck;
    
    public Banker() {
        name = "Банкир";
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

    public void play(Player player) {
        boolean playing = true;
        while (playing) {
            if (player.countPoints() < 21) {
                playing = player.decide(dealCard());
            } else {
                playing = false;
            }
        }
    }

    @Override
    public boolean decide(Card card) {
        boolean decision;
        if (countPoints() < 17) {
            takeCard(card);
            decision = true;
        } else {
            decision = false;
        }
        return decision;
    }

}
