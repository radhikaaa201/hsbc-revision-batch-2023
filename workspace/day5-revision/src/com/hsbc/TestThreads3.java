package com.hsbc;


public class TestThreads3 {
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("r1 run Name = "+Thread.currentThread().getName());
		
		Runnable r2 = () -> { 
			System.out.println("r2 run Name = "+Thread.currentThread().getName());
		};
		
		// Thread object that accepts the runnable type
		Thread t1 = new Thread(r1, "ServiceCaller");
		Thread t2 = new Thread(r2, "DBCaller");
		t1.start();
		t2.start();
		// passing lambda expression of Runnable directly to Thread
		Thread t3 = new Thread(() -> System.out.println("run "+Thread.currentThread().getName()), 
				"ControllerThread");
		t3.start();
	} 
}
