package com.phoenix.demo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Thread(new Process(1,"withdraw",6000));
		Thread t2=new Thread(new Process(1, "withdraw", 5000));
		
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The balance is "+Process.act.balance);
	}

}
