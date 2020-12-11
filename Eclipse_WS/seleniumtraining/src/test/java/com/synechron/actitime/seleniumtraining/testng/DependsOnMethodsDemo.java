package com.synechron.actitime.seleniumtraining.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsDemo {

	
	  @Test
	  public void launch()
	  {
		 Reporter.log("launch");
	  }
	  
	  @Test(dependsOnMethods = "launch")
	  public void login()
	  {
		  Reporter.log("login");
	  }
	  
	  @Test(dependsOnMethods = {"launch","login"})
	  public void createcustomer()
	  {
		  Reporter.log("createcustomer");
	  }
	  
	  @Test(dependsOnMethods = "createcustomer")
	  public void logout()
	  {
		  Reporter.log("logout");
	  }
}
