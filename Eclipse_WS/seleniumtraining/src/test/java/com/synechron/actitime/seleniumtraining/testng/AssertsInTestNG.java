package com.synechron.actitime.seleniumtraining.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsInTestNG {
	
	
	@Test
	public void myaddition() {
		System.out.println("-- started ----");
		int a =10 , b=20;
		int c = 35;
		Assert.assertEquals((a+b), c);
		System.out.println("-- end ----");
	}

}
