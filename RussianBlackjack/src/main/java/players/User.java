package players;

import cards.Card;
import cards.GammaDetector;

public class User extends Player {

    private int victories;
    private int defeats;
    private int money;
    private final GammaDetector gammaDetector;

    public User(int victories, int defeats, int money) {
        super();
        this.victories = victories;
        this.defeats = defeats;
        this.money = money;
        gammaDetector = new GammaDetector();
        name = "Пользователь";
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String detect(Card card) {
        return gammaDetector.detect(card);
    }

    public String getRecommendation(Card card) {
        String recommendation = "Берите карту";
        if (gammaDetector.checkValue(card) + countPoints() > 21) {
            recommendation = "Не берите карту";
        }
        return recommendation;
    }
    
    @Override
    public boolean decide(Card card) {
        //takeCard(new Card("", 22, null));
        return false;
    }
}
