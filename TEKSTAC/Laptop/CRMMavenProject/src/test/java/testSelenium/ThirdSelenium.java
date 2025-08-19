package testSelenium;

import java.net.SocketException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdSelenium {

	public static void main(String[] args){
		WebDriver driver = null;
		try {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			WebElement dropdown = driver.findElement(By.id("day"));
			Select s1 = new Select(dropdown);
			
			s1.selectByIndex(4);
			Thread.sleep(1000);
			s1.selectByValue("10");
			Thread.sleep(1000);
			s1.selectByVisibleText("24");
			Thread.sleep(1000);
			//s1.deselectByVisibleText("24"); // throws socketexception
			
			List<WebElement> ls = s1.getOptions();
			for(WebElement e : ls) {
				System.out.println(e.getText());
			}
			
			Thread.sleep(1000);
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.elementToBeClickable(By.id("day")));
			System.out.println("Ended");

		}
		catch(Exception e){
			
		}
		finally{
			if(driver != null) {
				driver.quit();
			}
		}
	}

}
