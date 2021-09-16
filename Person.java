package com.qa.qacommunity;

public class Person {

	private String name;
	private int age;
	private double shoesize;

	



	public Person(String name, int age, double shoesize) {
		this.name = name;
		this.age = age;
		this.shoesize = shoesize;
	}
	
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public Person(String name) {
		this.name=name;
	}



	public void greet() {
		System.out.println("Hi I'm " + name + " and I'm " + age + " years old. My shoe size is " + shoesize);
	}
	
	public static void hello() {
		System.out.println("hello");
	}
}
