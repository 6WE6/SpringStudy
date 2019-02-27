package com.briup.aop.spring.advisor;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.pojo.BookService;

public class AdvisorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/spring/advisor/advisor.xml");
		BookService bs = (BookService) cp.getBean("proxy");
		bs.saveBook(1, "lisi");
		bs.get(1);
		bs.list();
		
	}

}
