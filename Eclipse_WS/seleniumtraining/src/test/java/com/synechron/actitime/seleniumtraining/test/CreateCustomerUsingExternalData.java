package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.FileUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class CreateCustomerUsingExternalData {

	public static void main(String[] args) {
		
		ActitimeUtils.getDriver(GlobalVariables.browser);
		ActitimeUtils.launch(GlobalVariables.url);
		ActitimeUtils.login(GlobalVariables.username, GlobalVariables.password);
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.createCustomer("Customer4-2020", "Customer4-2020-Desc");
		ActitimeUtils.logout();
		
	}

	

}
