package com.singleton;

public class SingletonClass {
	public static void main(String[] args) {
		Abc obj = new Abc.getInstance();
	}
}

class Abc {
	static Abc obj = new Abc();
	private Abc() {
		
	}
	
	public static Abc getInstance() {
		return obj;
	}
}
