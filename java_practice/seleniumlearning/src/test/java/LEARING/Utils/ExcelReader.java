package LEARING.Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static String getCellData(String filePath, String sheetName, int rowNum, int cellNum) {
        String cellValue = "";
        DataFormatter formatter = new DataFormatter();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) return "";

            Row row = sheet.getRow(rowNum);
            if (row == null) return "";

            Cell cell = row.getCell(cellNum);
            if (cell == null) return "";

            cellValue = formatter.formatCellValue(cell).trim();

        } catch (IOException e) {
            System.err.println("Error reading Excel file: " + e.getMessage());
        }

        return cellValue;
    }
}