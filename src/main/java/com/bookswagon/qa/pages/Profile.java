package com.bookswagon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.qa.base.TestBase;

public class Profile extends TestBase {
	
	@FindBy(xpath = "//span[@id='ctl00_lblUser']")
	WebElement profilebtn;
	
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	WebElement myAccountBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Personal Settings']")
	WebElement personalSettingBtn;
	
	@FindBy(xpath = "//a[normalize-space()='My Orders']")
	WebElement myOrdersBtn;

	@FindBy(xpath = "//a[normalize-space()='My Wishlist']")
	WebElement myWishlistBtn;
	
	@FindBy(xpath = "//a[normalize-space()='My Gift Certificate']")
	WebElement giftCertificate;
	
	@FindBy(xpath = "//a[normalize-space()='My Addresses']")
	WebElement myAddressPage;
	
	@FindBy(xpath = "//a[normalize-space()='Change Password']")
	WebElement changePwdBtn;
	
	public Profile() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateMyProfilePage() {
		profilebtn.click();
		myAccountBtn.click();
	}
	
	public void validateMyOrderPage() {
		profilebtn.click();
		myOrdersBtn.click();
	}
	
	public void validateMyWishlistPage() {
		profilebtn.click();
		myWishlistBtn.click();
	}
	
	public void validateGiftCertificatePage() {
		profilebtn.click();
		giftCertificate.click();
	}
	
	public void validateMyAddressPage() {
		profilebtn.click();
		myAddressPage.click();
	}
	
	public void validatechangePwdPage() {
		profilebtn.click();
		changePwdBtn.click();
	}
}
