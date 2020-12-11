package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.FileUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class LoginTest {

	
	public static void main(String[] args) {
		GlobalVariables.initializeGlobals();
		ActitimeUtils.getDriver(GlobalVariables.browser);
		ActitimeUtils.launch(GlobalVariables.url);
		ActitimeUtils.login(GlobalVariables.username, GlobalVariables.password);
		ActitimeUtils.logout();
		
	}
}
