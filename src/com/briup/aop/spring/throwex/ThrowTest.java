package com.briup.aop.spring.throwex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.pojo.BookService;

public class ThrowTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/spring/throwex/throwe.xml");
		BookService bs = (BookService) cp.getBean("proxy");
		bs.saveBook(1,"kdjadk");
		
	}

}
