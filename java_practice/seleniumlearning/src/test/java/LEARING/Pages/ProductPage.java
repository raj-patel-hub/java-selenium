package LEARING.Pages;

import LEARING.Locator.ProductLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public void selectEltaMD() {
        WebElement eltaMD = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.eltaMDBox));
        eltaMD.click();

        WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.continueBtn));
        continueBtn.click();
    }

    public void goToShop() {
        WebElement shopButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.shopBtn));
        shopButton.click();
    }

    public void openProduct() {
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.product));
        product.click();
    }

    public String getPdpProductName() {
        WebElement pdpProductNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductLocators.pdpProductName));
        return pdpProductNameElement.getText();
    }

    public void addToCart() {
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.addToCartBtn));
        addToCartButton.click();
    }

    public String getMiniCartProductName() {
        WebElement hoverCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductLocators.hoverCart));
        actions.moveToElement(hoverCartElement).perform();

        WebElement miniCartProductNameElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(ProductLocators.miniCartProductName)
        );
        return miniCartProductNameElement.getText();
    }

    public void viewCartAndCheckout() {
        WebElement viewCartButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.viewCartBtn));
        viewCartButton.click();

        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.checkoutBtn));
        checkoutButton.click();
    }
}  // <-- ✅ missing closing bracket for class added

