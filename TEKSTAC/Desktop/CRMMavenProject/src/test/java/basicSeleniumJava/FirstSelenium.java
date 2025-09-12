package basicSeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getPageSource());
			Thread.sleep(1000);
			driver.navigate().to("https://google.com/");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
		finally {
			try {
				if(driver != null) {
					driver.close();
				}
			}
			catch(Exception e2) {}
		}
	}

}
