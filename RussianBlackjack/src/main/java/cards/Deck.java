package cards;

import java.util.ArrayList;
import java.util.Date;

public class Deck {

    private String name;
    private ArrayList<Card> cards;
    private Date creationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int canPlay() {
        final int msInDay = 86400000;
        for (Card card : cards) {
            double halfLife = card.getIsotope().getHalfLife();
            Date currentDate = new Date();
            if (currentDate.after(new Date((long) (msInDay * halfLife + creationDate.getTime())))) {
                return 2;
            }
        }
        for (Card card : cards) {
            double halfHalfLife = card.getIsotope().getHalfLife() / 2;
            Date currentDate = new Date();
            if (currentDate.after(new Date((long) (msInDay * halfHalfLife + creationDate.getTime())))) {
                return 1;
            }
        }
        return 0;
    }

}
