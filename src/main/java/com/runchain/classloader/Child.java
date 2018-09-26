package com.runchain.classloader;

public class Child extends Parent {
	static {
		System.out.println("child init ");
	}

	public static void main(String[] args) {
		Child c = new Child();
		
	}
}
