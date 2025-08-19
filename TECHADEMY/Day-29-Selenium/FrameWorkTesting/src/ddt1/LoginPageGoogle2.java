package ddt1;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class LoginPageGoogle2 {	// My own code
    WebDriver driver;

    @Test(dataProvider = "LoginData")
    public void adminLogin(String Uname) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.co.in/");
        driver.findElement(By.className("gLFyf")).sendKeys(Uname);
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        String url = driver.getCurrentUrl();
        System.out.println("URL: "+ url);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @DataProvider(name = "LoginData")
    public Object[] myTestdata() throws BiffException, IOException {
        String myFile = "D:\\RIKU\\Internship\\Eclipse-Workspace\\FrameWorkTesting\\src\\data\\data2.xls";
        Workbook wb = Workbook.getWorkbook(new java.io.File(myFile));
        Sheet mySheet = wb.getSheet("Sheet1");

        int rows_count = mySheet.getRows();
        int cols_count = mySheet.getColumns();

        String inputData[] = new String[rows_count];
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+ cols_count);

        for (int i = 0; i < rows_count; i++) {
        	inputData[i] = mySheet.getCell(0, i).getContents();
        }
        return inputData;
    }
}