package ddt1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginPageGoogle3 {

    WebDriver driver;

    @Test(dataProvider = "SearchData")
    public void googleSearchTest(String searchInput) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	
        driver.get("https://www.google.co.in/");

        driver.findElement(By.className("gLFyf")).sendKeys(searchInput);
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

        Thread.sleep(1630);
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "SearchData")
    public Object[] getSearchDataFromFile() {
        List<String> searchTerms = new ArrayList<>();
        String filePath = "D:\\RIKU\\Internship\\Eclipse-Workspace\\FrameWorkTesting\\src\\data\\data2.txt";

        try (FileReader myFile = new FileReader(filePath);
             BufferedReader br = new BufferedReader(myFile)) {

            String line;
            int lineCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;
                // Skip the first line if it's a header (as per your original logic: lineCount > 1)
                if (lineCount >= 1) {
                    searchTerms.add(line.trim()); // Trim whitespace from the line
                }
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred while reading data from file: " + e.getMessage());
            e.printStackTrace();
            // In a real scenario, you might want to throw a RuntimeException or fail the test gracefully
        }

        return searchTerms.toArray(new String[0]);
    }
}