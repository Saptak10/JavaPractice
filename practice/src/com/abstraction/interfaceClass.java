package com.abstraction;

interface A{
	void a();
	void b();
	void c();
	void d();
}

class B implements A {
	public void a() {
		System.out.println("A");
	}
	public void b() {
		System.out.println("B");
	}
	public void c() {
		System.out.println("C");
	}
	public void d() {
		System.out.println("D");
	}
}

public class interfaceClass {
	public static void main(String[] args) {
		B b = new B();
		b.a();
		b.b();
		b.c();
		b.d();
	}
}
