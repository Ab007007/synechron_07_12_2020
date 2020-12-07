package com.synechron.java.basic.constructors;

import java.util.concurrent.CountDownLatch;

class Person {
	
	String name;
	double height;
	double weight;
	String phonenum;
	static int count = 0;
	static String country = "India";
	
	{
		System.out.println(++count);
	}
	
	
	public Person(String name, double heigth, double weight, String phonenum) { 
		this.name = name;
		this.height = heigth;
		this.weight = weight;
		this.phonenum = phonenum;
		
	}
	
	public Person() {
		System.out.println("Default");
	}
	
}
public class PersonManager {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("Suresh",5.8 , 70.9 , "123456879");
		Person p3 = new Person("Mahesh",4.8 , 70.9 , "3242343234");
		Person p4 = new Person("LAVA",6.8 , 70.9 , "234234");
		
		System.out.println("Total objects created to the program is " + Person.count);
		
		p1.name = "Aravinda";
		p1.height = 5.9;
		p1.weight = 71.5;
		p1.phonenum = "99450455555";
		
		
		printPersonDetails(p1);
		printPersonDetails(p2);
		printPersonDetails(p3);
		printPersonDetails(p4);
		
		
	}

	public static void printPersonDetails(Person p) {
		System.out.println("**************** PRINTING PERSON OBJ VALUES ***************************");
		System.out.println(p.name);
		System.out.println(p.height);
		System.out.println(p.weight);
		System.out.println(p.phonenum);
		System.out.println(p.country);
		System.out.println("***********************************************************");
		System.out.println();
	}

	
	
}
