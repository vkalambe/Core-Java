package com.phoenix.demos;

public class SimpleThread  {

	private int sharedData;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThread st=new SimpleThread();
		
		Thread t1=new Thread(new GUICreation());
		t1.setName("First Thread");
		Thread t2=new Thread(new ConnectionThread());
		t2.setName("Second Thread");
		
		t1.start();
		t2.start();
		try {
			t1.join();
			//t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st.process4();

	}
	
	public void process4()
	{
		System.out.println("Process 4 executed");
	}

	public int process5(int value) throws InterruptedException
	{
		sharedData=value;
		Thread.sleep(20000);
		return sharedData*100;
	}

}
