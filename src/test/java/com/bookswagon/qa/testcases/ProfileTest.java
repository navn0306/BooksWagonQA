package com.bookswagon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bookswagon.qa.base.TestBase;
import com.bookswagon.qa.pages.LoginPage;
import com.bookswagon.qa.pages.Profile;

public class ProfileTest extends TestBase {
	Profile profile;
	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		profile = new Profile();
		loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void test_MyProfilePage() {
		profile.validateMyProfilePage();
	}
	
	@Test(priority = 2)
	public void test_MyOrdersPage() {
		profile.validateMyOrderPage();
	}
	
	@Test(priority = 3)
	public void test_MyWishlistPage() {
		profile.validateMyWishlistPage();
	}
	
	@Test(priority = 4)
	public void test_MyGiftCenterPage() {
		profile.validateGiftCertificatePage();
	}
	
	@Test(priority = 5)
	public void test_ChangeAddress() {
		profile.validateMyAddressPage();
	}
	
	@Test(priority = 6)
	public void test_ChangePwd() {
		profile.validatechangePwdPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
