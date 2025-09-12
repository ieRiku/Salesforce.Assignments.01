package sasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By User = By.id("username");
	By Pwd = By.id("password");
	By LoginButton = By.id("Login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUsername(String uname) {
		driver.findElement(User).sendKeys("rounak1234@gmail.com");
	}

}