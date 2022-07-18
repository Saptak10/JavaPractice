package com.abstraction;

abstract class rameshPhone{
	public void call() {
		System.out.println("Calling");
	}
	abstract void camera();
	abstract void settings();
	abstract void internet();
	abstract void message();
	
}

class sureshPhone extends rameshPhone{
	public void camera() {
		System.out.println("Clicking");
	}
	public void settings() {
		System.out.println("Settings");
	}
	public void internet() {
		System.out.println("Internet");
	}
	public void message() {
		System.out.println("Message");
	}
}

public class abstractClass2 {
	public static void main(String[] args) {
		sureshPhone s = new sureshPhone();
		s.call();
		s.camera();
		s.settings();
		s.internet();
		s.message();
	}
}
