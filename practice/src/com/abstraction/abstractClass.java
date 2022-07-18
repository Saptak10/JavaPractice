package com.abstraction;

abstract class M() {
	abstract void m();
}

class N extends M{
	public void m(){
		System.out.println("A");
	}
}

public class abstractClass {
	public static void main(String[] args) {
		N n = new N();
		n.m();
	}
}
