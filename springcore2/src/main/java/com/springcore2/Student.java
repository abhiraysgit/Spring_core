package com.springcore2;

public class Student {
	private int studentID;
	private String studentName;
	private String studentAddress;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		System.out.println("Setting Student id ");
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		this.studentAddress = studentAddress;
	}

	public Student(int studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
