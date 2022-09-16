package com.springcore.auto.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wiring/autoconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp);
	}

}
