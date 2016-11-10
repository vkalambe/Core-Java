package com.phoenix.demos;

public class UIThread implements Runnable {

	public void process1()
	{
		System.out.println("Process 1");
	}
	
	public void process2()
	{
		System.out.println("Process 2");
	}
	
	@Override
	public void run() {
		
		process1();
		process2();
	}

}
