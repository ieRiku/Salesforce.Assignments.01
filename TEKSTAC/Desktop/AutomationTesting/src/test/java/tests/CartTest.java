package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.DriverSetup;
import pages.CartPage;

public class CartTest extends DriverSetup {
	static CartPage cp;
	
	@BeforeClass
	public static void setDriver() {
		cp = new CartPage(DriverSetup.getDriver());
	}
	
	@Test (priority = 1)
	public static void cartAddTest() throws InterruptedException {
		Thread.sleep(500);
		cp.cartAdd();
	}
	
	@Test (priority = 2)
	public static void modifyQuantity() throws InterruptedException {
		Thread.sleep(500);
		cp.quantityModify();
	}
	
	@Test (priority = 3)
	public static void deleteFromCart() throws InterruptedException {
		Thread.sleep(1000);
		cp.deleteProductFromCart();
	}
	
	@Test (priority = 4)
	public static void buyProducts() throws InterruptedException {
		Thread.sleep(2000);
		cp.proceedToBuyFromCart();
		String address = cp.getAddress();
		if(address.contains("Goai")) {
			System.out.println("Address verified");
		}
	}
	
	@Test (priority = 5)
	public static void placeOrder() {
		boolean canMoveToOrder = cp.buyingIsEnabled();
		if(!canMoveToOrder) {
			System.out.println("cannot order");
		}
	}
		
	@AfterClass
	public static void quitBrowser() {
		closeDriver();
	}
}
