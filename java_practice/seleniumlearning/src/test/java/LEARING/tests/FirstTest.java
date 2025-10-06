package LEARING.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import LEARING.Pages.LoginPage;
import LEARING.Pages.ProductPage;
import LEARING.Utils.TestData;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        // Run First Test
        runProductFlowTest(); // Verify Product Purchase Flow: Login → Select EltaMD → Add to Cart → Checkout

        // Run Second Test
        SecondTest(); // Validate EltaMD Product Flow with Quantity Increase/Decrease in Cart

        // Run Third Test
        ThirdTest();

        // Run Fourth Test
        FourthTest();

        // Run Fifth Test
        FiFthTest();

        // Run Sixth Test
        SixthTest();

    }

    public static void runProductFlowTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickConfirm();
        loginPage.clickLoginBtn();
        loginPage.enterEmail(TestData.EMAIL);
        loginPage.enterPassword(TestData.PASSWORD);
        loginPage.clickFinalLogin();
        System.out.println("Login successful!");

        loginPage.verifyEltaMDLogoVisible();

        Thread.sleep(5000);

        // Product
        ProductPage productPage = new ProductPage(driver);
        productPage.selectEltaMD();
        productPage.goToShop();

        Thread.sleep(5000);

        productPage.hoverToEltaMDLogo();

        productPage.openProduct();

        Thread.sleep(5000);

        String pdpName = productPage.getPdpProductName();
        System.out.println("Product name on PDP: " + pdpName);

        productPage.addToCart();
        String miniCartName = productPage.getMiniCartProductName();
        System.out.println("Product name in MiniCart: " + miniCartName);

        if (pdpName.equalsIgnoreCase(miniCartName)) {
            System.out.println("✅ Product name matches in PDP and MiniCart");
        } else {
            System.out.println("❌ Product name mismatch!");
        }

        productPage.viewCartAndCheckout();
        System.out.println("Test Passed!");

        driver.quit();
    }

    public static void SecondTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickConfirm();
        loginPage.clickLoginBtn();
        loginPage.enterEmail(TestData.EMAIL);
        loginPage.enterPassword(TestData.PASSWORD);
        loginPage.clickFinalLogin();
        System.out.println("Login successful!");

        loginPage.verifyEltaMDLogoVisible();

        Thread.sleep(5000);

        // Product
        ProductPage productPage = new ProductPage(driver);
        productPage.selectEltaMD();
        productPage.goToShop();

        Thread.sleep(5000);

        productPage.hoverToEltaMDLogo();

        productPage.openProduct();

        Thread.sleep(5000);

        String pdpName = productPage.getPdpProductName();
        System.out.println("Product name on PDP: " + pdpName);

        productPage.addToCart();
        String miniCartName = productPage.getMiniCartProductName();
        System.out.println("Product name in MiniCart: " + miniCartName);

        if (pdpName.equalsIgnoreCase(miniCartName)) {
            System.out.println("✅ Product name matches in PDP and MiniCart");
        } else {
            System.out.println("❌ Product name mismatch!");
        }

        Thread.sleep(15000);

        int initialQty = productPage.getProductQuantity();
        System.out.println("Initial Quantity: " + initialQty);


        productPage.increaseQuantity();
        Thread.sleep(2000);
        int increasedQty = productPage.getProductQuantity();
        System.out.println("Quantity after + click: " + increasedQty);


        productPage.decreaseQuantity();
        Thread.sleep(2000);
        int decreasedQty = productPage.getProductQuantity();
        System.out.println("Quantity after - click: " + decreasedQty);


        if (increasedQty == initialQty + 1) {
            System.out.println("✅ Quantity increased correctly");
        } else {
            System.out.println("❌ Quantity did not increase");
        }

        if (decreasedQty == increasedQty - 1) {
            System.out.println("✅ Quantity decreased correctly");
        } else {
            System.out.println("❌ Quantity did not decrease");
        }

        System.out.println("Test Passed!");

        driver.quit();
    }


    public static void ThirdTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickConfirm();
        loginPage.clickLoginBtn();
        loginPage.enterEmail(TestData.EMAIL);
        loginPage.enterPassword(TestData.PASSWORD);
        loginPage.clickFinalLogin();
        System.out.println("Login successful!");

        loginPage.verifyEltaMDLogoVisible();

        Thread.sleep(5000);

        // Product
        ProductPage productPage = new ProductPage(driver);
        productPage.selectEltaMD();
        productPage.goToShop();

        Thread.sleep(5000);

        productPage.hoverToEltaMDLogo();

        productPage.openProduct();

        Thread.sleep(5000);

        String pdpName = productPage.getPdpProductName();
        System.out.println("Product name on PDP: " + pdpName);

        productPage.addToCart();
        String miniCartName = productPage.getMiniCartProductName();
        System.out.println("Product name in MiniCart: " + miniCartName);

        if (pdpName.equalsIgnoreCase(miniCartName)) {
            System.out.println("✅ Product name matches in PDP and MiniCart");
        } else {
            System.out.println("❌ Product name mismatch!");
        }

        Thread.sleep(15000);

        productPage.removeProductFromMiniCart();

        Thread.sleep(10000);

        if (productPage.verifyEmptyCartMessage()) {
            System.out.println("✅ Verified: 'There's nothing here yet.' message is visible");
        } else {
            System.out.println("❌ Empty cart message not found!");
        }

        System.out.println("Test Passed!");
        driver.quit();
    }

    public static void FourthTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickConfirm();
        loginPage.clickLoginBtn();
        loginPage.enterEmail(TestData.EMAIL);
        loginPage.enterPassword(TestData.PASSWORD);
        loginPage.clickFinalLogin();
        System.out.println("Login successful!");

        loginPage.verifyEltaMDLogoVisible();

        Thread.sleep(5000);

        // Product
        ProductPage productPage = new ProductPage(driver);
        productPage.selectEltaMD();
        productPage.goToShop();

        Thread.sleep(5000);

        productPage.hoverToEltaMDLogo();

        productPage.openProduct();

        Thread.sleep(5000);

        String pdpName = productPage.getPdpProductName();
        System.out.println("Product name on PDP: " + pdpName);

        productPage.addToCart();
        String miniCartName = productPage.getMiniCartProductName();
        System.out.println("Product name in MiniCart: " + miniCartName);

        if (pdpName.equalsIgnoreCase(miniCartName)) {
            System.out.println("✅ Product name matches in PDP and MiniCart");
        } else {
            System.out.println("❌ Product name mismatch!");
        }

        Thread.sleep(15000);

        productPage.removeProductFromMiniCart();

        Thread.sleep(10000);

        if (productPage.verifyEmptyCartMessage()) {
            System.out.println("✅ Verified: 'There's nothing here yet.' message is visible");
        } else {
            System.out.println("❌ Empty cart message not found!");
        }

        productPage.cLickViewCart();

        productPage.verifyCartHeadingVisible();

        productPage.verifyEmptyCartMessageVisible();

        System.out.println("Test Passed!");
        driver.quit();
    }


    public static void FiFthTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickConfirm();
        loginPage.clickLoginBtn();
        loginPage.enterEmail(TestData.EMAIL);
        loginPage.enterPassword(TestData.PASSWORD);
        loginPage.clickFinalLogin();
        System.out.println("Login successful!");

        loginPage.verifyEltaMDLogoVisible();

        Thread.sleep(5000);

        // Product
        ProductPage productPage = new ProductPage(driver);
        productPage.selectEltaMD();
        productPage.goToShop();

        Thread.sleep(5000);

        productPage.hoverToEltaMDLogo();


        // Filter
        productPage.cLickClearALlFilter();
        Thread.sleep(5000);

        productPage.cLickSideFilterBestSeller();
        Thread.sleep(5000);

        productPage.cLickSideFilterBestSellerLabel();
        Thread.sleep(5000);

        productPage.verifyBestSellerMainTagVisible();
        Thread.sleep(5000);

        productPage.verifyBestSellerLabelsForAllProducts();


        System.out.println("Test Passed!");
        driver.quit();

    }


    public static void SixthTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickConfirm();
        loginPage.clickLoginBtn();
        loginPage.enterEmail(TestData.EMAIL);
        loginPage.enterPassword(TestData.PASSWORD);
        loginPage.clickFinalLogin();
        System.out.println("Login successful!");

        loginPage.verifyEltaMDLogoVisible();

        Thread.sleep(5000);

        // Product
        ProductPage productPage = new ProductPage(driver);
        productPage.selectEltaMD();
        productPage.goToShop();

        Thread.sleep(5000);

        productPage.hoverToEltaMDLogo();
        String storedProduct = productPage.addProductToFavoriteAndGetName();

        Thread.sleep(5000);

        if (productPage.verifyProductInFavorites(storedProduct)) {
            System.out.println("✅ Product successfully added to Favorites!");
        } else {
            System.out.println("❌ Product not found in Favorites!");
        }

        productPage.cLickRemoveButtonAndVerifyPopup();
        System.out.println("Test Passed!");
        driver.quit();

    }

}
