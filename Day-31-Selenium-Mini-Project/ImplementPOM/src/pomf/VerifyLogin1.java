package pomf;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class VerifyLogin1 {
	WebDriver driver;
	
	@Test(dataProvider = "LoginData")
    public void checkLogin(String Uname, String Pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://login.salesforce.com/");
    	
        driver.findElement(By.id("username")).sendKeys(Uname);
        driver.findElement(By.id("password")).sendKeys(Pwd);
        if(!driver.findElement(By.id("rememberUn")).isSelected()) {
        	System.out.println("CLICKED.................");
        	driver.findElement(By.id("rememberUn")).click();
        }
        
        boolean forgetPasswordStatus = driver.findElement(By.id("forgot_password_link")).isEnabled();
        String url = driver.getCurrentUrl();	// get url before login button click
        String inputUname = driver.findElement(By.id("username")).getAttribute("value");
        String inputPass = driver.findElement(By.id("password")).getAttribute("value");
        
        System.out.println("Forgot password enable status: "+ forgetPasswordStatus);
        System.out.println("URL before login: "+ url);
        System.out.println("Input USERNAME: "+ inputUname);
        System.out.println("Input PASSWORD: "+ inputPass);
        
        Thread.sleep(1905);
        driver.findElement(By.id("Login")).click();
        
        Thread.sleep(1000);
        url = driver.getCurrentUrl();	// get url after login button click
        System.out.println("Login test completed. Current URL: " + url);
    }
  
  
	@AfterMethod
	public void afterMethod() {
		if(driver!= null) {
			driver.quit();
		}
	}
	
	@DataProvider(name = "LoginData")
    public Object[][] myTestData() {
        return new Object[][]{
            {"majoj1234@agentforce.com", "pass420"},
            {"suresh948@agentforce.com", "pass421"}
        };
    }

}
