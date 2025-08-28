package tests;

import base.DriverSetup;
import pages.CartPage;

public class CartTest {
	
	CartPage cp = new CartPage();
	
	public static void main(String[] args) {
		cp.driver = DriverSetup.getDriver();
	}
}
