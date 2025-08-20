package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureURL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
			
			Thread.sleep(1945);
			
			WebElement element1 = driver.findElement(By.id("APjFqb"));
			element1.sendKeys("India");
			Thread.sleep(212);
			
			driver.findElement(By.className("gNO89b")).click();
			//element1.sendKeys(Keys.ENTER);	// It works too.
			
			String IndiaURL = driver.getCurrentUrl();
			
			//get back to previous page (back button press);
			driver.navigate().back();
			
			//Thread.sleep(1000);
			driver.quit();
			
			System.out.println("URL of page India: "+ IndiaURL);
			
		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
}
