package testautomation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowswer {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			
			//Invoking the browser
			driver.get("https://google.com");
			Thread.sleep(945);
			
			//Maximize the browser window
			driver.manage().window().maximize();
			
			Thread.sleep(1225);
			
			//Browser full-screen
			driver.manage().window().fullscreen();

			//Get page title
			String pageTitle = driver.getTitle();
			System.out.println("Page Title: "+ pageTitle);
			
			//Minimize the window
			//driver.manage().window().minimize();
			
			//Capture the URL
			String pageURL = driver.getCurrentUrl();
			System.out.println("Google page URL: "+ pageURL);
			
			Thread.sleep(429);
			
			//Navigate to another page
			driver.navigate().to("https://console.cron-job.org/login");
			driver.manage().window().maximize();
			//Capture the title
			String title2 = driver.getTitle();
			System.out.println("Title of chrono page: "+ title2);
			
			Thread.sleep(1526);
			
			//Back to the previous page
			driver.navigate().back();
			String pageURL2 = driver.getCurrentUrl();
			System.out.println("URL after back: "+ pageURL2);
			
			Thread.sleep(836);
			
			//Go forward page (only works after back)
			driver.navigate().forward();
			String pageURL3 = driver.getCurrentUrl();
			System.out.println("URL after forward: "+ pageURL3);
			
			Thread.sleep(1737);
			
			//Refresh the page
			driver.navigate().refresh();
			System.out.println("Refreshed the pages");
			
			//Count cookies before deleting
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println("Cookie count before deleting all cookies: "+ cookies.size());
			
			//Delete all the cookies
			driver.manage().deleteAllCookies();
			System.out.println("Deleted all cookies");
			
			//Get the browser cookie count
			Set<Cookie> cookies2 = driver.manage().getCookies();
			System.out.println("Cookie count after deleting all cookies: "+ cookies2.size());
			
			
			Thread.sleep(1234);
			driver.quit();

		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
}
