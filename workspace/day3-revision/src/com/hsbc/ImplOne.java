package com.hsbc;

public class ImplOne implements Operations {

	@Override
	public void store() {
		System.out.println("store() inside ImplOne");
	}

}
