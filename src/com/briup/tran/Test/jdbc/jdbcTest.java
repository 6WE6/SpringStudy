package com.briup.tran.Test.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.Hus;
import com.briup.tran.service.HusService;

public class jdbcTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp=
				new ClassPathXmlApplicationContext(
						"com/briup/tran/dao/jdbc/jdbc.xml",
						"com/briup/tran/service/jdbc/jdbc_service.xml");
		HusService service=(HusService) cp.getBean("service");
		service.saveHus(new Hus(3, "wangwu", 44));
	}
}
