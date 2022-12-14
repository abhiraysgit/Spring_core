package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		/*
		 * Smosa s1 = (Smosa) context.getBean("s1"); System.out.println(s1);
		 * 
		 * System.out.println("+++++++++++++++++++++++++"); Pepsi p1 = (Pepsi)
		 * context.getBean("p1"); System.out.println(p1);
		 */
		// registring shutdown Hook

		context.registerShutdownHook();
		Example example = (Example) context.getBean("example");
		System.out.println(example);

	}

}
