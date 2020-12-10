package com.synechron.actitime.seleniumtraining.browserop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class BrowserOperationsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = ActitimeUtils.getDriver();
		
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//driver.close();
		driver.quit();
	}

}
