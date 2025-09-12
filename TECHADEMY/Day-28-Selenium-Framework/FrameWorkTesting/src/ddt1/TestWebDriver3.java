package ddt1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.testng.annotations.Test;


public class TestWebDriver3 {
	@Test
    public void testFile() {
        System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");

        try (FileReader myFile = new FileReader("D:\\RIKU\\Internship\\Eclipse-Workspace\\FrameWorkTesting\\src\\data\\data.txt");
             BufferedReader br = new BufferedReader(myFile)) {

            String line;
            int lineCount = 0;
            int iteration = 0;
            
            while ((line = br.readLine()) != null) {
                lineCount++;
                
                if (lineCount > 1) {
                    String[] inputData = line.split(", ", 2);

                    if (inputData.length == 2) {
                        iteration++;
                        
                        WebDriver driver = null; 
                        try {
                            driver = new ChromeDriver(); 
                            driver.manage().window().maximize(); 

                            driver.get("http://login.salesforce.com");

                            driver.findElement(By.id("username")).sendKeys(inputData[0]);
                            driver.findElement(By.id("password")).sendKeys(inputData[1]);

                            driver.findElement(By.id("Login")).click();

                            String url = driver.getCurrentUrl();
                            System.out.println("Iteration " + iteration + ": Logged in with username '" + inputData[0] + "'. Current URL: " + url);

                            Thread.sleep(1000); // Optional: Add a small delay for observation
                        } 
                        catch (InterruptedException e) {
                            System.err.println("Thread interrupted during sleep: " + e.getMessage());
                            Thread.currentThread().interrupt(); // Re-interrupt the thread
                        } 
                        finally {
                            if (driver != null) {
                                driver.quit(); // Use quit() to close all associated windows and terminate the WebDriver session
                            }
                        }
                    } 
                    else {
                        System.err.println("Skipping malformed line (expected 'username, password'): " + line);
                    }
                }
            }
        } 
        catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}