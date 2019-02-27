package com.briup.aop.spring.defineaopConfig;


import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.briup.pojo.BookService;
import com.briup.pojo.BookServiceImpl;
import com.briup.pojo.ProductService;

public class DefineAdviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("com/briup/aop/spring/defineaopConfig/defineaopConfig.xml");
		BookService bs = cp.getBean("target1",BookService.class);
		bs.saveBook(1, "wnaeneen");
		
		ProductService ps = cp.getBean("target2",ProductService.class);
		ps.getProduct();

	}

}
