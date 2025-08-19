package testautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaToSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\RIKU\\\\Internship\\\\Eclipse-JRE\\\\chromedriver-win64\\\\chromedriver.exe");
		
		try {
			WebDriver driver = new ChromeDriver();
			
			//Go to Wikipedia 
			driver.get("https://en.wikipedia.org/wiki/Main_Page");

			//Wait for 3 seconds to load
			Thread.sleep(3000);
			
			//Verify the Page title
			driver.getTitle();
			String pageTitle = driver.getTitle();
			System.out.println("Page title: "+ pageTitle);
			if (pageTitle.contains("Wikipedia")) {
                System.out.println("verification pass");
            } 
			else {
                System.out.println("verification fail");
            }
			Thread.sleep(1548);
			driver.findElement(By.className("mw-ui-icon-wikimedia-search")).click();
			
			//Enter "Selenium" under the "Search" box
			driver.findElement(By.name("search")).sendKeys("selenium");
			
			//Capture the text from the text box
			String searchInput = driver.findElement(By.name("search")).getAttribute("value");
			System.out.println("Inputted text: "+ searchInput);
			
			//Click on search button
			driver.findElement(By.className("cdx-search-input__end-button")).click();
			Thread.sleep(1425);
			
			//Click on "Selenium (Software)
			driver.findElement(By.linkText("Selenium (software)")).click();	// issue no name
			Thread.sleep(1542);
			
			//Capture the URL
			String currentUrl1 = driver.getCurrentUrl();
			System.out.println("current URL: "+ currentUrl1);
			
			//Navigate to previous page
			driver.navigate().back();
			Thread.sleep(213);
			driver.navigate().back();
			Thread.sleep(1245);
			
			//Navigate to home page
			String homeURL = driver.getCurrentUrl();
			if(homeURL.equals("https://en.wikipedia.org/wiki/Main_Page")) {	
				System.out.println("Verification pass");
			}
			else {
				System.out.println("Verification fail");
			}
			Thread.sleep(2593);
			
			driver.quit();

		}
		catch(Exception e){ 
			System.out.println("Error occured");
		}
	}
}
