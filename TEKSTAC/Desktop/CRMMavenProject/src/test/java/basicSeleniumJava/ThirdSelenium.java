package basicSeleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			Thread.sleep(1000);
			WebElement table = driver.findElement(By.xpath("//table[@id = 'customers']"));
			List<WebElement> headings = table.findElements(By.tagName("th"));
			
			for(WebElement w: headings) {
				System.out.println("Text: " + w.getText());
			}
			
			driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(driver != null) {
				driver.quit();
			}
		}
	}

}
