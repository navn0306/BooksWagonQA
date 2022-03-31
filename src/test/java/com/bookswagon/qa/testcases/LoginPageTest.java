package com.bookswagon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bookswagon.qa.base.TestBase;
import com.bookswagon.qa.pages.LoginPage;
import com.bookswagon.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	String sheetName = "Sheet1";

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test
	public void testPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Bookstore | Buy Books Online | Read Books Online");
	}

	@Test
	public void testLogin() {
		loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@DataProvider
	public Object[][] getLoginTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getLoginTestData")
	public void multipleLoginTest(String userName, String password) {
		loginPage.loginMultipleAccounts(userName, password);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
