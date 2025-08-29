package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ConfigLoader;
import base.DriverSetup;
import pages.LoginPage;

public class LoginTest extends DriverSetup{
	static LoginPage lp;
	
	@BeforeClass
	public static void setDriver() {
		ConfigLoader.loadConfig();
		lp = new LoginPage(DriverSetup.getDriver());
	}

	@Test (priority=3)
	public static void validLoginTest() throws InterruptedException {
		lp.clickLoginButton();
		lp.enterEmail(ConfigLoader.getProperty("username"));
		lp.clickContinue();
		lp.enterPassword(ConfigLoader.getProperty("password"));
		lp.clickSubmitLogin();
	}

	@Test (priority=1)
	public static void invalidLoginTest() throws InterruptedException {
		lp.clickLoginButton();
		lp.enterEmail("invalidemail@gmail.com");
		lp.clickContinue();
		lp.enterPassword("pass1234");
		lp.clickSubmitLogin();
	}

	@Test (priority=2)
	public static void verifyLoginTest() throws InterruptedException {
		lp.navigateToUrl(ConfigLoader.getProperty("url"));
		System.out.println(lp.loginButtonEnabled());
		System.out.println(lp.loginButtonDisplayed());
	}
}
