package LEARING.Locator;

import org.openqa.selenium.By;

public class ProductLocators {
    public static final By eltaMDBox = By.xpath("//button[@value='EltaMD']");
    public static final By continueBtn = By.xpath("//button//span[text()='Continue']");
    public static final By shopBtn = By.xpath("//a[text()=\"Shop\"]");
    public static final By product = By.xpath("(//a[@class=\"block group focus-visible:border focus-visible:border-primary-400\"])[1]");
    public static final By pdpProductName = By.xpath("//h1[contains(@class,'product-name')]");
    public static final By addToCartBtn = By.xpath("//button[text()=\"Add to Cart\"]");
    public static final By hoverCart = By.xpath("//div[contains(@class,'header_cart')]");
    public static final By miniCartProductName = By.xpath("//div[contains(@class,'global-cart-render-section')]//span[contains(@class,'global-cart-item-prod-name')]");
    public static final By viewCartBtn = By.xpath("//button[text()=\"View Cart\"]");
    public static final By checkoutBtn = By.xpath("(//span[text()='Checkout'])[1]");
}
