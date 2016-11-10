package com.phoenix.demos;

class Consumer extends Thread {
	   private SharedData data;
	   private int number;
	   public Consumer(SharedData c, int number) {
	      data = c;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	         for (int i = 0; i < 10; i++) {
	            value = data.get();
	            System.out.println("Consumer #" 
				+ this.number
	+ " got: " + value);
	}
	}
	}
