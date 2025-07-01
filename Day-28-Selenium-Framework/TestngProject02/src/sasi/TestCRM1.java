package sasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCRM1 {
	WebDriver driver;
	@Test(priority=1)
	public void invokeCRM() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
	
		}
		catch(Exception e) {
			System.out.println("Error occurred");
		}
	}
	
	@Test(priority=2)
	public void captureTitle() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Login | Salesforce");
	}
	
	@Test(priority=3)
	public void checkUserName() {
		driver.findElement(By.id("username")).sendKeys("user1234");
		String userName = driver.findElement(By.id("username")).getAttribute("value");
		Assert.assertEquals(userName, "user1234");
	}
	
	@Test(priority=4)
	public void putPassword() {
		driver.findElement(By.id("password")).sendKeys("pass1235");
	}
	
	@Test(priority=5)
	public void checkLogin() {
		try {
			driver.findElement(By.id("Login")).click();
			String homePage = driver.getTitle();
			Assert.assertEquals(homePage, "Home | Salesforce");
		}
		catch(Throwable e) {
			System.out.println("Error occured");
		}
	}
	
	@Test(priority=10)
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
}
