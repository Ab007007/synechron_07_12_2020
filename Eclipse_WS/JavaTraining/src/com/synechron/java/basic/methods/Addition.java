package com.synechron.java.basic.methods;

public class Addition {

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		int a = 10;
		int b = 20;
		
		int c = ad.sum(a,b);
		int d = ad.sum(15,20);
		
		System.out.println("Printing from main : " + c);
		System.out.println("Printing from main : " + d);
		System.out.println("Average-1 : " + (c/2));
		System.out.println("Average-2 : " + (d/2));
	}
	
	
	public int sum(int x, int y)
	{
		int c  = x + y;
		System.out.println(c);
		return c;
	}
}
