package pomf;

import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BrokenLinkCount1 {
	WebDriver driver;
	
	@Test
    public void checkLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("http://www.deadlinkcity.com/");
    	Thread.sleep(1500); 
    	
    	List<WebElement> allLinks = driver.findElements(By.tagName("a")); // Using By.tagName
        System.out.println("Total number of Links: " + allLinks.size());
        
        int goodLinks = 0;
        int brokenLinks = 0;
        try {
	        for(WebElement linkElement : allLinks) {
	            String hrefattValue = linkElement.getAttribute("href");
	            
	            if(hrefattValue == null || hrefattValue.isEmpty()) {
	                System.out.println("Link value null. Not possible to check.");
	                continue;
	            }
	            int response = 999;
	            try {
		            URL linkURL = new URL(hrefattValue); // Throws MalformedURLException
		            HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection(); // Throws IOException
		            conn.connect(); // Throws IOException
		            response = conn.getResponseCode();
	            }
	            catch(Exception e2) {}
	            
	            if(response < 300) {
	                goodLinks++;
	            }
	            else {
	                brokenLinks++;
	            }
	        }
        }
        catch(Exception e) {
        	System.out.println("Err");
        }
        System.out.println("Good links: "+ goodLinks);
        System.out.println("Broken links: "+ brokenLinks);
	}
	
	@AfterMethod
	public void afterMethod() {
		if(driver != null) {
			driver.quit();
		}
	}
}
