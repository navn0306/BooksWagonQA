package com.bookswagon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.qa.base.TestBase;

public class Order extends TestBase{
	@FindBy(xpath = "//input[@id='ctl00_TopSearch1_txtSearch']")
	WebElement searchBox;
	
	@FindBy(xpath = "//input[@id='ctl00_TopSearch1_Button1']")
	WebElement clickSearch;
	
	@FindBy(xpath = "//div[1]//div[4]//div[5]//a[1]//input[1]")
	WebElement buyNowClick;
	
	@FindBy(xpath = "//input[@name='BookCart$lvCart$imgPayment']")
	WebElement placeOrder;
	
	public Order() {
		PageFactory.initElements(driver, this);
	}
	
	public void placeOrder(String bookName) {
		searchBox.sendKeys(bookName);
		clickSearch.click();
		buyNowClick.click();
		driver.get("https://www.bookswagon.com/shoppingcart.aspx");
		placeOrder.click();
		
	}
}
