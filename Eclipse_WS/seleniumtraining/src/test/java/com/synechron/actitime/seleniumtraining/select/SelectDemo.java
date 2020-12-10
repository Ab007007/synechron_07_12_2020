package com.synechron.actitime.seleniumtraining.select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class SelectDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		Select sel = new Select(ActitimeUtils.getElement("id", "select-menu"));
		
		sel.selectByIndex(3);   //5-9
		
		Thread.sleep(5000);
		
		sel.selectByValue("1");  //0-1
		
		
		Thread.sleep(5000);
		sel.selectByVisibleText("10+");
		
		
		
		
	}

}
