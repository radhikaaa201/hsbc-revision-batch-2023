package com.hsbc;

class T1 extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = "+i+", thread name = "+t.getName());
		}
	}
}

public class TestThreads {
	public static void main(String[] args) {
		T1 x = new T1();
		T1 y = new T1();
		//x.setPriority(Thread.MAX_PRIORITY);
		x.start(); // thread enters run method
		y.start(); // thread enters run method
		x.run(); // main thread enters the run method
		System.out.println("done...");
	} // [ thread-0, thread-1, main]
}
