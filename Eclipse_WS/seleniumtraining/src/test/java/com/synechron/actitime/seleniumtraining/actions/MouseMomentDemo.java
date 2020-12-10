package com.synechron.actitime.seleniumtraining.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class MouseMomentDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement closeButton = wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//button[@class='_2KpZ6l _2doB4z']")));
		
		closeButton.click();
		
		WebElement electronicsTab = ActitimeUtils.getElement("xpath", "//span[text()='Electronics']");
		WebElement menTab = ActitimeUtils.getElement("xpath", "//span[text()='Men']");
		WebElement womenTab = ActitimeUtils.getElement("xpath", "//span[text()='Women']");
		WebElement homeTab = ActitimeUtils.getElement("xpath", "//span[text()='Home & Furniture']");
		WebElement sportsTab = ActitimeUtils.getElement("xpath", "//span[text()='Sports, Books & More']");
		WebElement flightsTab = ActitimeUtils.getElement("xpath", "//a[text()='Flights']");
		
		Actions act =  new Actions(driver);
		
		act.moveToElement(electronicsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(flightsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(menTab).perform();
		Thread.sleep(2000);
		act.moveToElement(sportsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(electronicsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(homeTab).perform();
		Thread.sleep(2000);
		act.moveToElement(womenTab).perform();
		Thread.sleep(2000);
		
		
		
	}
}
