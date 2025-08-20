package testautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioBtn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			
			//Invoking the browser
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			Thread.sleep(945);
			
			// This selects the second one (male), but not covered yet in syllabus so not necessary
			//WebElement checkBox = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
			
			// This selects the first one (female) by default
			WebElement checkBox = driver.findElement(By.name("sex"));
			boolean status1 = checkBox.isEnabled();
			checkBox.click();
			System.out.println("Checkbox enable status: "+ status1);
			

			
			Thread.sleep(1234);
			driver.quit();

		}
		catch(Exception e){ 
			System.out.println("Error occured");
		}
	}
}
