package com.briup.tran.Test.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.Hus;
import com.briup.tran.service.HusService;

public class jdbcTest_anno {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp=
				new ClassPathXmlApplicationContext(
						"com/briup/tran/dao/jdbc/jdbc.xml",
						"com/briup/tran/service/jdbc/jdbc_service_anno.xml");
		HusService service=(HusService) cp.getBean("service");
		service.saveHus(new Hus(4, "wangwu", 44));
	}
}
