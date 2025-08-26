package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverSetup;

public class LoginPage {
	static WebDriver driver;
	String baseUrl = "https://amazon.in/";
	
	
    @FindBy(xpath = "//button[@class='a-button-text']")
    private WebElement submitButton;
    
    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement loginButton;
    
    @FindBy(id = "ap_email_login")
    private WebElement emailField;
    
    @FindBy(xpath = "//input[@class='a-button-input']")
    private WebElement continueButton;
    
    @FindBy(id = "ap_password")
    private WebElement passwordField;
    
    @FindBy(xpath = "//input[@id='signInSubmit' and @class='a-button-input']")
    private WebElement submitLoginButton;
	
	
	public void setDriver() {
		driver = DriverSetup.getDriver();
		driver.get(baseUrl);
	}
	
	public void clickLogin() throws InterruptedException {
//		WebElement submit = driver.findElement(By.xpath("//button[@class='a-button-text']"));
//		submit.click();
//		WebElement loginBtn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		loginBtn.click();
//		WebElement email = driver.findElement(By.id("ap_email_login"));
//		email.sendKeys("someone123@gmail.com");
//		WebElement continueBtn = driver.findElement(By.className("a-button-input"));
//		continueBtn.click();
//		WebElement password = driver.findElement(By.id("ap_password"));
//		password.sendKeys("pass2345");
//		WebElement submitBtn = driver.findElement(By.className("a-button-input"));
//		submitBtn.click();
		
		submitButton.click();
		Thread.sleep(100);
		loginButton.click();
		Thread.sleep(232);
		emailField.sendKeys("someone123@gmail.com");
		continueButton.click();
		Thread.sleep(72);
		passwordField.sendKeys("pass2134");
		submitLoginButton.click();
		Thread.sleep(2000);
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
