package BasePackage;
 
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseClass {
 
	public static WebDriver driver;

	public static void OpenBrowser(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();

		driver.get(url);		

	}

	public static void CloseBrowser() {

		driver.quit();

	}

}

 
package Pages;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
 
public class LoginPage {

	WebDriver driver;
 
	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="userName") WebElement username;

	@FindBy(id="password") WebElement password;

	@FindBy(id="login") WebElement login;

	public void EnterUsername() {

		username.sendKeys("TestUserJava");

	}

	public void EnterPassword() {

		password.sendKeys("Test@123");

	}

	public void ClickLogin() {

		login.click();

	}

}

 
package Pages;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
 
public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="submit") WebElement logout;

	public void ClickLogout() {

		logout.click();

	}

}

 
package Tests;
 
import javax.security.auth.login.LoginContext;
 
import BasePackage.BaseClass;

import Pages.HomePage;

import Pages.LoginPage;
 
public class BookApplication extends BaseClass{

public static void main(String[] args) throws InterruptedException {

	OpenBrowser("https://demoqa.com/login");

	LoginPage lp = new LoginPage(driver);

	HomePage hp = new HomePage(driver);

	lp.EnterUsername();

	lp.EnterPassword();

	lp.ClickLogin();	

	hp.ClickLogout();

	CloseBrowser();

}

}
