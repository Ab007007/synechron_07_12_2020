package com.synechron.actitime.seleniumtraining.pom.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.synechron.actitime.seleniumtraining.pom.page.DashBoardPage;
import com.synechron.actitime.seleniumtraining.pom.page.LoginPage;
import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class LoginTest {
	WebDriver driver = null;
	LoginPage lp = null;
	DashBoardPage dp = null;
	@BeforeClass
	public void initializePageObjects()
	{
		driver = ActitimeUtils.getDriver(GlobalVariables.browser);
		lp = new LoginPage(driver);
		dp = new DashBoardPage(driver);
	}
	
	@BeforeMethod
	public void launch() {
		
		driver.get(GlobalVariables.url);
	}
	@Test
	public void loginTest() {
		lp.login(GlobalVariables.username, GlobalVariables.password);
		dp.logout();
	}

}
