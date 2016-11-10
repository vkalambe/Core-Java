package com.phoenix.demos;

public class RemoteConnectThread implements Runnable {
	
	public void process3()
	{
		System.out.println("Process 3");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		process3();

	}

}
