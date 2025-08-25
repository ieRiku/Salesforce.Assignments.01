package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	static WebDriver driver = null;
	public static WebDriver getDriver() {
		try {
			driver = new ChromeDriver();
		} 
		catch (Exception e) {
			System.out.println("err");
		}
		return driver;
	}
}
