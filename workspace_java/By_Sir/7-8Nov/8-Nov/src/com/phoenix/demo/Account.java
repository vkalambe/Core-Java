package com.phoenix.demo;

public class Account {
	
	int id;
	String name;
	int balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public synchronized void withdraw(int amount)
	{
		System.out.println("Amount received in the method "+amount);
		balance-=amount;
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deposit(int amount)
	{
		balance+=amount;
	}
}







