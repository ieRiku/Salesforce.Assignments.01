package sasi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class LoginPageGoogle1 {

    WebDriver driver;

    @Test(dataProvider = "LoginData")
    public void adminLogin(String Uname) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.co.in/");

        driver.findElement(By.className("gLFyf")).sendKeys(Uname);
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

        Thread.sleep(1378);
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
    public Object[] myTestData() {
        return new Object[]{
            "chennai",
            "kolkata",
            "mumbai",
        };
    }
}
