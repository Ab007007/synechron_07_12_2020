package com.synechron.java.basic.interfaces;

public class Cow implements Animal,EatsVegOnly
{
	
	public void maxAge() {
		System.out.println(Animal.max_age);
	}
	 @Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats Grass");
	}
	 
	 @Override
	public void species() {
		// TODO Auto-generated method stub
		System.out.println("Lives in Domastic places");
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm belongs to Cow class";
	}
}
