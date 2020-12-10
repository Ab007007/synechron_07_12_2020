package com.synechron.actitime.seleniumtraining.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class KeyBoardActionsDemo {

	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://localhost/login.do");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("admin").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("manager").perform();
		act.sendKeys(Keys.ENTER).perform();
	
		
		
	}
}
