package com.synechron.actitime.seleniumtraining.select;

import org.openqa.selenium.WebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class CustomizedDropDown {
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		
		ActitimeUtils.click("xpath", "//div[@class='userNameWrapper']");
		ActitimeUtils.click("xpath", "//span[contains(text(), 'Roy')]");
		
		
		
	}

}
