package ddt1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectByXpath1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
        	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        	Thread.sleep(984);
        	List<WebElement>  w = driver.findElements(By.xpath("//select[@id='country']"));
        	for(int i=0;i<w.size();i++) {
        		w.get(i).click();
        	}
        }
        catch(Exception e) {
        	System.out.println("Exception occurred");
        }
        finally {
        	if(driver!=null) {
        		driver.quit();
        	}
        }
	}
}
