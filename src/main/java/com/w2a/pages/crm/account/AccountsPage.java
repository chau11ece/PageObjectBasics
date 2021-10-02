package com.w2a.pages.crm.account;

import org.openqa.selenium.By;

import com.w2a.base.Base;

public class AccountsPage extends Base {

	public AccountsPage() {
		// TODO Auto-generated constructor stub
	}
	
	public CreateAccountPage goToCreateAccount() {
		click("createaccountBtn_XPATH");
		return new CreateAccountPage();
	}
	
	public void goToImportAccounts() {
		
	}

}
