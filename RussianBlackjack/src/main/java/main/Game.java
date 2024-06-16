package main;

import cards.Card;
import cards.Isotope;
import java.util.ArrayList;
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
    private ArrayList<Isotope> isotopes;
    private ArrayList<Card> deck;

    public Game() {
        reader = new XlsxReader();
        deck = new ArrayList<>();
        readIsotopes();
        setDeck();
        readDeck();
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

    public void start() {

    }

    public void changeDeck() {

    }

    public void setOpponents() {

    }

    public User getUser() {
        return user;
    }

}
