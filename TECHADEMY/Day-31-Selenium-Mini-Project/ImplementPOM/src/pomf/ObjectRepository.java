package pomf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectRepository {
	WebDriver driver;
	
	By Username = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By Password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By Login = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By ForgetPwd = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	
	public ObjectRepository(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchURL(String url) {
		driver.get(url);
	}

	public void typeUsername(String Uname) {
		driver.findElement(Username).sendKeys(Uname);
	}

	public String getUsername() {
		return driver.findElement(Username).getAttribute("value");
	}
	
	public void typePassword(String Pass) {
		driver.findElement(Password).sendKeys(Pass);
	}
	
	public String getPassword() {
		return driver.findElement(Password).getAttribute("value");
	}
	
	public void clickLogin() {
		driver.findElement(Login).click();
	}
	
	public boolean checkLoginEnable() {
		return driver.findElement(Login).isEnabled();
	}
	
	public boolean checkForgotPasswordEnable() {
		return driver.findElement(ForgetPwd).isEnabled();
	}
	
}
