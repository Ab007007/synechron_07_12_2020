package com.synechron.java.basic.conditional;

public class GreaterOfthree {

	public static void main(String[] args) {
		
		int a = 100, b = 500, c= 800;
		
		if(a > b && a > c) {
			System.out.println("A is the greatest number");
		}
		else if(b >c && b>a) {
			System.out.println("B is the greatest number");
		}
		else {
			System.out.println("C is the greatest number");
		}
		
	}
}
