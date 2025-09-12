package basicSeleniumJava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeventhSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = null;
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/alerts/");
			
			WebElement e1 = driver.findElement(By.id("alertButton"));		
			WebElement e2 = driver.findElement(By.id("confirmButton"));
			WebElement e3 = driver.findElement(By.id("promtButton"));
			
			e1.click();
			Alert a = driver.switchTo().alert();
			a.accept();
			
			Thread.sleep(1000);
			
			e2.click();
			a.dismiss();
			
			Thread.sleep(1000);
			
			e3.click();
			a.sendKeys("aldfls");
			Thread.sleep(1000);
			a.accept();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}
}
