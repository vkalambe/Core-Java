package com.phoenix.demos;

public class UIClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		process1();
		process2();
		
	}
	
	public void process1()
	{
		System.out.println("Process 1 executed");
	}
	
	public void process2()
	{
		System.out.println("Executing process 2");
	}

}
