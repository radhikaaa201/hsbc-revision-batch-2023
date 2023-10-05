package com.hsbc.examples;

class T2 extends Thread {
	public void run() {
		System.out.println("run() method");
	}
}

public class TestSleep {
	public static void main(String[] args) {
		// Thread.sleep(long ms) it is used to provide delay, throws InterruptedException
		T2 t = new T2();
		t.start();
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() method completes");
	}
}
