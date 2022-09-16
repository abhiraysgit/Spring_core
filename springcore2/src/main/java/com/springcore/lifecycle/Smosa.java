package com.springcore.lifecycle;

public class Smosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price.....");
		this.price = price;
	}

	public Smosa(double price) {
		super();
		this.price = price;
	}

	public Smosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Smosa [price=" + price + "]";
	}

	public void init() {

		System.out.println("Inside init Method");
	}

	public void destroy() {
		System.out.println("Inside destroy Method");

	}

}
