package LEARING.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import LEARING.Pages.LoginPage;
import LEARING.Pages.ProductPage;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickConfirm();
        loginPage.clickLoginBtn();
        loginPage.enterEmail("pcaskinpro_git_nonprod+RegUser01@colpal.com");
        loginPage.enterPassword("TestimQA@2024");
        loginPage.clickFinalLogin();
        System.out.println("Login successful!");
        
        loginPage.verifyEltaMDLogoVisible();
        
        Thread.sleep(5000);

        // Product
        ProductPage productPage = new ProductPage(driver);
        productPage.selectEltaMD();
        productPage.goToShop();
        
        Thread.sleep(5000);
        
        productPage.verifyProductTitleVisible();
        
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
}
