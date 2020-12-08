package com.synechron.java.basic.interfaces;

public class AnnonymusInnerClassDemo {

	
	public static void main(String[] args) {
		
		Animal am = new Animal() {

			@Override
			public void species() {
		
				System.out.println("my annonymus method");// TODO Auto-generated method stub

			}
		};
		
		System.out.println(am.max_age);
		am.species();
	}
	
}
