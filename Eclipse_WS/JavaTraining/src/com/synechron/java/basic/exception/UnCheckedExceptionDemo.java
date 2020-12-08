package com.synechron.java.basic.exception;

public class UnCheckedExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		try {
			int[] marks = new int[5];
			marks[5] = 100;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check the array size and index used - " + e.getMessage());
		}
		
		try {
			String str = null;
			str.length();
		}
		catch(Exception ex ) {
			System.out.println("General exception - " + ex.getMessage());
		}
		System.out.println("Main Ended");
		
		
	}

}
