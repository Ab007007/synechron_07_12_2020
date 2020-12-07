package com.synechron.java.basic.interfaces;

public class Lion implements Animal, EatsNonVeg
{

	public void maxAge() {
		System.out.println(Animal.max_age);
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat everthing- All living animals");
		
	}
	
	@Override
	public void species() {
		// TODO Auto-generated method stub
		System.out.println("Lives in forest");
		
	}
}
