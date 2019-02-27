package com.briup.aop.spring.aopconfig;


import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.briup.pojo.BookService;
import com.briup.pojo.BookServiceImpl;
import com.briup.pojo.ProductService;

public class AopConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/spring/aopconfig/aopconfig.xml");
		BookService bs = cp.getBean("target", BookService.class);
		bs.saveBook(1, "wnaeneen");
		
		ProductService ps = cp.getBean("target1", ProductService.class);
		ps.getProduct();

	}

}
