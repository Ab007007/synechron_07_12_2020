package com.synechron.java.basic.strings;

public class StringBuilderDemo {

	
	public static void main(String[] args) {
		
		
		StringBuilder email = new StringBuilder("aru03.info@gmail.com");
//		System.out.println(email + " : "+email.hashCode());
//		email.append("PQR");
//		System.out.println(email + " : "+email.hashCode());
//		email.append("XYZ");
//		System.out.println(email + " : "+email.hashCode());
//		
		System.out.println(email.charAt(2));
		System.out.println(email.indexOf("a"));
		System.out.println(email.indexOf("a", 1));
		System.out.println(email.length());
		System.out.println(email.lastIndexOf("a"));
		System.out.println(email.reverse());
//		System.out.println(email.replace(0, email.length(), "ASSDF"));
		System.out.println(email.reverse());
		System.out.println(email.toString().toUpperCase());
		System.out.println(email.toString().toLowerCase());
		
		
		
		
	}
}
