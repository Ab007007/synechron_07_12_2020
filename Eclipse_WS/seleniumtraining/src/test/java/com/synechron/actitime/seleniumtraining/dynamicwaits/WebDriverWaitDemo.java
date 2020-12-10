package com.synechron.actitime.seleniumtraining.dynamicwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.seleniumtraining.util.DriverUtils;

public class WebDriverWaitDemo 
{
	public static void main(String[] args) {
		
		WebDriver driver  =  DriverUtils.getDriver();
		DriverUtils.launch("file:///D:/synechron_07_12_2020/html/tiimeout.html");
		
		String text1 = driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).getText();
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'alertFunc')]")).getText();
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		String text3 = driver.findElement(By.id("demo")).getText();
		String text4 = driver.findElement(By.id("demo2")).getText();
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
	
	
	
	
	}

}
