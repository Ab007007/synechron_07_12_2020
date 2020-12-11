package com.synechron.actitime.seleniumtraining.popup;

import org.openqa.selenium.WebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;
import com.synechron.actitime.seleniumtraining.util.GlobalVariables;

public class HiddenDivisionDemo {

	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver(GlobalVariables.browser);
		ActitimeUtils.launch(GlobalVariables.formyURL);
		ActitimeUtils.pause(2000);
		ActitimeUtils.click("linktext", "Modal");
		ActitimeUtils.pause(2000);
		
		ActitimeUtils.click("id", "modal-button");
		ActitimeUtils.pause(2000);
		String textDisplayed = ActitimeUtils.getText("xpath", "//div[@class='modal-body']");
		ActitimeUtils.pause(2000);
		System.out.println(textDisplayed);
		ActitimeUtils.click("id", "close-button");
		ActitimeUtils.pause(2000);
		
		driver.close();
	}
}
