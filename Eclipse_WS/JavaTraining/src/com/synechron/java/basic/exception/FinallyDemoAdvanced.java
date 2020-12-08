package com.synechron.java.basic.exception;

public class FinallyDemoAdvanced {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		try {
			int[] marks = new int[5];
			marks[4] = 100;
			String str = "ADFASD";
			str.length();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check the array size and index used - " + e.getMessage());
		}
		catch(Exception ex ) {
			System.out.println("General exception - " + ex.getMessage());
		}
		finally {
			System.out.println("poweredBy: Aravinda");
		}
		System.out.println("Main Ended");
		
		
	}

}
