package basicSeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForthSelenium {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("Https://demoqa.com/buttons");
		WebElement nc = driver.findElement(By.xpath("//button[text()='Click Me']"));
		WebElement dd = driver.findElement(By.id("doubleClickBtn"));
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		act.doubleClick(dd).perform();
		act.contextClick(rc).perform();
		act.click(nc).perform();
		
		act.scrollByAmount(100, 200);
		driver.quit();
	}
}
