package com.hsbc;

public class Client {
	public static void main(String[] args) {
		
		// how many objects of the implementation are created on each getInstance() call?
		
		Operations operation3 = ObjectFactory.getInstance();
		operation3.store();
		System.out.println("__________________________");
		

		Operations operation33 = ObjectFactory.getInstance();
		operation33.store();
		

		Operations operation34 = ObjectFactory.getInstance();
		Operations operation35 = ObjectFactory.getInstance();
		
	}
}
