package pomf;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class VerifyLogin2 {
	WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void test(String Uname, String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	ObjectRepository ob = new ObjectRepository(driver);
    	ob.searchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	
    	Thread.sleep(802);
    	
    	ob.typeUsername(Uname);
    	ob.typePassword(pwd);
    	String passedPassword = ob.getPassword();
    	String passedUsername = ob.getUsername();
    	
    	System.out.println("Username: "+ passedUsername);
    	System.out.println("Password: "+ passedPassword);
    	
    	boolean loginStatus = ob.checkLoginEnable();
    	boolean forgotButtonStatus = ob.checkForgotPasswordEnable();
    	
    	System.out.println("Fogot Password button status: "+ forgotButtonStatus);
    	if(loginStatus) {
    		System.out.println("Login button is enabled..");
    		ob.clickLogin();
    	}
    	
    	Thread.sleep(1044);
	}
	
	@AfterMethod
	public void afterMethod() {
		if(driver!= null) {
			driver.quit();
		}
	}


	@DataProvider(name = "dp")
	public Object[][] myTestdata() throws BiffException, IOException {
        String myFile = "D:\\RIKU\\Internship\\Eclipse-Workspace\\ImplementPOM\\src\\data\\data.xls";
        Workbook wb = Workbook.getWorkbook(new java.io.File(myFile));
        Sheet mySheet = wb.getSheet("Sheet1");

        int rows_count = mySheet.getRows();
        int column_count = mySheet.getColumns();

        String inputData[][] = new String[rows_count][column_count];

        for (int i = 0; i < rows_count; i++) {
            for (int j = 0; j < column_count; j++) {
                inputData[i][j] = mySheet.getCell(j, i).getContents();
            }
        }
        return inputData;
    }
}
