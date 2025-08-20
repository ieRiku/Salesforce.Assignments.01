package ddt1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks3 {
    
    public static void main(String[] args) throws InterruptedException { 
    	System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(1000);

        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

        int numberOfLinks = allLinks.size();

        System.out.println("Total number of links found: " + numberOfLinks);
        Thread.sleep(893);
        driver.quit();
    }
}