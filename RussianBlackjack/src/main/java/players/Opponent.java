package players;

import cards.Card;

public class Opponent extends Player {

    @Override
    public boolean decide(Card card) {
        boolean decision;
        if (countPoints() < 11) {
            takeCard(card);
            decision = true;
        } else if (countPoints() < 14) {
            if (Math.random() < 0.5) {
                takeCard(card);
                decision = true;
            } else {
                decision = false;
            }
        } else if (countPoints() < 17) {
            if (Math.random() < 0.25) {
                takeCard(card);
                decision = true;
            } else {
                decision = false;
            }
        } else {
            decision = false;
        }
        return decision;
    }
}
