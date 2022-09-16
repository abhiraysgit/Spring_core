package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("ob", Student.class);
		System.out.println(student.hashCode());

		System.err.println("+++++++++++++++++++++++++++++++++++");
		System.out.println(student.getName());
		System.out.println(student.getCity());
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());

		Student student1 = context.getBean("ob", Student.class);
		System.out.println(student1.hashCode());

		System.err.println("++++++++++++++++++++++++++++++++++++");

		Teacher teacher = context.getBean("teacher", Teacher.class);
		System.out.println(teacher.hashCode());
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher1.hashCode());
	}

}
