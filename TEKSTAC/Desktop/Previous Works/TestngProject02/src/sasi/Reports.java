package sasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Reports {
	WebDriver driver;
	@Test(priority=1)
	void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void verifyGoogle() {
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority=3)
	public void verifyYahoo() {
		driver.get("https://www.yahoo.co.in/");
		//Assert.assertEquals(driver.getTitle(), "Yahoo");
	}
	
	@Test(priority=4)
	public void verifyFacebook() {
		driver.get("https://facebook.com/");
		//Assert.assertEquals(driver.getTitle(), "facebook");
	}
	
	@Test(priority=15)
	public void closeBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
