package com.bookswagon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bookswagon.qa.base.TestBase;
import com.bookswagon.qa.pages.LoginPage;
import com.bookswagon.qa.pages.LogoutPage;

public class LogoutPageTest extends TestBase {

	LoginPage loginPage;
	LogoutPage logoutPage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		logoutPage = new LogoutPage();
		loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void test_Logout() {
		logoutPage.validateLogout();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
