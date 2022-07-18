package com.inheritance;

class vehicle{
	void A() {System.out.println("A");}
}

class car extends vehicle {
	void B() {System.out.println("B");}
}

public class prog1 {
	public static void main(String[] args) {
		car c = new car();
		c.A();
		c.B();
	}
}
