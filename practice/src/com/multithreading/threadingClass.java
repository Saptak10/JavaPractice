package com.multithreading;

class A extends Thread{
	public void run() {
		for(int i = 0 ; i < 5 ; i++) System.out.println("A");
		try { Thread.sleep(1000); } catch(Exception e) { }
	}
}

class B extends Thread{
	public void run() {
		for(int i = 0 ; i < 5 ; i++) System.out.println("B");
		try {Thread.sleep(1000);} catch(Exception e) { }
	}
}

public class threadingClass {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();
	}
}
