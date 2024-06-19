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
    private Game game;
    Banker banker;

    public User(int victories, int defeats, int money, Game game, Banker banker) {
        super();
        this.victories = victories;
        this.defeats = defeats;
        this.money = money;
        gammaDetector = new GammaDetector();
        name = "Пользователь";
        gameWindow = new GameWindow(this);
        this.game = game;
        this.banker = banker;
    }

    public Banker getBanker() {
        return banker;
    }

    public Game getGame() {
        return game;
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
        return true;
    }
    
    public void startGame() {
        Card firstCard = banker.dealCard();
        takeCard(firstCard);
        gameWindow.getLastCardLabel().setText("Вы взяли карту - " + firstCard.getName());
        gameWindow.setMyCard(banker.dealCard());
        gameWindow.setOtherCards(game.cardsPlayed());
        gameWindow.createTable();
        gameWindow.setVisible(true);
    }
    
    public void setWinMoney() {
        setMoney(getMoney() + 10 * game.playersSize());
    }
    
    public void winStartWindow() {
        game.winStartWindow();
    }

    public void loseStartWindow() {
        game.loseStartWindow();
    }

    public void clearCards() {
        game.clearCards();
    }
}
