package com.synechron.actitime.seleniumtraining.autosuggestions;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.synechron.actitime.seleniumtraining.util.DriverUtils;

public class AutoSuggestionsDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =  DriverUtils.getDriver();
		DriverUtils.launch("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='presentation']"));
		
		System.out.println("Total number of Suggestions displayed is " + suggestions.size());
		
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}
	}

}
