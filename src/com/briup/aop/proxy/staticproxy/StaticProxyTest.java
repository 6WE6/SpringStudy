package com.briup.aop.proxy.staticproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.pojo.BookService;

public class StaticProxyTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/proxy/staticproxy/staticproxy.xml");
		BookService bs = (BookService) cp.getBean("service");
		bs.saveBook(1, "java");
		bs.get(1);
		bs.list();

	}

}
