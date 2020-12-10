package com.synechron.actitime.seleniumtraining.autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='presentation']"));
		
		System.out.println("Total number of Suggestions displayed is " + suggestions.size());
		
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}
	}

}
