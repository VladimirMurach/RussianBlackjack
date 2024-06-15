package players;

import cards.Card;
import cards.GammaDetector;
import java.util.ArrayList;

public class Player {

    private ArrayList<Card> cards;
    private final GammaDetector gammaDetector;

    public Player() {
        cards = new ArrayList<>();
        gammaDetector = new GammaDetector();
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

    public String detect(Card card) {
        return gammaDetector.detect(card);
    }
}
