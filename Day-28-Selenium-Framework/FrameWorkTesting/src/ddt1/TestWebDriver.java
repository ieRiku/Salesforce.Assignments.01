package ddt1;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class TestWebDriver {	// My own code
    WebDriver driver;

    @Test(dataProvider = "LoginData")
    public void adminLogin(String Uname, String Pwd) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys(Uname); // Using Uname from data provider
        driver.findElement(By.id("password")).sendKeys(Pwd);   // Using Pwd from data provider
        driver.findElement(By.id("Login")).click();
        Thread.sleep(1000);

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://login.salesforce.com/");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @DataProvider(name = "LoginData")
    public Object[][] myTestdata() throws BiffException, IOException {
        String myFile = "D:\\RIKU\\Internship\\Eclipse-Workspace\\FrameWorkTesting\\src\\data\\data.xls";
        Workbook wb = Workbook.getWorkbook(new java.io.File(myFile));
        Sheet mySheet = wb.getSheet("Sheet1");

        int rows_count = mySheet.getRows();
        int column_count = mySheet.getColumns();
        //System.out.println(rows_count + ", " + column_count); // 3, 2

        String inputData[][] = new String[rows_count][column_count];

        for (int i = 0; i < rows_count; i++) {
            for (int j = 0; j < column_count; j++) {
                inputData[i][j] = mySheet.getCell(j, i).getContents();
            }
        }
        return inputData;
    }
}