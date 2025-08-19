package testSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FourthSelenium {

    public static void main(String[] args){
        WebDriver driver = null;
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://amazon.in/");
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            Actions actions = new Actions(driver);
            
            // mobile phone search
            WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
            actions.moveToElement(searchBox).click().sendKeys("mobile phone").sendKeys(Keys.ENTER).perform();
            
            // add product
            WebElement firstProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal")));
            String firstProductName = firstProduct.getText();
            System.out.println("First Product Name: " + firstProductName);

            // Click on first product using Actions class
            actions.moveToElement(firstProduct).click().perform();

            // Switch to new tab if opened
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

            // Step 4: Add product to cart
            WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
            actions.moveToElement(addToCartBtn).click().perform();

            // Step 5: Go to cart
            WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart")));
            actions.moveToElement(cartBtn).click().perform();

            // Step 6: Verify product in cart (using Actions)
            WebElement cartItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-truncate-cut")));
            String cartProductName = cartItem.getText();
            System.out.println("Product in Cart: " + cartProductName);

            if(cartProductName.contains(firstProductName)) {
                System.out.println("Verification Success: Product added.");
            } else {
                System.out.println("Verification Failed: Product names do not match.");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(driver != null) {
                driver.quit();
            }
        }
    }
}
