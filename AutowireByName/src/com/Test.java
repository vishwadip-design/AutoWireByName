package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appcon=new ClassPathXmlApplicationContext("book.xml");
		Book b2=(Book)appcon.getBean("book");
		System.out.println(b2);
	}

}
