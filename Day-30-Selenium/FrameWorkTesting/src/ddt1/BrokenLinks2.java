package ddt1;

import java.io.IOException; // Required for HttpURLConnection and URL operations
import java.net.MalformedURLException; // Required for URL constructor
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By; // Required for By.tagName
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {
    // Declaring that the main method can throw these exceptions
    public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(1000); 
        
        List<WebElement> allLinks = driver.findElements(By.tagName("a")); // Using By.tagName
        System.out.println("Total number of Links: " + allLinks.size());
        
        for(WebElement linkElement : allLinks) {
            String hrefattValue = linkElement.getAttribute("href");
            
            if(hrefattValue == null || hrefattValue.isEmpty()) {
                System.out.println("href attribute value is null or empty. Not possible to check.");
                continue;
            }
            
            URL linkURL = new URL(hrefattValue); // Throws MalformedURLException
            HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection(); // Throws IOException
            conn.connect(); // Throws IOException
            
            // Corrected the condition for checking broken links
            if(conn.getResponseCode() >= 400) { // HTTP status codes 400 and above indicate errors
                System.out.println(hrefattValue + " - Broken link (Response Code: " + conn.getResponseCode() + ")");
            } else {
                System.out.println(hrefattValue + " - Not a Broken link (Response Code: " + conn.getResponseCode() + ")");
            }
        }
        driver.quit(); // Added to close the browser
    }
}