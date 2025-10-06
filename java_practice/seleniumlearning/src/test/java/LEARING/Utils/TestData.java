package LEARING.Utils;

public class TestData {
    public static final String EXCEL_PATH = "C:/Users/Unity_0122/IdeaProjects/java-learning/java-selenium/java_practice/seleniumlearning/src/resources/LoginData.xlsx";
    public static final String SHEET_NAME = "Sheet1";

    // Global reusable data
    public static final String EMAIL = ExcelReader.getCellData(EXCEL_PATH, SHEET_NAME, 1, 0);
    public static final String PASSWORD = ExcelReader.getCellData(EXCEL_PATH, SHEET_NAME, 1, 1);
}