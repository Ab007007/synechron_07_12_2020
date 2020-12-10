package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class CreateCustomerTest {

	public static void main(String[] args) {

		WebDriver driver = ActitimeUtils.getDriver("ff");

		ActitimeUtils.launch("http://localhost/login.do");

		ActitimeUtils.login("admin", "manager");
		
		ActitimeUtils.click("xpath", "//div[text()='TASKS']/parent::a");
		ActitimeUtils.click("xpath", "//div[@class='addNewContainer']");
		ActitimeUtils.click("xpath", "//div[@class='item createNewCustomer ellipsis']");

		ActitimeUtils.type("id", "customerLightBox_nameField", "FirstCustomer-2020");
		ActitimeUtils.type("id", "customerLightBox_descriptionField", "FirstCustomer-2020-DESC");
		ActitimeUtils.click("id", "customerLightBox_commitBtn");
		
		
		ActitimeUtils.logout();
		
	}

}
