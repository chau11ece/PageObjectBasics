package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Base;

public class HomePage extends Base {

	/*
	 * // not initialize => NullPointerException WebDriver driver;
	 * 
	 * public HomePage(WebDriver driver) { this.driver = driver; }
	 */
	
	public void goToHomePage() {
		driver.findElement(By.xpath("//a[contains(.,'Zoho.com')]")).click();
	}
	
	public void goToSupport() {
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public LoginPage goToSignIn() {
		click("goToSignIn_CSS");
		return new LoginPage();
	}
	
	public void goToSignUp() {
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	
	public void validateFooterLinks() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
