package com.lti.demos;

public class Person {
	private String name;
	private int age;
	private double score;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
}
