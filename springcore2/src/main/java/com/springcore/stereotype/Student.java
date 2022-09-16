package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Abhishek Lacheta")
	private String name;
	@Value("Barwani")
	private String city;
	@Value("#{adr}")
	private List<String> Address;

	public List<String> getAddress() {
		return Address;
	}

	public void setAddress(List<String> address) {
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}
