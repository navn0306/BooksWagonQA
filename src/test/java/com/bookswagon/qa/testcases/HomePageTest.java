package com.bookswagon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bookswagon.qa.base.TestBase;
import com.bookswagon.qa.pages.HomePage;
import com.bookswagon.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1, groups = { "Functional" })
	public void test_HomePageTitle() {
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
	}

	@Test(priority = 2, groups = { "Functional" })
	public void test_CorrectUserName_IsDisplayed() {
		homePage.validateUserName();
	}

	@Test(priority = 3, groups = { "Functional" })
	public void test_ClickOn_Books() {
		homePage.clickOnBooks();
	}

	@Test(priority = 4, groups = { "Functional" })
	public void test_ClickOn_NewArrivals() {
		homePage.clickOnNewArrivals();
	}

	@Test(priority = 5, groups = { "Functional" })
	public void test_ClickOn_PreOrder() {
		homePage.clickOnPreOrder();
	}

	@Test(priority = 6, groups = { "Functional" })
	public void test_ClickOn_BestSeller() {
		homePage.clickOnBestsellers();
	}

	@Test(priority = 7)
	public void test_ClickOn_TextBook() {
		homePage.clickOnTextBook();
	}

	@Test(priority = 8)
	public void test_ClickOn_AwardWinners() {
		homePage.clickOnAwardWinners();
	}

	@Test(priority = 9)
	public void test_ClickOn_FeaturedAuthors() {
		homePage.clickOnFeaturedAuthors();
	}

	@Test(priority = 10)
	public void test_ScrollUsingJSE() throws InterruptedException {
		homePage.scrollUsingJSE();
	}

	@Test(priority = 11)
	public void test_SelectBookByCategory() {
		homePage.selectBookCategory();
	}

	@Test(priority = 12)
	public void test_searchBookName() {
		homePage.searchBook(prop.getProperty("bookName"));
	}

	@Test(priority = 13)
	public void test_HomeButton() {
		homePage.returnToHome();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
