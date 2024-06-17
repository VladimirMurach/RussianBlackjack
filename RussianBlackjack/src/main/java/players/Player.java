package players;

import cards.Card;
import java.util.ArrayList;

public abstract class Player {

    private ArrayList<Card> cards;
    private boolean win;
    private boolean lose;

    public Player() {
        cards = new ArrayList<>();
        win = false;
        lose = false;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isLose() {
        return lose;
    }

    public void setLose(boolean lose) {
        this.lose = lose;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int countPoints() {
        int points = 0;
        if (cards.isEmpty()) {
            return points;
        } else {
            for (Card card : cards) {
                points += card.getValue();
            }
        }
        return points;
    }

    public void takeCard(Card card) {
        cards.add(card);
    }

    public abstract boolean decide(Card card);

}
