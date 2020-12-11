package com.synechron.actitime.seleniumtraining.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsInTestNG {
	
	
	@Test
	public void myaddition() {
		System.out.println("-- started ----");
		SoftAssert sa = new SoftAssert();
		int a =10 , b=20;
		int c = 35;
		sa.assertEquals((a+b), c);
		sa.assertEquals((a+b), 40);
		sa.assertEquals((a+b), 50);
		System.out.println("-- end ----");
		sa.assertAll();
	}

}
