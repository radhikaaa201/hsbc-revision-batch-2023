package com.hsbc;

public class ImplTwo implements Operations {

	public ImplTwo() {
		System.out.println("ImplTwo object is created!");
	}
	
	@Override
	public void store() {
		System.out.println("store() inside ImplTwo");
	}

}
