package com.phoenix.demos;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread t=new Thread();
		try {
			Thread t1=new Thread(new UIThread());
			Thread t2=new Thread(new RemoteConnectThread());
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			ThreadDemo demo=new ThreadDemo();
			demo.process4();
			demo.process5();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		})*/

	}
	
	public void process4()
	{
		System.out.println("Process 4");
	}
	
	public void process5()
	{
		System.out.println("Process 5");
	}

}








