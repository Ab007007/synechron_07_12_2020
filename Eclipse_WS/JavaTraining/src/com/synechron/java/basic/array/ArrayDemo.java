package com.synechron.java.basic.array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int marks[] = new int[6];
		
		marks[0] = 55;
		marks[1] = 65;
		marks[2] = 55;
		marks[3] = 65;
		marks[4] = 75;
		marks[5] = 85;
		
		for (int i = 0; i < marks.length; i++)
		{
			System.out.println("Marks got on subject - "+ (i+1) + " : "+ marks[i]);
		}
		
		System.out.println("-----------------------------------------");
		for (int i = marks.length-1; i >=0 ; i--)
		{
			System.out.println("Marks got on subject - "+ (i+1) + " : "+ marks[i]);

		}
		
		
	}

}
