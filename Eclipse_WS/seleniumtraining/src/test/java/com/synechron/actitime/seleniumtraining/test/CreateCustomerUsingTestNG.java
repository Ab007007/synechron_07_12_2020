package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class CreateCustomerUsingTestNG {
	public WebDriver driver = null;
	
	@BeforeSuite
	public void setup() {
		driver = ActitimeUtils.getDriver("ff");
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
		
	}
	
	@Parameters({"url", "username", "password"})
	@BeforeClass
	public void launchAndLogin(String url, String username, String password) {
		ActitimeUtils.launch(url);
		ActitimeUtils.login(username, password);
	}
	
	@Test
	public void createCustomer() {
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.createCustomer("TSTNG-DEC2020-1", "TSTNG-DEC2020-DESC1");
	}
	
	@AfterClass
	public void logout() {
		ActitimeUtils.logout();
	}

}
