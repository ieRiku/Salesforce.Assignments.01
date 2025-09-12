package elementid;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
	
		try {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("identifierId")).sendKeys("atomikxp@gmail.com");
		
		
		// By creating object and performing same operation
		
		WebElement editBox = driver.findElement(By.id("identifierId"));
		editBox.sendKeys("atomikxp@gmail.com");
		
		
		}
		catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
}
