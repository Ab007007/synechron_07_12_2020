package com.synechron.actitime.seleniumtraining.dynamicwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.seleniumtraining.util.DriverUtils;

public class WebDriverWaitDemoUsingFunctions 
{
	public static void main(String[] args) {
		
		WebDriver driver  =  DriverUtils.getDriver();
		DriverUtils.launch("file:///D:/synechron_07_12_2020/html/tiimeout.html");
		
		String text1 = DriverUtils.getText("xpath", "//p[contains(text(),'Hello')]");
		String text2 = DriverUtils.getText("xpath", "//p[contains(text(),'alertFunc')]");
		
		DriverUtils.click("tagname", "button");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(DriverUtils.getElement("id", "demo")));
		
		String text3 =DriverUtils.getText("id", "demo");
		String text4 = DriverUtils.getText("id", "demo2");
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
	
	
	
	
	}

}
