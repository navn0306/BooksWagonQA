package com.bookswagon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.qa.base.TestBase;

public class LogoutPage extends TestBase{

	@FindBy(xpath = "//span[@id='ctl00_lblUser']")
	WebElement profilebtn;
	
	@FindBy(xpath = "//a[@id='ctl00_lnkbtnLogout']")
	WebElement logoutBtn;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateLogout() {
		profilebtn.click();
		logoutBtn.click();
	}
}
