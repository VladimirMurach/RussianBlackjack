package main;

import cards.Card;
import cards.Isotope;
import gui.ChangeDeckForm;
import java.util.ArrayList;
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

    public Game() {
        reader = new XlsxReader();
        writer = new XlsxWriter();
        deck = new ArrayList<>();
        user = new User(0, 0, 100);
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

    }

    public void changeDeck() {
        ChangeDeckForm changeDeckForm = new ChangeDeckForm(this, isotopes, deck);
        changeDeckForm.setVisible(true);
    }

    public void setOpponents() {

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
