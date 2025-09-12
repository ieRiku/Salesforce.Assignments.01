package ddt1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class TestWebDriver2 {

    WebDriver driver;

    @Test(dataProvider = "LoginData")
    public void adminLogin(String Uname, String Pwd) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.salesforce.com/");

        driver.findElement(By.id("username")).sendKeys(Uname);
        driver.findElement(By.id("password")).sendKeys(Pwd);
        driver.findElement(By.id("Login")).click();

        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        System.out.println("Login test completed. Current URL: " + url);
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.close();
        }
    }

    @DataProvider(name = "LoginData")
    public Object[][] myTestData() {
        return new Object[][]{
            {"gskguptha2023619@agentforce.com", "password"},
            {"gskguptha2023619@agentforce.com", "password"}
        };
    }
}
