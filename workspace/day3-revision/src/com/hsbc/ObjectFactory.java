package com.hsbc;

public class ObjectFactory {
	// counter to track how many times object is created
	private static int counter = 0;
	// this variable will be initialized only once 
	private static Operations operations = null;
	// since the methods needs to return any implementations
	// of Operations we must have Operations as the return
	// type
	
	// this is a single ton factory method
	public static Operations getInstance() {
		if(counter == 0) {
			operations = new ImplTwo();
			counter++;
		}
		return operations;
		
		// return new ImplOne();
	}
}
