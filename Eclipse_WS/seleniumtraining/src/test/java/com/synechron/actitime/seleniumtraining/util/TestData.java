package com.synechron.actitime.seleniumtraining.util;

import org.testng.annotations.DataProvider;

public class TestData {

	
	  @DataProvider
	  public Object[][] dp() 
	  {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	      new Object[] { 3, "b" },
	      new Object[] { 4, "b" },
	    };
	  }
	  
	  
	  @DataProvider
	  public Object[][] createcustomer() 
	  {
	    return new Object[][] {
	      new Object[] { "Customer-TestngDec-2020-1","Customer-TestngDec-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-2","Customer-TestngDec-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-3","Customer-TestngDec-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-4","Customer-TestngDec-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-5","Customer-TestngDec-2020-Desc1"},
	    };
	  }

	  @DataProvider
	  public Object[][] createproject() 
	  {
	    return new Object[][] {
	      new Object[] { "Customer-TestngDec-2020-1","Project1", "Proj-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-1","Project2", "Proj-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-2","Project1", "Proj-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-2","Project2", "Proj-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-5","Project3", "Proj-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-5","Project4", "Proj-2020-Desc1"},
	      new Object[] { "Customer-TestngDec-2020-5","Project5", "Proj-2020-Desc1"},
	    };
	  }








}
