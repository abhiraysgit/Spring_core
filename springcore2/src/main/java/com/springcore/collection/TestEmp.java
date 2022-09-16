package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collection/collectionconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCoureses());
		System.out.println(emp1.getPassword());
		System.out.println(emp1.getPhones().getClass().getName());
	}

}
