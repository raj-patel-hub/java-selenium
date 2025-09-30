package LEARING.Locator;

import org.openqa.selenium.By;

public class LoginLocators {
    public static final By confirmBtn = By.xpath("//button[contains(text(),'Confirm')]");
    public static final By loginBtn = By.xpath("(//button[text()='Log In'])[2]");
    public static final By emailField = By.xpath("(//div[@class=\"gigya-layout-cell responsive with-social-login\"]//input[@class='gigya-input-text'])[2]");
    public static final By passwordField = By.xpath("(//div[@class=\"gigya-layout-cell responsive with-social-login\"]//input[@name='password'])[2]");
    public static final By finalLoginBtn = By.xpath("//input[@value='Log In']");
}
