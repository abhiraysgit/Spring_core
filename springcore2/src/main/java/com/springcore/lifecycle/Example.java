package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Example(String subject) {
		super();
		Subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}

	@PostConstruct
	public void start() {
		// init()

		System.out.println("Starting Method.........");
	}

	@PreDestroy
	public void end() {

		// destroy()
		System.out.println("Ending Method.......");
	}

}
