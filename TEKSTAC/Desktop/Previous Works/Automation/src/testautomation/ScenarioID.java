package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://sso.godaddy.com/?realm=idp&app=venture-redirector&path=%2F");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement element1 = driver.findElement(By.id("username"));
			WebElement element2 = driver.findElement(By.id("password"));
			
			element1.sendKeys("riku");
			element2.sendKeys("password1234");
			
			Thread.sleep(1000);
			
			boolean isSelected = driver.findElement(By.id("remember-me")).isSelected();
			if(!isSelected) {
				driver.findElement(By.id("remember-me")).click();
				System.out.print("Selected");
			}
			else {
				System.out.println("Selected by default");
			}
			Thread.sleep(1000);
			System.out.println("Stage 1");
			driver.findElement(By.id("submitBtn")).click();
			
			System.out.println("Stage 2");
			Thread.sleep(2000);
			driver.quit();
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
	}
}
