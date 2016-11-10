package com.phoenix.demos;

public class ConnectionThread implements Runnable {

	@Override
	public void run() {
		process2();
		SimpleThread s=new SimpleThread();
		int ret_val=0;
		try {
			ret_val = s.process5(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("C"+ret_val);
	}

	public void process2()
	{
		System.out.println("Process 2 executed");
	}
}
