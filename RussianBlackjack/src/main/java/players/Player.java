package players;

import cards.Card;
import java.util.ArrayList;

public class Player {

    private ArrayList<Card> cards;

    public Player() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int countPoints() {
        int points = 0;
        for (Card card : cards) {
            points += card.getValue();
        }
        return points;
    }

    public void takeCard(Card card) {
        cards.add(card);
    }
}
