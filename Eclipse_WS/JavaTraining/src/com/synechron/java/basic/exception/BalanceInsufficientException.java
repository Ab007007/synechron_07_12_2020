package com.synechron.java.basic.exception;
// 1. make sure your class has suffix with Excepiton
// 2. class should be subclass of Exception class
// 3. 2 constructor 1. Default 2. parametarized



public class BalanceInsufficientException  extends Exception
{
	
	public BalanceInsufficientException() {
		System.out.println("Your Balance is too low to make the transaction");
	}

	
	public BalanceInsufficientException(double balance) {
		System.out.println("Your balance is too low, you have " + (int)balance + " amount in your account");
			
	}
	
	
	@Override
	public String getMessage() {
		return "************* First credit to account then debit *************";
	}
}
