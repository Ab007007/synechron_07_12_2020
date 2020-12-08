package com.synechron.java.basic.strings;

public class StringFunctions {

	
	public static void main(String[] args) {
		String email = new String("aru03.info@gmail.com");
		String userdetails = "Name=Aravinda;PhoneNum=9945042504;location=Bangalore";
		System.out.println(email.charAt(2));
		System.out.println(email.indexOf("a"));
		System.out.println(email.indexOf("a", 1));
		System.out.println(email.length());
		System.out.println(email.lastIndexOf("a"));
		
		
		String[] details = userdetails.split(";");
		for (String detail : details) {
			
			System.out.println(detail.substring(detail.indexOf("=")+1));
		}
		
		
		System.out.println(userdetails.contains(details[0]));
		System.out.println(email.toUpperCase());
		System.out.println(email.toLowerCase());
		
		System.out.println(email.replace("a", "ABC"));
		
		
		
		System.out.println(details[0].equals(details[0]));
		
	}
}
