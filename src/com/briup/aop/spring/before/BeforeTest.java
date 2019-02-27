package com.briup.aop.spring.before;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.pojo.BookService;
import com.briup.pojo.ProductService;

public class BeforeTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/spring/before/before.xml");
		BookService bs = (BookService) cp.getBean("proxy");
		bs.saveBook(1, "tom");
		
		ProductService ps = (ProductService) cp.getBean("proxy1");
		ps.getProduct();
		
				
	}

}
