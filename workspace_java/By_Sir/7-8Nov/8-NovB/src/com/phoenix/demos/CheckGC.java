package com.phoenix.demos;

public class CheckGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckGC c=new CheckGC();
		//CheckGC d= c;
		c=null;
		System.gc();

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Fialize method executed");
	}
}
