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

}
