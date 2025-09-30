package LEARING.Pages;

import LEARING.Locator.LoginLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickConfirm() {
        wait.until(ExpectedConditions.elementToBeClickable(LoginLocators.confirmBtn)).click();
    }

    public void clickLoginBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(LoginLocators.loginBtn)).click();
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLocators.emailField)).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginLocators.passwordField).sendKeys(password);
    }

    public void clickFinalLogin() {
        driver.findElement(LoginLocators.finalLoginBtn).click();
    }
}