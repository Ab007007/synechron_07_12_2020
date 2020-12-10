package com.synechron.actitime.seleniumtraining.switchto;

import org.openqa.selenium.WebDriver;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class PopUpDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/switch-window");
		
		ActitimeUtils.click("id", "alert-button");
		String textOnAlert = driver.switchTo().alert().getText();
		System.out.println(textOnAlert);
		driver.switchTo().alert().accept();
		
		ActitimeUtils.click("id", "new-tab-button");
	}
}
