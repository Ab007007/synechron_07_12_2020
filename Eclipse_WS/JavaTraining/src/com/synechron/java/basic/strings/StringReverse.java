package com.synechron.java.basic.strings;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Synechron is the best place to work";
		
		for (int i = str.length()-1; i >=0 ; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
		
	}
}
