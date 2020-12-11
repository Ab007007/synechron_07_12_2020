package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.TestData;

public class CreateCustomerUsingTestNGDataProvider {
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
		ActitimeUtils.selectModule("tasks");
	}
	
	@Test(dataProvider = "createcustomer", dataProviderClass = TestData.class)
	public void createCustomer(String cn, String cd) {
		
		ActitimeUtils.createCustomer(cn, cd);
	}
	
	@AfterClass
	public void logout() {
		ActitimeUtils.logout();
	}

}
