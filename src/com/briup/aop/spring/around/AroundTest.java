package com.briup.aop.spring.around;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.pojo.BookService;

public class AroundTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/spring/around/around.xml");
		BookService bs = (BookService) cp.getBean("proxy");
		bs.saveBook(1,"jjjjj");
		
	}

}
