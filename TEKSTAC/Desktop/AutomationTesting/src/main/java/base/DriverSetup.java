package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		driver = new ChromeDriver();
		return driver;
	}
	
	static void closeDriver() {
		driver.quit();
	}
}
