package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Base;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Base {

	/*
	 * WebDriver driver;
	 * 
	 * public ZooAppPage(WebDriver driver) { // TODO Auto-generated constructor stub
	 * this.driver = driver; }
	 */
	
	public CRMHomePage goToCRM() throws InterruptedException {
		System.out.println(isElementPresent(By.xpath("//div[@class='app-nm'][contains(.,'CRM')]")));
		click("crmBtn_XPATH");
		return new CRMHomePage();
	}
	
	public void goToMail() {
		driver.findElement(By.xpath("(//p[@class='zl-app-title'])[2]")).click();
	}
	
	
	
	
	
	
	
}
