package com.w2a.pages.crm.account;

import org.openqa.selenium.By;

import com.w2a.base.Base;

public class CreateAccountPage extends Base {
	
	public CreateAccountPage() {
		// TODO Auto-generated constructor stub
	}

	public void createAccountInfo(String accountName) {
		type("accountname_CSS", accountName);
	}
}
