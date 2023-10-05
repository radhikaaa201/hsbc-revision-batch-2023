package com.hsbc.examples;

public class TestFinalStatic {
	final int x = 10;
	final int y;
	static final int z1 = 55;
	static final int z2;
	TestFinalStatic(int y, int a) {
		this.y = y;
		//this.y = y;
	}
	static {
		z2 = 50;
	}
	/*
	 * Final Non static variables you can either initialize inside the constructor or at the time
	 * of declaration
	 * Final Static variables you can either initialize at the time of declaration or static block
	 */
}
