package com.synechron.actitime.seleniumtraining.select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class MultiSelectDropDownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/synechron_07_12_2020/html/multiSelect.html");
		
		Select sel = new Select(ActitimeUtils.getElement("tagname", "select"));

		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByValue("mercedes");
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		

		sel.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.deselectByValue("mercedes");
		Thread.sleep(2000);
		sel.deselectByIndex(1);
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByValue("mercedes");
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		sel.deselectAll();
		
		
		
	}

}
