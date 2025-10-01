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
    public static final By ProductTitle = By.xpath("(//div[text()=\"All Products\"]");
    public static By increaseQtyBtn = By.xpath("(//span[contains(@class,'increase-icon')])[1]");
    public static By decreaseQtyBtn = By.xpath("(//span[contains(@class,'decrease-icon')])[1]");
    public static By quantityField = By.xpath("(//span[contains(@class,'current-qty')])[2]");
    public static By EltaMDLogo   = By.xpath("//li[contains(@class,'eltamd-brand')]");
    public static By miniCartRemoveButton   = By.xpath("(//div[text()='Remove'])[1]");
    //public static By miniCartItems = By.xpath("(//div[@class='flex global-cart-items-section'])[1]");
    //public static By removeButton = By.xpath("//a[contains(text(),'Remove')]");
    public static By emptyCartMessage = By.xpath("//div[text()='There's nothing here yet.']");
    public static By cartText = By.xpath("//h1[text()='Cart']");
    public static By emptyCartText = By.xpath("//strong[text()='Your cart is currently empty.']");




}
