package com.synechron.actitime.seleniumtraining.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class DragAndDropDemo {

	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement dragME = ActitimeUtils.getElement("id", "draggable");
		WebElement dropHere = ActitimeUtils.getElement("id", "droppable");
		
		System.out.println("dragME" + dragME.getText());
		System.out.println("dropHere" + dropHere.getText());
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragME, dropHere).perform();
		

		System.out.println("dragME" + dragME.getText());
		System.out.println("dropHere" + dropHere.getText());
		
	}
}
