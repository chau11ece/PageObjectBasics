package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.account.AccountsPage;

public class TopMenu {

	/*
	 * TopMenu is a BASE?
	 * HomePage has a TopMenu
	 * AccountsPage has a TopMenu
	 * 
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}
	
	
	public void goToHome() {
		
	}
	
	public void goToFeeds() {
		
	}
	
	public void goToLeads() {
		
	}
	
	public AccountsPage goToAccounts() {
		click("accountstab_CSS");
		return new AccountsPage();
	}
	
	public void goToContacts() {
		
	}
	
	public void signOut() {
		
	}

}
