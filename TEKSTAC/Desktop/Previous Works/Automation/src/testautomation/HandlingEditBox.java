package testautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingEditBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			
			//Invoking the browser
			driver.get("https://facebook.com");
			Thread.sleep(945);
			
			//Check display status of email field
			WebElement element1 = driver.findElement(By.name("email"));
			boolean displayStatus = element1.isDisplayed();
			System.out.println("Email display status: "+ displayStatus);
			
			
			//Check enable status
			boolean enableStatus = element1.isEnabled();
			System.out.println("Email enable status: "+ enableStatus);
			
			Thread.sleep(262);
			
			//Send data to email
			driver.findElement(By.name("email")).sendKeys("suresh123@gmail.com");
			Thread.sleep(623);
			
			//Get the type of data in email
			String elementType = driver.findElement(By.name("email")).getAttribute("type");
			System.out.println("Element type for email: "+ elementType);
			
			//Get the value in email
			String elementValue = driver.findElement(By.name("email")).getAttribute("value");
			System.out.println("Element value for email: "+ elementValue);
			
			Thread.sleep(1386);
			
			//clear the email value
			driver.findElement(By.name("email")).clear();
			Thread.sleep(735);
			
			driver.findElement(By.name("pass")).sendKeys("Password123");
			Thread.sleep(542);
			driver.findElement(By.className("_9lsa")).click();
			
			
			
			Thread.sleep(1234);
			driver.quit();

		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
}
