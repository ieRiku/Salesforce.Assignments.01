package testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturetheurl {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("https://www.google.com/");

        // Get the current URL
        String windowURL = driver.getCurrentUrl();

        // Print the URL to the console
        System.out.println(windowURL);

        // It's good practice to close the browser after you're done
        driver.quit();
    }
}