package sasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebCRM {
	public static void main(String[] args) {
		WebDriver driver;
		try {
			System.setProperty("webdriver.gecko.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\geckodriver-v0.36.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			Thread.sleep(794);
			
			WebElement uname = driver.findElement(By.id("username"));
			uname.sendKeys("salesforce1234@agentforce.com");
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("password123");
			
			driver.findElement(By.id("Login")).click();
			
			Thread.sleep(3000);
			driver.quit();
		}
		catch(Exception e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}
	}
	
}
