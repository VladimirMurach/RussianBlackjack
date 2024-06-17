package main;

import cards.Card;
import cards.Isotope;
import gui.ChangeDeckForm;
import gui.Menu;
import gui.StartWindow;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import players.Banker;
import players.Opponent;
import players.Player;
import players.User;

public class Game {

    private User user;
    private Banker banker;
    private ArrayList<Opponent> opponents;
    private ArrayList<Player> players;
    private XlsxReader reader;
    private XlsxWriter writer;
    private ArrayList<Isotope> isotopes;
    private ArrayList<Card> deck;
    private StartWindow startWindow;
    private boolean gameOver;

    public Game(Menu menu) {
        reader = new XlsxReader();
        writer = new XlsxWriter();
        deck = new ArrayList<>();
        user = new User(0, 0, 100);
        banker = new Banker();
        startWindow = new StartWindow(menu, this);
        readUser();
        readIsotopes();
        setDeck();
        readDeck();
    }

    public ArrayList<Isotope> getIsotopes() {
        return isotopes;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void readIsotopes() {
        isotopes = reader.readIsotopes();
    }

    public void setDeck() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("Шесть", 6, null));
        cards.add(new Card("Семь", 7, null));
        cards.add(new Card("Восемь", 8, null));
        cards.add(new Card("Девять", 9, null));
        cards.add(new Card("Десять", 10, null));
        cards.add(new Card("Валет", 2, null));
        cards.add(new Card("Дама", 3, null));
        cards.add(new Card("Король", 4, null));
        cards.add(new Card("Туз", 11, null));
        for (Card card : cards) {
            for (int i = 0; i < 4; i++) {
                deck.add(card);
            }
        }
    }

    public void readDeck() {
        deck = reader.readDeck(isotopes, deck);
    }

    public void saveDeck() {
        writer.writeDeck(deck);
    }

    public void start() {
        startWindow.getResultLabel().setText("Первый розыгрыш");
        startWindow.setVisible(true);
    }

    public void startRound() {
        gameOver = false;
        setPlayers();
        int n = players.size();
        banker.setDeck(new ArrayList<>(deck));
        banker.shuffleDeck();
        Collections.shuffle(players);
        for (Player player : players) {
            System.out.println(player.getName() + " играет");
            banker.play(player);
            if (player.countPoints() == 21) {
                gameOver = true;
                System.out.println(player.getName() + " набрал 21 очко и победил!");
                if (player.equals(user)) {
                    user.setVictories(user.getVictories() + 1);
                    user.setMoney(user.getMoney() + 10 * n);
                    startWindow.getResultLabel().setText("Вы победили!");
                } else {
                    user.setDefeats(user.getDefeats() + 1);
                    user.setMoney(user.getMoney() - 10);
                    startWindow.getResultLabel().setText("Вы проиграли!");
                }
                startWindow.setVisible(true);
                break;
            }
            if (player.countPoints() > 21) {
                player.setLose(true);
                System.out.println("У игрока " + player.getName() + " перебор!");
                if (player.equals(user)) {
                    startWindow.getResultLabel().setText("Вы проиграли!");
                    gameOver = true;
                    user.setDefeats(user.getDefeats() + 1);
                    user.setMoney(user.getMoney() - 10);
                    startWindow.setVisible(true);
                    break;
                }
            }
        }
        if (!gameOver) {
            ArrayList<Player> lastPlayers = new ArrayList<>();
            for (Player player : players) {
                if (!(player.isLose() | player.equals(user))) {
                    lastPlayers.add(player);
                }
            }
            banker.play(banker);
            System.out.println("Банкир: " + banker.countPoints());
            for (Player player : lastPlayers) {
                System.out.println(player.getName() + ": " + player.countPoints());
            }
            System.out.println("Пользователь: " + user.countPoints());
            boolean userWin = true;
            for (Player player : lastPlayers) {
                if (user.countPoints() <= player.countPoints()) {
                    userWin = false;
                }
            }
            if (user.countPoints() <= banker.countPoints() & banker.countPoints() < 22) {
                userWin = false;
            }
            if (userWin) {
                user.setVictories(user.getVictories() + 1);
                user.setMoney(user.getMoney() + 10 * n);
                startWindow.getResultLabel().setText("Вы победили!");
            } else {
                user.setDefeats(user.getDefeats() + 1);
                user.setMoney(user.getMoney() - 10);
                startWindow.getResultLabel().setText("Вы проиграли!");
            }
            startWindow.setVisible(true);
        }
        for (Opponent opponent : opponents) {
            opponent.setCards(new ArrayList<>());
        }
        user.setCards(new ArrayList<>());
        banker.setCards(new ArrayList<>());
    }

    public void setPlayers() {
        players = new ArrayList<>();
        for (Opponent opponent : opponents) {
            players.add(opponent);
        }
        players.add(user);
    }

    public void changeDeck() {
        ChangeDeckForm changeDeckForm = new ChangeDeckForm(this, isotopes, deck);
        changeDeckForm.setVisible(true);
    }

    public void setOpponents(int number) {
        opponents = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Opponent opponent = new Opponent();
            opponent.setName("Соперник " + (i + 1));
            opponents.add(opponent);
        }
    }

    public User getUser() {
        return user;
    }

    public void setUserInfo(JLabel victoriesLabel, JLabel defeatsLabel, JLabel moneyLabel) {
        victoriesLabel.setText("Победы: " + Integer.toString(user.getVictories()));
        defeatsLabel.setText("Поражения: " + Integer.toString(user.getDefeats()));
        moneyLabel.setText("Деньги: " + Integer.toString(user.getMoney()));
    }

    public void readUser() {
        int[] userInfo = reader.readUser();
        user.setVictories(userInfo[0]);
        user.setDefeats(userInfo[1]);
        user.setMoney(userInfo[2]);
    }

    public void saveUserInfo() {
        int[] userInfo = {user.getVictories(), user.getDefeats(), user.getMoney()};
        writer.writeUserInfo(userInfo);
    }
}
