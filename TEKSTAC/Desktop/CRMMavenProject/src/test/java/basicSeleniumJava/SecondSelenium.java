package basicSeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			WebElement email = driver.findElement(By.id("email"));
			WebElement pass = driver.findElement(By.name("pass"));
			WebElement loginBtn = driver.findElement(By.className("_42ft"));
			
			email.sendKeys("test.email@gmail.com");
			pass.sendKeys("pass1234");
			
			Thread.sleep(500);
			loginBtn.click();
			Thread.sleep(500);
			
			driver.navigate().refresh();
			Thread.sleep(500);
			driver.navigate().back();
			Thread.sleep(2000);
			WebElement forgetLink = driver.findElement(By.partialLinkText("Forgotten"));
			WebElement newPageLink = driver.findElement(By.linkText("Create a Page"));
			
			newPageLink.clear();	// Unnecessary added
			
			Thread.sleep(1000);
			forgetLink.click();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(driver != null) {
					driver.close();
				}
			}
			catch(Exception e2) {}
		}
	}

}
