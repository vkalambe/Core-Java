package com.phoenix.demos;

public class GUICreation implements Runnable {

	@Override
	public void run() {
		process1();
		process3();
		SimpleThread s=new SimpleThread();
		int ret_val=0;
		try {
			ret_val = s.process5(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("G"+ret_val);
	}

	public void process1()
	{
		System.out.println("Process 1 executed");
	}
	
	public void process3()
	{
		System.out.println("Process 3 executed");
	}
}
