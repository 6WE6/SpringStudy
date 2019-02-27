package com.briup.db.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp=
				new ClassPathXmlApplicationContext(
						"com/briup/db/jdbc/jdbc.xml");
		HusDaoImpl dao=(HusDaoImpl) cp.getBean("dao");
		dao.updateHus(null);
		
	}
}
