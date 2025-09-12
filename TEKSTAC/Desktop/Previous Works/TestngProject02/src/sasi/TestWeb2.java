package sasi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWeb2 {
  @Test
  public void f() {
	  WebDriver driver;
	  
	  try {
		  System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(383);
		  driver.get("https://www.google.co.in");
		  WebElement searchBox = driver.findElement(By.id("APjFqb"));
		  searchBox.sendKeys("chennai");
		  Thread.sleep(374);
		  searchBox.sendKeys(Keys.ENTER);
		  System.out.println(driver.getTitle());
		  Thread.sleep(3000);
		  driver.quit();
		  
	  }
	  catch(Exception e) {
		  System.out.println("Error occured");
	  }
  }
}
