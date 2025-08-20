package testautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
			Thread.sleep(945);
			
			//to delete the cookies
			driver.manage().deleteAllCookies();
			
			// to set the size of the window
			Dimension d = new Dimension(800, 500);
			driver.manage().window().setSize(d);
			
			Thread.sleep(1324);

			// to set position of window
			Point p = new Point(100, 100);
			driver.manage().window().setPosition(p);
			
			Thread.sleep(1632);
			
			driver.manage().window().maximize();
			
			Thread.sleep(1354);
			driver.quit();

		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
}
