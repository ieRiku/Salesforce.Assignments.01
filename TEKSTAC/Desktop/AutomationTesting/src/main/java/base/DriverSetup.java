package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	static WebDriver driver = null;	
	static ConfigLoader cl;
	static String url = "https://amazon.in";
	static String username;
	static String password;
	
	private static void configLoad() throws IOException {
		cl = new ConfigLoader();
		url = cl.getProperty("url");
		username = cl.getProperty("username");
		password = cl.getProperty("password");
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.get(url);
		}
		return driver;
	}
	
	public static void closeDriver() {
		driver.quit();
	}
}
