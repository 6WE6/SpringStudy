package com.briup.aop.proxy.jdkproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.pojo.BookService;

public class JdkProxyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/ioc/proxy.xml");
		BookService bs = (BookService) cp.getBean("proxy");
		//System.out.println(bs);
		bs.saveBook(1,"tom");

	}

}
