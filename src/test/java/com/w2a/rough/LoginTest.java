package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.base.Base;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.account.AccountsPage;
import com.w2a.pages.crm.account.CreateAccountPage;

public class LoginTest {


	public static void main(String[] args) throws InterruptedException {
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToSignIn();
		ZohoAppPage zap = lp.doLogin("vanchautran11ece@gmail.com");
		zap.goToCRM();
		
		AccountsPage account = Base.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccountInfo("chautran");
		
	}

}
