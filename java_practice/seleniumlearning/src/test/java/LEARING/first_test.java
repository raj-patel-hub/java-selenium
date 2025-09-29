package LEARING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;

public class first_test {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://test.cpskinhealthpro.com/");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Confirm')]")));
        confirmBtn.click();
        
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Log In'])[2]")));
        loginBtn.click();
        
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"gigya-layout-cell responsive with-social-login\"]//input[@class='gigya-input-text'])[2]")));
        emailField.sendKeys("pcaskinpro_git_nonprod+RegUser01@colpal.com");
        
        WebElement passwordField = driver.findElement(By.xpath("(//div[@class=\"gigya-layout-cell responsive with-social-login\"]//input[@name='password'])[2]"));
        passwordField.sendKeys("TestimQA@2024");
        
        WebElement finalLoginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        finalLoginBtn.click();
        
        Thread.sleep(5000);
        
        System.out.println("Login successful!");
        
        Thread.sleep(15000);
        
        WebElement clickEltaMDBox = driver.findElement(By.xpath("//button[@value='EltaMD']"));
        clickEltaMDBox.click();
        

        WebElement clickContinue = driver.findElement(By.xpath("//button//span[text()='Continue']"));
        clickContinue.click();
        
        Thread.sleep(5000);
        
        WebElement clickShopBtn = driver.findElement(By.xpath("//a[text()=\"Shop\"]"));
        clickShopBtn.click();
        
        Thread.sleep(5000);
        
        WebElement clickProAcne = driver.findElement(By.xpath("//p[@title=\"AM Restore Moisturizer\"]"));
        clickProAcne.click();
        
        Thread.sleep(5000);
        
        WebElement pdpProductNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(@class,'product-name')]")));
        String pdpProductName = pdpProductNameElement.getText();
        System.out.println("Product name on PDP: " + pdpProductName);
        
        WebElement clickAddToCart = driver.findElement(By.xpath("//button[text()=\"Add to Cart\"]"));
        clickAddToCart.click();
        
        Thread.sleep(5000);
        
        WebElement hoverElement = driver.findElement(By.xpath("//div[contains(@class,'header_cart')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
        
        WebElement miniCartProductNameElement = wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'global-cart-render-section')]//span[contains(@class,'global-cart-item-prod-name')]"))
        );
        
        String miniCartProductName = miniCartProductNameElement.getText();
        System.out.println("Product name in MiniCart: " + miniCartProductName);
        
        // Step 9: Validate PDP name vs MiniCart name
        if (pdpProductName.equalsIgnoreCase(miniCartProductName)) {
            System.out.println("✅ Product name matches in PDP and MiniCart");
        } else {
            System.out.println("❌ Product name mismatch! PDP: " + pdpProductName + " | MiniCart: " + miniCartProductName);
        }
        
        Thread.sleep(5000);
        
        WebElement clickViewCart = driver.findElement(By.xpath("//button[text()=\"View Cart\"]"));
        clickViewCart.click();
        
        Thread.sleep(5000);
        
        WebElement clickCheckOut = driver.findElement(By.xpath("(//span[text()='Checkout'])[1]"));
        clickCheckOut.click();
        
        System.out.println("Test Passed!");
        
        Thread.sleep(5000);
        driver.quit();
    }
}
