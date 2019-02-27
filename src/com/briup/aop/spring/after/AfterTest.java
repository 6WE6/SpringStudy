package com.briup.aop.spring.after;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.pojo.BookService;

public class AfterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/spring/around/around.xml");
		BookService bs = (BookService) cp.getBean("proxy");
		bs.saveBook(1, "jjjj");
		

	}

}
