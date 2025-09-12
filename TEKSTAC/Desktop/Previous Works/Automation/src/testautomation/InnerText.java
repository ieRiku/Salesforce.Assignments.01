package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://linkedin.com");
			Thread.sleep(945);
			
			WebElement e = driver.findElement(By.className("header"));
			
			System.out.println(e.getText());
			

			Thread.sleep(234);
			driver.quit();

		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
}
