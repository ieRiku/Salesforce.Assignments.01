package tests;

import org.testng.annotations.Test;

import base.DriverSetup;
import pages.LoginPage;

public class LoginTest extends DriverSetup{
	static LoginPage lp;
	
	public static void setDriver() {
		lp = new LoginPage(DriverSetup.getDriver());
	}
	
	@Test
	public static void test() throws InterruptedException {
		//Thread.sleep(20000);
		setDriver();
		lp.loginTest("someone@gmail.com", "pass1234");
	}
}
