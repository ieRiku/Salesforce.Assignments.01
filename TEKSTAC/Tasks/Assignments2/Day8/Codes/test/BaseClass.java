package Tests;
 
import javax.security.auth.login.LoginContext;
 
import BasePackage.BaseClass;

import Pages.HomePage;

import Pages.LoginPage;
 
public class BookApplication extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		OpenBrowser("https://demoqa.com/login");

		LoginPage lp = new LoginPage(driver);

		HomePage hp = new HomePage(driver);

		lp.EnterUsername();

		lp.EnterPassword();

		lp.ClickLogin();	

		hp.ClickLogout();

		CloseBrowser();

	}

}
