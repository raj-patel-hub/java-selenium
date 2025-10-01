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

    public void verifyProductTitleVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductLocators.ProductTitle)).isDisplayed();
    }

    public void increaseQuantity() {
        WebElement plusButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.increaseQtyBtn));
        plusButton.click();
        wait.until(driver -> getProductQuantity() > 1); // wait until value updates
    }

    public void decreaseQuantity() {
        WebElement minusButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.decreaseQtyBtn));
        minusButton.click();
        wait.until(driver -> getProductQuantity() == 1); // wait until value updates
    }

    public int getProductQuantity() {
        WebElement qtyField = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductLocators.quantityField));
        String qtyValue = qtyField.getText();

        if (qtyValue.isEmpty()) {
            throw new RuntimeException("❌ Quantity value is empty for locator: " + ProductLocators.quantityField.toString());
        }

        return Integer.parseInt(qtyValue);
    }

    public void hoverToEltaMDLogo() {
        WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductLocators.EltaMDLogo));
        actions.moveToElement(logoElement).perform();
    }


    // ✅ Method to remove product from mini cart
    public void removeProductFromMiniCart() {
        WebElement removeBtn = wait.until(
                ExpectedConditions.elementToBeClickable(ProductLocators.miniCartRemoveButton)
        );
        removeBtn.click();
        System.out.println("Clicked on Remove button");
    }

    // ✅ Method to verify empty cart message
    public boolean verifyEmptyCartMessage() {
        WebElement emptyMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ProductLocators.emptyCartMessage)
        );
        return emptyMsg.isDisplayed();
    }

    public boolean verifyCartHeadingVisible() {
        WebElement emptyMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ProductLocators.cartText)
        );
        return emptyMsg.isDisplayed();
    }

    public boolean verifyEmptyCartMessageVisible() {
        WebElement emptyMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ProductLocators.emptyCartText)
        );
        return emptyMsg.isDisplayed();
    }
}


