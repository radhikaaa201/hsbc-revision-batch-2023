package com.hsbc.examples;

class Data {
	int rollNo;
	String name;
	public Data(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
}
public class TestData {
	public static void main(String[] args) {
		Data d1 = new Data(10, "Pavan");
		Data d2 = new Data(10, "Pavan");
		Data d3 = d1;
		String result = "";
		if(d1.equals(d2))
			result = result + "y";
		if(d1 == d2)
			result = result + "y";
		if(d1 == d3)
			result = result + "y";
		System.out.println(result);
	}
}
