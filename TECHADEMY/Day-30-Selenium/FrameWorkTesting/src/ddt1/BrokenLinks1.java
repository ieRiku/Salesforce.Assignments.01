package ddt1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://google.com/");
	    Thread.sleep(400);
	    boolean status = driver.findElement(By.linkText("Gmail")).isDisplayed();
	    System.out.println("Status: "+ status);
	    
	    status = driver.findElement(By.linkText("Gmail")).isEnabled();
	    if(status) {
	    	driver.findElement(By.linkText("Gmail")).click();
	    }
	    Thread.sleep(1000);
	    if(driver!= null) {
	    	driver.quit();
	    }
	}

}
