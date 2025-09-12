package ddt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
	    WebDriver testCaseDriver = new ChromeDriver();
	    testCaseDriver.manage().window().maximize();
	    
	    LoginPage1 obj = new LoginPage1(testCaseDriver);
	    
	    testCaseDriver.get("https://login.salesforce.com/");
	    obj.typeUsername("riku1234@salesforce.commm");
	    obj.typePassword("pass2345");
	    
	    try {
	    	Thread.sleep(1100);
	    }
	    catch(InterruptedException e) {
	    	System.out.println("Interrupted Exception..");
	    }
	    
	    obj.clickLogin();
	    
	    String url = testCaseDriver.getCurrentUrl();
	    
	    if(url.equals("https://salesforce.home.com")) {
	    	System.out.println("CRM Login Successfull - passed");
	    }
	    else {
	    	System.out.println("CRM Login Failed - failed");
	    }
	    testCaseDriver.quit();
	}

}
