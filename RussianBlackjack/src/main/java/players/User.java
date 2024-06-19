package players;

import cards.Card;
import cards.GammaDetector;
import gui.GameWindow;
import main.Game;

public class User extends Player {

    private int victories;
    private int defeats;
    private int money;
    private final GammaDetector gammaDetector;
    private final GameWindow gameWindow;
    private boolean decision;
    private Game game;

    public User(int victories, int defeats, int money, Game game) {
        super();
        this.victories = victories;
        this.defeats = defeats;
        this.money = money;
        gammaDetector = new GammaDetector();
        name = "Пользователь";
        gameWindow = new GameWindow(this);
        this.game = game;
    }

    public GameWindow getGameWindow() {
        return gameWindow;
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

    public void setDecision(boolean decision) {
        this.decision = decision;
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
        if (cards.isEmpty()) {
            takeCard(card);
            gameWindow.getLastCardLabel().setText("Вы взяли карту - " + card.getName());
            return true;
        }
        gameWindow.setMyCard(card);
        gameWindow.setOtherCards(game.cardsPlayed());
        gameWindow.setVisible(true);
        return decision;
    }
    
    public void startGame(Banker banker) {
        takeCard(banker.dealCard());
        System.out.println("Пользователь сыграл");
        game.endGame();
    }
}
