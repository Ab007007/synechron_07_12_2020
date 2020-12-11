package com.synechron.actitime.seleniumtraining.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	
	@FindBy(id = "logoutLink")
	WebElement logoutLink;
	
	public void logout() {
		logoutLink.click();
	}
	
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
}
