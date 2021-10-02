package com.w2a.testcases;

import org.testng.annotations.AfterSuite;

import com.w2a.base.Base;

public class BaseTest {

	@AfterSuite
	public void tearDown() {
		Base.quit();
	}
}
