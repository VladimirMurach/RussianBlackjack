package main;

import cards.Card;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxWriter {

    public void writeDeck(ArrayList<Card> deck) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Лист1");
        for (int i = 0; i < 9; i++) {
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(Integer.toString(deck.get(i * 4).getIsotope().getNumber()));
        }
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("deck.xlsx");
            workbook.write(fos);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                workbook.close();
            } catch (IOException ex) {

            }
        }
    }
    
    public void writeUserInfo(int[] userInfo) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Лист1");
        Row row = sheet.createRow(0);
        for (int i = 0; i < 3; i++) {
            row.createCell(i).setCellValue(Integer.toString(userInfo[i]));
        }
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("user.xlsx");
            workbook.write(fos);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                workbook.close();
            } catch (IOException ex) {

            }
        }
    }
}
