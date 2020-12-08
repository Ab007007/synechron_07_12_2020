package com.synechron.java.basic.exception;

import java.util.Scanner;

public class ThrowDemo
{
	static double balance = 10000;
	static double tempBalance = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdraw = 0;
		String choice = "no";
		do {
			System.out.println("---Welcome to Amount Withdraw ----");
			System.out.println("Enter the amount you want to withdraw");
			withdraw = sc.nextInt();
			tempBalance = balance - withdraw;
			if(tempBalance <= 0) {
				try 
				{
					throw new BalanceInsufficientException(balance);
				} 
				catch (BalanceInsufficientException e) {
					System.out.println(e.getMessage());
				}
			}
			else {
				balance = tempBalance;
				System.out.println("your current balace after transaction is " + (int)balance);
				
			}
			System.out.println("Do you want to continue the transaction");
			choice = sc.next();
						
			
		}while(choice.equalsIgnoreCase("yes"));
			
		
		System.out.println("------ BYE BYE ------");
	}

}
