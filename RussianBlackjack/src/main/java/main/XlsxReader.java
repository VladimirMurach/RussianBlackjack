package main;

import cards.Card;
import cards.Isotope;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxReader {

    public ArrayList<Card> readDeck(ArrayList<Isotope> isotopes, ArrayList<Card> deck) {
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook("deck.xlsx");
            Sheet sheet = workbook.getSheetAt(0);
            int j = 0;
            for (Row row : sheet) {
                Isotope isotope = isotopes.get(Integer.parseInt(row.getCell(0).getStringCellValue()));
                for (int i = j; i < 4 + j; i++) {
                    deck.get(i).setIsotope(isotope);
                }
                j += 4;
            }
        } catch (IOException e) {

        } finally {
            try {
                workbook.close();
            } catch (IOException e) {

            }
        }
        return deck;
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
}
