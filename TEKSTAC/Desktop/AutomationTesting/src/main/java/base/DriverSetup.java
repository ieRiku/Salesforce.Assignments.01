package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	static WebDriver driver = null;	
	static ConfigLoader cl;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(ConfigLoader.getProperty("url"));
		}
		return driver;
	}
	
	public static void closeDriver() {
		driver.quit();
		driver=null;
	}
}
