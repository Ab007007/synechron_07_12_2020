package com.synechron.actitime.seleniumtraining.dynamicwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.synechron.actitime.seleniumtraining.util.DriverUtils;

public class FluentWaitDemo 
{
	public static void main(String[] args) {
		
		WebDriver driver  =  DriverUtils.getDriver();
		DriverUtils.launch("file:///D:/synechron_07_12_2020/html/tiimeout.html");
		
		String text1 = DriverUtils.getText("xpath", "//p[contains(text(),'Hello')]");
		String text2 = DriverUtils.getText("xpath", "//p[contains(text(),'alertFunc')]");
		
		DriverUtils.click("tagname", "button");
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(DriverUtils.getElement("id", "demo")));
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(
				DriverUtils.getElement("id", "demo"))
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() 
		{
			@Override
			public Boolean apply(WebElement ele) {
				if(ele.getText().equals("Hello")) {
					System.out.println("Found Element..............");
					return true;
				}
				else {
					System.out.println("Waiting for the element!!!!");
					return false;
				}
			
			}
		};		
				
		wait.until(fun);
		
		
		
		
		
		String text3 =DriverUtils.getText("id", "demo");
		String text4 = DriverUtils.getText("id", "demo2");
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
	
	
	
	
	}

}
