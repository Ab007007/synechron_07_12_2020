package com.synechron.actitime.seleniumtraining.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement usernameTxtBox;
	
	@FindBy(name = "pwd")
	WebElement passwordTxtBox;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	
	public void enterUsername(String un) {
		usernameTxtBox.sendKeys(un);
	}
	public void enterPassword(String pwd) {
		passwordTxtBox.sendKeys(pwd);
	}
	public void clickOnLogin() {
		loginButton.click();
		ActitimeUtils.pause(3000);
	}
	public void login(String un, String pwd) {
		
		enterUsername(un);
		enterPassword(pwd);
		clickOnLogin();
	}
	
	
}
