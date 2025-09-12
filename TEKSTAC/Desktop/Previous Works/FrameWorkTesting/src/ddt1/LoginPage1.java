//Using 

package ddt1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage1 {

    WebDriver pageClassdriver; 

    By Username = By.id("username"); 
    By Password = By.id("password"); 
    By LoginButton = By.id("Login"); 

    // Constructor
    public LoginPage1(WebDriver driver) {
        this.pageClassdriver = driver;
    }

    // Method to type username
    public void typeUsername(String uName) {
        pageClassdriver.findElement(Username).sendKeys(uName);
    }

    // Method to clear username field
    public void clearUsername() {
        pageClassdriver.findElement(Username).clear();
    }

    // Method to get username (value attribute)
    public String getUsername() {
        return pageClassdriver.findElement(Username).getAttribute("value");
    }

    // Method to type password
    public void typePassword(String pwd) {
        pageClassdriver.findElement(Password).sendKeys(pwd);
    }

    public void clickLogin() {
    	pageClassdriver.findElement(LoginButton).click();
    }
}