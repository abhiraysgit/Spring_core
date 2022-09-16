package com.springcore.ci;

public class Addtion {
	private int a;
	private int b;

	public Addtion(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor double: double");

	}

	public Addtion(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor int : int ");

	}

	public Addtion(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor string : string ");

	}

	public void dosum() {

		System.out.println("Sum is =" + (this.a + this.b));
		System.out.println("Value of a....." + (this.a));
		System.out.println("Value of b......." + this.b);

	}
}
