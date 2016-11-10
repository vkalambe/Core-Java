package com.phoenix.demos;

public class RunnableExample {

	public static void main(String[] args) {
		
		try {
			Thread t1=new Thread(new UIClass());
			Thread t2=new Thread(new ConnectData());
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			
			RunnableExample r=new RunnableExample();
			r.process4();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void process4()
	{
		System.out.println("Executing process 4 through 6");
	}




}
