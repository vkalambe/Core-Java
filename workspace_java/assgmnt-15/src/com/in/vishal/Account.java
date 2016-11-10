package com.in.vishal;

import java.util.Scanner;

public abstract class Account {
    int id;
    
	public static void main(String[] args)  {
	Account a=new SavingsAccount();
	Scanner sc=new Scanner(System.in);
	int amt=sc.nextInt();
     try {
		a.withdraw(amt);
		
	} catch (Exception e) {
		
		System.out.println("am in main Account");
	}

	}
	public abstract  void withdraw(int b) throws LowBalanceException;

}
