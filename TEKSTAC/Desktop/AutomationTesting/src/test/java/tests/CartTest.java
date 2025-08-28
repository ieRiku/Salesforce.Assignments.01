package tests;

import org.testng.annotations.Test;

import base.DriverSetup;
import pages.CartPage;

public class CartTest extends DriverSetup {
	static CartPage cp;
	
	public static void setDriver() {
		cp = new CartPage(DriverSetup.getDriver());
	}
	
	@Test
	public static void test() throws InterruptedException {
		//Thread.sleep(20000);
		setDriver();
		Thread.sleep(20000);
		cp.cartTest();
	}
}
