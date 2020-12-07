package com.synechron.java.basic.interfaces;

public class AnimalManager {

	
	public static void main(String[] args) {
		
		Cow c = new Cow();
		Lion l = new Lion();
		
		
		c.species();
		c.eat();
		c.maxAge();
		l.species();
		l.eat();
		l.maxAge();
	}
}
