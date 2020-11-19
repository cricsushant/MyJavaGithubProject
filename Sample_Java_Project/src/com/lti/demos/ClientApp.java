package com.lti.demos;

public class ClientApp {
	public static void main(String[] args) {
		Person p = new Person("Sushant", 25, 100.12);
		System.out.println(p);
		
		Person p1 = new Person("Jay", 34, 102.1);
		System.out.println(p1);
		
		Person p2 = new Person("Sujal", 14, 102.1);
		System.out.println(p2);
		
		Person p3 = new Person("Sujal", 16, 122.1);
		System.out.println(p3);
	}
}
