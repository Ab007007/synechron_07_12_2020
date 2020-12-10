package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class LoginTest {

	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver("edge");
		
		ActitimeUtils.launch("http://localhost/login.do");
		
		ActitimeUtils.login("admin","manager");
		
		ActitimeUtils.logout();
		
	}
}
