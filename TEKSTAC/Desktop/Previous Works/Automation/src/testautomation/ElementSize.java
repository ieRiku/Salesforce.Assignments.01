package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			driver.get("https://facebook.com");
			Thread.sleep(945);
			//driver.manage().window().minimize();
			
			WebElement element1 = driver.findElement(By.id("email"));
			
			// To get the size of the element (height & width).
			Dimension d = element1.getSize();
			
			Thread.sleep(1245);
			int height = d.height;
			int width = d.width;
			System.out.println("Height: "+ height + "\nWidth: "+ width);
			System.out.println("");
			
			
			// Location of element
			Point p = element1.getLocation();
			int x = p.getX();
			int y = p.getY();
			
			System.out.println("X-axis: "+x + "\nY-axis: "+y);
			
			Thread.sleep(234);
			driver.quit();

		}
		catch(Exception e){
			System.out.println("Error occured");
		}
	}
}
