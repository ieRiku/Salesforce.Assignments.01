package testautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			
			//Invoking the browser
			driver.get("https://sso.godaddy.com/?realm=idp&app=venture-redirector&path=%2F");
			Thread.sleep(945);

			WebElement checkBox = driver.findElement(By.name("rememberMe"));
			boolean status1 = checkBox.isEnabled();
			System.out.println("Checkbox enable status: "+ status1);
			
			boolean status2 = checkBox.isDisplayed();
			System.out.println("Checkbox display status: "+ status2);
			
			boolean status3 = checkBox.isSelected();
			System.out.println("Checkbox selected status: "+ status3);
			
			checkBox.click();
			System.out.println("After clicking checkbox...");
			
			boolean status4 = checkBox.isSelected();
			System.out.println("Checkbox selected status: "+ status4);
			
			Thread.sleep(1234);
			driver.quit();

		}
		catch(Exception e){ 
			System.out.println("Error occured");
		}
	}
}
