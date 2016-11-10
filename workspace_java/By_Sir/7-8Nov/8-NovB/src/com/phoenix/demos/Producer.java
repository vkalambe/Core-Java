package com.phoenix.demos;

class Producer extends Thread {
private SharedData data;
private int number;

public Producer(SharedData c, int number) {
data = c;
this.number = number;
}

public void run() {
for (int i = 0; i < 10; i++) {
data.put(i);
System.out.println("Producer #" + this.number
+ " put: " + i);
try {
sleep((int)(Math.random() * 100));
} catch (InterruptedException e) { }
}
}
}