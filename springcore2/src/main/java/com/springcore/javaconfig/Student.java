package com.springcore.javaconfig;

public class Student {
	private Smosa smosa;

	public void study() {

		System.out.println("studen are study...........");
		this.smosa.display();
	}

	public Student(Smosa smosa) {
		super();
		this.smosa = smosa;
	}
}
