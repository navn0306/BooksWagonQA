package com.bookswagon.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class='toplevel top-drop hide-c']")
	WebElement clickBooks;

	@FindBy(xpath = "//a[normalize-space()='Architecture']")
	WebElement selectBookType;

	@FindBy(xpath = "//span[@id='ctl00_lblUser']")
	WebElement userName;

	@FindBy(xpath = "//a[normalize-space()='New Arrivals']")
	WebElement newArrivals;

	@FindBy(xpath = "//a[normalize-space()='Pre-order']")
	WebElement preOrder;

	@FindBy(xpath = "//a[normalize-space()='Bestsellers']")
	WebElement bestSellers;

	@FindBy(xpath = "//a[normalize-space()='TextBooks']")
	WebElement textBooks;

	@FindBy(xpath = "//a[normalize-space()='Award Winners']	")
	WebElement awardWinners;

	@FindBy(xpath = "//a[normalize-space()='Featured Authors']")
	WebElement featuredAuthors;

	@FindBy(xpath = "//input[@id='ctl00_TopSearch1_txtSearch']")
	WebElement searchBox;
	
	@FindBy(xpath = "//input[@id='ctl00_TopSearch1_Button1']")
	WebElement clickSearch;
	
	@FindBy(xpath = "//a[@class='sprite home-ico toplevel oneline']")
	WebElement clickHome;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateUserName() {
		return userName.isDisplayed();
	}

	public void clickOnBooks() {
		clickBooks.click();
	}

	public void clickOnNewArrivals() {
		newArrivals.click();
	}

	public void clickOnPreOrder() {
		preOrder.click();
	}

	public void clickOnBestsellers() {
		bestSellers.click();
	}

	public void clickOnTextBook() {
		textBooks.click();
	}

	public void clickOnAwardWinners() {
		awardWinners.click();
	}

	public void clickOnFeaturedAuthors() {
		awardWinners.click();
	}

	public void selectBookCategory() {
		clickOnBooks();
		selectBookType.click();
	}

	public void scrollUsingJSE() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		for (int i = 0; i < 5; i++) {
			jse.executeScript("window.scrollBy(0, 1500)");
			Thread.sleep(2000);
		}
		for (int i = 0; i < 5; i++) {
			jse.executeScript("window.scrollBy(0, -1500)");
			Thread.sleep(2000);
		}
	}
	
	public void searchBook(String bookName) {
		searchBox.sendKeys(bookName);
		clickSearch.click();
	}
	
	public void returnToHome() {
		clickHome.click();
	}
	
}
