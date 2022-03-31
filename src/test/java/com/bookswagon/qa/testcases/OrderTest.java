package com.bookswagon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bookswagon.qa.base.TestBase;
import com.bookswagon.qa.pages.LoginPage;
import com.bookswagon.qa.pages.Order;

public class OrderTest extends TestBase {
	LoginPage loginPage;
	Order order;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		order = new Order();
		loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1, groups = { "System" })
	public void test_PlaceOrder() {
		order.placeOrder(prop.getProperty("bookName"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
