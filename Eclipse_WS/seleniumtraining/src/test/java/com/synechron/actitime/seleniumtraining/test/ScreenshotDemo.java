package com.synechron.actitime.seleniumtraining.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.FileUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;


public class ScreenshotDemo {

	WebDriver driver = null;
	@BeforeMethod
	public void createDriverObj() {
		driver = ActitimeUtils.getDriver(GlobalVariables.browser);
	}
	
	@AfterMethod
	public void verifyTestExecution(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE) {
			captureScreenShot();
		}
	}
	
	@Test
	public void validCredentials() throws IOException {
		ActitimeUtils.launch(GlobalVariables.url);
		ActitimeUtils.login(GlobalVariables.username, GlobalVariables.password);
		ActitimeUtils.logout();
		
	}
	
	@Test
	public void inValidCredentials() {
		ActitimeUtils.launch(GlobalVariables.url);
		ActitimeUtils.login("ASDFAS", GlobalVariables.password);
		ActitimeUtils.logout();
		
	}
	
	public void captureScreenShot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(screenShot, new File("screenshots/Fail_Screen_" + ActitimeUtils.getDateAndTime() +".png"));
	}
	
	
	
	
	
	
	
	
	
	
}
