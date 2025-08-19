package testAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeToGmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			
			//Open the application
			driver.get("https://www.google.co.in");

			//Insert the wait statement
			Thread.sleep(3000);
			
			//Capture the page title
			String title = driver.getTitle();
			System.out.println("Page title is: "+ title);
			
			//Check the Gmail link
			String gmailLink = driver.findElement(By.linkText("Gmail")).getAttribute("href");
			System.out.println("Gmail link: "+gmailLink);
			
			//Navigate to Gmail page
			driver.navigate().to(gmailLink);
			//driver.findElement(By.linkText("Gmail")).click();
			Thread.sleep(1305);
			
			//Capture the Present URL
			String currentURL1 = driver.getCurrentUrl();
			System.out.println("Current URL: "+ currentURL1);
			Thread.sleep(439);
			
			//Navigate to Home Page
			driver.navigate().back();
			
			//Capture the URL
			String currentURL2 = driver.getCurrentUrl();
			System.out.println("Current URL: "+ currentURL2);
			Thread.sleep(390);
			
			driver.quit();

		}
		catch(Exception e){ 
			System.out.println("Error occured");
		}
	}
}
