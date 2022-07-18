package com.generics;

import java.util.ArrayList;

class Container<T extends Number>{
	T a;
	T b;
	
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getB() {
		return b;
	}
	public void setB(T b) {
		this.b = b;
	}
	
	public void show() {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
	}
	
	// public void demo(ArrayList<? super T> obj) {
	
	public void demo(ArrayList<? extends T> obj) {
		
	}
}
public class prog1 {
	public static void main(String[] args) {
		Container<Integer> c = new Container<>();
		
		c.show();
		c.demo(new ArrayList<Integer>());
		
	}
}
