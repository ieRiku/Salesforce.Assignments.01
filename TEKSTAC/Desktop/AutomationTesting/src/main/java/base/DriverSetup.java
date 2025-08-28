package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	static WebDriver driver = null;
	static String url = "https://amazon.in";
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.get(url);
		}
		return driver;
	}
	
	static void closeDriver() {
		driver.quit();
	}
}
