package com.cassiano.model;

public class Person {

	private String name;
	private String gender;
	
	

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender;
	}
	
}
