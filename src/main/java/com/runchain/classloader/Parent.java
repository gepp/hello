package com.runchain.classloader;

public class Parent {
	static {
		System.out.println("parent init");
	}
	
	public  static int v =100;
}
