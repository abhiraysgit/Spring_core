package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> coureses;
	private Properties password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCoureses() {
		return coureses;
	}

	public void setCoureses(Map<String, String> coureses) {
		this.coureses = coureses;
	}

	public Properties getPassword() {
		return password;
	}

	public void setPassword(Properties password) {
		this.password = password;
	}

	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> coureses,
			Properties password) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.coureses = coureses;
		this.password = password;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
