package main;

import cards.Card;
import cards.Deck;
import cards.Isotope;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxReader {

    public void readDecks(ArrayList<Isotope> isotopes, ArrayList<Deck> decks) {
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook("deck.xlsx");
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                Deck deck = new Deck();
                deck.setName(row.getCell(0).getStringCellValue());
                deck.setCreationDate(row.getCell(1).getDateCellValue());
                ArrayList<Card> cards = createDeck();
                for (int i = 0; i < 9; i++) {
                    Isotope isotope = isotopes.get(Integer.parseInt(row.getCell(2 + i).getStringCellValue()));
                    for (int j = i * 4; j < 4 + i * 4; j++) {
                        cards.get(j).setIsotope(isotope);
                    }
                }
                deck.setCards(cards);
                decks.add(deck);
            }
        } catch (IOException e) {

        } finally {
            try {
                workbook.close();
            } catch (IOException e) {

            }
        }
    }

    public ArrayList<Isotope> readIsotopes() {
        Workbook workbook = null;
        ArrayList<Isotope> isotopes = new ArrayList<>();
        try {
            workbook = new XSSFWorkbook("isotopes.xlsx");
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i < 21; i++) {
                Row row = sheet.getRow(i);
                String name = row.getCell(0).getStringCellValue();
                double halfLife = row.getCell(1).getNumericCellValue();
                double energy = row.getCell(2).getNumericCellValue();
                isotopes.add(new Isotope(name, halfLife, energy, i - 1));
            }
        } catch (IOException e) {

        } finally {
            try {
                workbook.close();
            } catch (IOException e) {

            }
        }
        return isotopes;
    }

    public int[] readUser() {
        int[] userInfo = new int[3];
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook("user.xlsx");
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            for (int i = 0; i < 3; i++) {
                userInfo[i] = Integer.parseInt(row.getCell(i).getStringCellValue());
            }
        } catch (IOException e) {

        } finally {
            try {
                workbook.close();
            } catch (IOException e) {

            }
        }
        return userInfo;
    }

    public ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
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
        return deck;
    }
}
