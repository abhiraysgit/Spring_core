package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> frinds;

	private Map<String, Integer> fessstructure;

	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Map<String, Integer> getFessstructure() {
		return fessstructure;
	}

	public void setFessstructure(Map<String, Integer> fessstructure) {
		this.fessstructure = fessstructure;
	}

	public List<String> getFrinds() {
		return frinds;
	}

	public void setFrinds(List<String> frinds) {
		this.frinds = frinds;
	}

	@Override
	public String toString() {
		return "Person [frinds=" + frinds + ", fessstructure=" + fessstructure + "]";
	}

}
