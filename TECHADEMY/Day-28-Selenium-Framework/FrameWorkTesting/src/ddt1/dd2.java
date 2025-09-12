package ddt1;

import java.io.FileReader;
import java.io.BufferedReader;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class dd2 {
	public static void main(String[] args) {
		//TODO auto-generated method stub
		WebDriver driver;
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\RIKU\\Internship\\Eclipse-JRE\\chromedriver-win64\\chromedriver.exe");
			//driver = new ChromeDriver();
			FileReader fileObject = new FileReader("D:\\RIKU\\Internship\\Eclipse-Workspace\\FrameWorkTesting\\src\\data\\username.txt");
			BufferedReader br = new BufferedReader(fileObject);
			
			String line;
			int lineCount=0;
			int iterations=0;
			
			while((line = br.readLine()) != null) {
				String[] inputData = line.split(", ");
			}
			
            fileObject.close();
		}
		catch(Exception e) {
			System.out.println("Err");
		}
	}
}
