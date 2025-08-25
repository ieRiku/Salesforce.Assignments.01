package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.DriverSetup;

public class LoginPage {
	static WebDriver driver;
	String baseUrl = "https://amazon.in/";
	
	public void setDriver() {
		driver = DriverSetup.getDriver();
		driver.get(baseUrl);
	}
	
	public void clickLogin() {
		WebElement submit = driver.findElement(By.xpath("//button[@class='a-button-text']"));
		submit.click();
		WebElement loginBtn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		loginBtn.click();
		WebElement email = driver.findElement(By.id("ap_email_login"));
		email.sendKeys("someone123@gmail.com");
		WebElement continueBtn = driver.findElement(By.className("a-button-input"));
		continueBtn.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("pass2345");
		WebElement submitBtn = driver.findElement(By.className("a-button-input"));
		submitBtn.click();
	}
	
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		try {
			lp.setDriver();
			lp.clickLogin();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			//driver.quit();
		}
	}
}
