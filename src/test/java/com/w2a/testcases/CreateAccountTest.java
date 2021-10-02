package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.Base;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.account.AccountsPage;
import com.w2a.pages.crm.account.CreateAccountPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String, String> data) throws InterruptedException {
		
		ZohoAppPage zap = new ZohoAppPage();
		Thread.sleep(60000);
		zap.goToCRM();
		AccountsPage account = Base.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccountInfo("accountname");
		Assert.fail("Create account test failed");
	}
}
