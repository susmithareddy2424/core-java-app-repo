package com.sapient.aem.service;

public class Person {
	private String name;
	private Float age;
	
	
	public Person() {
		
	}
	
	public Person(String name, Float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Float getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Float age) {
		this.age = age;
	}
	
	
}
