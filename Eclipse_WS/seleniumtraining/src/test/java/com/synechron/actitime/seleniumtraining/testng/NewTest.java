package com.synechron.actitime.seleniumtraining.testng;

import org.testng.annotations.Test;

import com.synechron.actitime.seleniumtraining.util.TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class NewTest {

	@Parameters({"url","username","password"})
	@Test
	public void readGlobal(String url, String un, String pwd)
	{
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
	}
	
  @Test(dataProvider = "dp", dataProviderClass = TestData.class)
  public void f(Integer n, String s) 
  {
	  System.out.println(n + " : " + s);
  }


}
