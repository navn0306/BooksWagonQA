package com.bookswagon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_btnLogin']")
	WebElement clickLogin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public void validateLogin(String un, String pwd) {
		loginBtn.click();
		userName.sendKeys(un);
		password.sendKeys(pwd);
		clickLogin.click();
	}

	public void loginMultipleAccounts(String un, String pwd) {
		loginBtn.click();
		userName.sendKeys(un);
		password.sendKeys(pwd);
		clickLogin.click();
	}

}
