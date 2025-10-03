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
    public static By emptyCartMessage = By.xpath("//div[contains(@class,'global-cart-empty-view')]");
    public static By cartText = By.xpath("//h1[text()='Cart']");
    public static By emptyCartText = By.xpath("//strong[text()='Your cart is currently empty.']");
    public static By clearAllButton = By.xpath("(//button[text()='Clear All'])[2]");
    public static By bestSellerSideFilter = By.xpath("//h3[text()='Best Seller']");
    public static By bestSellerSideFilterLabel = By.xpath("//label[text()='Best Seller']");
    public static By bestSellerMainFilter = By.xpath("//div[text()='Best Seller']");
    public static By productImages = By.xpath("//div[contains(@class,'product-card-main-wrapper')]");
    public static By bestSellerLabels = By.xpath("//span[text()='Best-seller']");
    public static By Favorite = By.xpath("(//div[text()='Favorite'])[1]");
    public static By addedToFavoritePopup = By.xpath("//div[contains(text(),'Added To Favorite')]");
    public static By HomeUserIcon = By.xpath("//span[contains(@class,'brand-navigation-header_user-icon')]");
    public static By UserIconFavorite = By.xpath("(//a[text()='Favorites'])[1]");
    public static By favoriteProductName = By.xpath("//p[contains(@class,'product-name')]");
    public static By RemoveFromFavoriteButton = By.xpath("//div[text()='Remove from Favorites']");
    public static By RemoveFromFavoritePopup = By.xpath("//div[contains(text(),'Removed From Favorite')]");







}
