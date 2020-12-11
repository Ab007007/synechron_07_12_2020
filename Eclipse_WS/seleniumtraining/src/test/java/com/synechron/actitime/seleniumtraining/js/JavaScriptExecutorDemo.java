package com.synechron.actitime.seleniumtraining.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
	
import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class JavaScriptExecutorDemo {
	
	
	@Test
	public void javaScriptDemo()
	{
		WebDriver driver = ActitimeUtils.getDriver(GlobalVariables.browser);
		ActitimeUtils.launch(GlobalVariables.formyURL);
		ActitimeUtils.pause(2000);
		ActitimeUtils.click("linktext", "Page Scroll");
		ActitimeUtils.pause(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,1000);");
		js.executeScript("arguments[0].scrollIntoView();", ActitimeUtils.getElement("id", "name"));
		
	}

}
