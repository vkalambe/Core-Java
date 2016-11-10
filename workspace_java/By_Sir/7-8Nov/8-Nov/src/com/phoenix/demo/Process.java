package com.phoenix.demo;

public class Process implements Runnable {

	int id;
	String operation;
	int amount;
	static Account act=new Account(1,"XYZ",10000);
	public Process() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Process(int id, String operation, int amount) {
		super();
		this.id = id;
		this.operation = operation;
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Process [id=" + id + ", operation=" + operation + ", amount=" + amount + "]";
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(operation.equals("withdraw"))
		{
			System.out.println("Running the withdraw method "+this.amount);
			synchronized (act) {
				act.withdraw(amount);
			}
		}
		else
		{
			act.deposit(amount);
		}

	}

}
