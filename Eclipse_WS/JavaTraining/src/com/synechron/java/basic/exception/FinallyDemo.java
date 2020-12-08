package com.synechron.java.basic.exception;

public class FinallyDemo {
	
	public static void main(String[] args) {
		
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
