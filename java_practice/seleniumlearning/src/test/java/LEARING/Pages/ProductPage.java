package LEARING.Pages;

import LEARING.Locator.ProductLocators;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

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

    public void verifyCartHeadingVisible() {
        WebElement emptyMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ProductLocators.cartText)
        );
        emptyMsg.isDisplayed();
    }

    public void verifyEmptyCartMessageVisible() {
        WebElement emptyMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ProductLocators.emptyCartText)
        );
        emptyMsg.isDisplayed();
    }

    public void cLickViewCart() {
        WebElement viewCartButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.viewCartBtn));
        viewCartButton.click();
    }

    public void cLickClearALlFilter() {
        WebElement ClearALlFilter = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.clearAllButton));
        ClearALlFilter.click();
    }

    public void cLickSideFilterBestSeller() {
        WebElement SideFilterBestSeller = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.bestSellerSideFilter));
        SideFilterBestSeller.click();
    }

    public void cLickSideFilterBestSellerLabel() {
        WebElement SideFilterBestSellerLabel = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.bestSellerSideFilterLabel));
        SideFilterBestSellerLabel.click();
    }

    public void verifyBestSellerMainTagVisible() {
        WebElement BestSellerMainTag = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ProductLocators.bestSellerMainFilter)
        );
        BestSellerMainTag.isDisplayed();
    }

    public void verifyBestSellerLabelsForAllProducts() {
        List<WebElement> productImages = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(ProductLocators.productImages)
        );

        System.out.println("Total products found: " + productImages.size());

        for (int i = 0; i < productImages.size(); i++) {
            try {
                WebElement parentTile = productImages.get(i).findElement(ProductLocators.productImages);

                WebElement label = parentTile.findElement(ProductLocators.bestSellerLabels);

                if (label.isDisplayed()) {
                    System.out.println("✅ Product " + (i + 1) + " has Best-seller label");
                }
            } catch (NoSuchElementException e) {
                System.out.println("❌ Product " + (i + 1) + " is missing Best-seller label");
            }
        }
    }

    public void cLickFavoriteButton() {
        WebElement FavoriteButton = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.Favorite));
        FavoriteButton.click();
    }

    public void cLickHomeUserIcon() {
        WebElement HomeUserIcon = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.HomeUserIcon));
        HomeUserIcon.click();
    }

    public String addProductToFavoriteAndGetName() {
        // Get product name from PDP
        WebElement productNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                ProductLocators.product
        ));
        String productName = productNameElement.getText().trim();

        // Print product name in console
        System.out.println("🛍️ Product added to favorites: " + productName);

        // Click Favorite button
        WebElement favoriteBtn = wait.until(ExpectedConditions.elementToBeClickable(
                ProductLocators.Favorite
        ));
        favoriteBtn.click();

        // Wait for popup confirmation
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductLocators.addedToFavoritePopup));

        return productName;
    }


    public boolean verifyProductInFavorites(String expectedProductName) throws InterruptedException {

        Thread.sleep(5000);

        // Click Home User Icon
        WebElement HomeUserIcon = wait.until(ExpectedConditions.elementToBeClickable(ProductLocators.HomeUserIcon));
        HomeUserIcon.click();

        // Navigate to Favorites page
        WebElement favMenu = wait.until(ExpectedConditions.elementToBeClickable(
                ProductLocators.UserIconFavorite
        ));
        favMenu.click();

        // Get first product name in Favorites
        WebElement favProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(
                ProductLocators.favoriteProductName
        ));
        // Wait for actual text content
        wait.until(driver -> !favProduct.getText().trim().isEmpty());

        String actualProductName = favProduct.getText().trim();

        // Print both expected and actual names
        System.out.println("🧾 Expected Product Name: " + expectedProductName);
        System.out.println("❤️ Product Found in Favorites: " + actualProductName);

        // Compare and return result
        boolean match = actualProductName.equalsIgnoreCase(expectedProductName);

        if (match) {
            System.out.println("✅ Product successfully verified in Favorites!");
        } else {
            System.out.println("❌ Product mismatch! Expected: " + expectedProductName + ", but found: " + actualProductName);
        }

        return match;
    }


    public void cLickRemoveButtonAndVerifyPopup() {
        WebElement removeFromFavoriteBtn = wait.until(ExpectedConditions.elementToBeClickable(
                ProductLocators.RemoveFromFavoriteButton
        ));
        removeFromFavoriteBtn.click();

        // Wait for popup confirmation
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductLocators.RemoveFromFavoritePopup));
    }

}


