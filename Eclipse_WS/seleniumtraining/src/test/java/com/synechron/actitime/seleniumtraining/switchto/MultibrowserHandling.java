package com.synechron.actitime.seleniumtraining.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class MultibrowserHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver =  ActitimeUtils.getDriver();
		
		System.out.println("Parent Window id " + driver.getWindowHandles());
	
		ActitimeUtils.launch("https://www.irctc.co.in/eticketing/errors.html#");
		
		List<WebElement> hyperLinksOnParentPage = driver.findElements(By.tagName("a"));
		
		System.out.println("Total hyper links on parent page - " + hyperLinksOnParentPage.size());
		
		
		ActitimeUtils.click("xpath", "//a[text()='Contact Us']");
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent Window id " + parentWindowID);
		System.out.println("Chile Window id " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		List<WebElement> hyperLinksChildPage = driver.findElements(By.tagName("a"));
		
		System.out.println("Total hyper links on Child page - " + hyperLinksChildPage.size());
		
		for (WebElement webElement : hyperLinksChildPage) {
			System.out.println(webElement.getText());
			
		}
		
		driver.close();
		driver.switchTo().window(parentWindowID);
		driver.close();
		
	}

}
