package testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeinvoking {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String pageTitle = driver.getTitle();
		if(pageTitle.equals("Google")) {
			System.out.println("Google Applicatin Launch - Passed");
		}
		else {
			System.out.println("Google Application not Launched - failed");
		}
	}
}
