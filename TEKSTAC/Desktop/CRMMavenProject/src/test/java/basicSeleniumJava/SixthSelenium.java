package basicSeleniumJava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SixthSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.id("windowButton")).click();
		
		String main = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		
		for(String s : set){
			if(!s.equalsIgnoreCase(main)) {
				driver.switchTo().window(s);
				driver.manage().window().maximize();
				Thread.sleep(1000);
			}
		}
		
		driver.quit();
	}
}
