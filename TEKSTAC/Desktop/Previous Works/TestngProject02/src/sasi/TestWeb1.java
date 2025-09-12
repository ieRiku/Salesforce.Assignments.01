package sasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWeb1 {
  @Test
  
	public void verifyTitle() {
	  	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Page title: "+ pageTitle);
		
		Assert.assertEquals(pageTitle, "Salesforce");
		
		
		driver.close();
	}
}
