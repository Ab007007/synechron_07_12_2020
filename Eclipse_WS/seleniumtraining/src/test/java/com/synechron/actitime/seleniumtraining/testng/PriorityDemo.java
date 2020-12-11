package com.synechron.actitime.seleniumtraining.testng;

import org.testng.annotations.Test;

public class PriorityDemo {

	
	  @Test(priority = 0)
	  public void launch()
	  {
		  System.out.println("Test");
	  }
	  
	  @Test(priority = 1)
	  public void login()
	  {
		  System.out.println("Test");
	  }
	  
	  @Test(priority = 2)
	  public void createcustomer()
	  {
		  System.out.println("Test");
	  }
	  
	  @Test(priority = 3)
	  public void logout()
	  {
		  System.out.println("Test");
	  }
}
