package com.synechron.java.basic.strings;

public class StringsDemo 
{
	public static void main(String[] args) {
		
		String str1 = new String();
		String str2 = "ABC";
		str1 = str1.concat("ABC");
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		str1 = str1.concat("123");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
	}
}
