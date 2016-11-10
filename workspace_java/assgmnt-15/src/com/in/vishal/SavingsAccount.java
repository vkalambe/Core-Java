package com.in.vishal;

import java.util.Scanner;

public class SavingsAccount extends Account {
	int balance=1000;
	Scanner s=new Scanner(System.in);
	
	public void withdraw(int amt) throws LowBalanceException 
	{
		balance-=amt;
		System.out.println(balance);
			
					if(balance < 0)
					{
						throw new LowBalanceException();
					}
	}



	
}
