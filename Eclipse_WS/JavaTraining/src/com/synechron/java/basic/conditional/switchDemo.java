package com.synechron.java.basic.conditional;

public class switchDemo {

	public static void main(String[] args) {
		String grade = "E";

		switch (grade) {
		case "A":
			System.out.println("You have got grade A");
			break;
		case "B":
			System.out.println("You have got grade B");
			break;
		case "C":
			System.out.println("You have got grade C");
			break;
		case "D":
			System.out.println("You have got grade D");
			break;
		default:
			System.out.println("Your grade is not listed");
			break;
		}
	}
}
