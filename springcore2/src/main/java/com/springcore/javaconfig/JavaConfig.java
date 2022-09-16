package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean(name = {"smosa"})
	public Smosa getSmosa() {
	return	new Smosa();
	}
	
	@Bean(name = { "student","temp"})
	public Student getStudent() {
		Student student = new Student(getSmosa());
		return student;

	}

}
