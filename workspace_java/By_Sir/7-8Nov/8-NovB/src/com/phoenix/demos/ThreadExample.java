package com.phoenix.demos;

public class ThreadExample extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThreadExample t=new ThreadExample();
			ThreadExample t2=new ThreadExample();
			//Thread t3=new ThreadExample();
			t.setName("First Thread");
			t2.setName("Second Thread");
			t.start();
			t2.start();
			t.join();
			t2.join();
			t2.process4();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("First Thread"))
		{
			process1();
			process2();
		}
		else if(Thread.currentThread().getName().equals("Second Thread"))
		{
			process3();
			
		}

	}

	public void process1()
	{
		System.out.println("Process 1 executed");
	}
	
	public void process3()
	{
		System.out.println("Executing process 3");
	}
	
	public void process2()
	{
		System.out.println("Executing process 2");
	}
	
	public void process4()
	{
		System.out.println("Executing process 4 through 6");
	}
}
