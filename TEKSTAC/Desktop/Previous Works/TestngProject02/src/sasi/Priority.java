package sasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Priority {
	WebDriver driver;
	
	@Test(priority=1)
	public void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	
		}
		catch(Exception e) {
			System.out.println("Error occurred");
		}
	}
	
	@Test(priority=10)
	public void closeBrowser() {
	    if (driver != null) {
	        driver.quit();
	    }
	}
	@Test(priority=2)
	public void verifyGoogleTitle() {
		driver.get("https://google.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Google");
	}
	
	@Test(priority=3)
	public void verifyYahooTitle() {
		driver.get("https://in.yahoo.com/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Yahoo Search - Web Search");
	}
}
