package com.hsbc;

class R1 implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = "+i+", thread name = "+t.getName());
		}
	}
}

public class TestThreads2 {
	public static void main(String[] args) {
		R1 r = new R1();
		//r.start();
		Thread t = new Thread(r);
		t.start();
		Thread t2 = new Thread(r, "DBCaller"); // 2nd argument is the thread name
		t2.start();
		// create a Lambda expression for Runnable & pass it to a Thread & call the start()
	} 
}
