package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Base;

public class LoginPage extends Base {

	/*
	 * WebDriver driver;
	 * 
	 * public LoginPage(WebDriver driver) { // TODO Auto-generated constructor stub
	 * this.driver = driver;
	 * 
	 * }
	 */
	
	
	public ZohoAppPage doLogin(String username, String password) {
//		driver.switchTo().frame("zohoiam");
		type("email_CSS",username);
//		type("password_CSS",password);
		click("submitBtn_XPATH");
		
		return new ZohoAppPage();
	}
	
	public void goToSaleandMarketing() {
		
	}
	
	public void goToFinance() {
		
	}
	
	


}
