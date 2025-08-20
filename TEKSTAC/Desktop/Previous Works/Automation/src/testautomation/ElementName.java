package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://facebook.com");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			String UName = "riku@gmail.com";
			String Passwd = "password1234";
			
			WebElement element1 = driver.findElement(By.name("email"));
			WebElement element2 = driver.findElement(By.name("pass"));
			
			element1.sendKeys(UName);
			element2.sendKeys(Passwd);
			
			Thread.sleep(1000);
			
			driver.findElement(By.name("login")).click();
			
			System.out.println("Stage 2");
			Thread.sleep(2000);
			driver.quit();
		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
}
