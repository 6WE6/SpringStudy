package com.briup.tran.Test.mybatis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.Hus;
import com.briup.tran.service.HusService;

public class mybatisTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp=
				new ClassPathXmlApplicationContext(
						"com/briup/tran/dao/mybatis/mybatis.xml",
						"com/briup/tran/service/mybatis/mybatis_service.xml");
		HusService service=(HusService) cp.getBean("service");
		service.saveHus(new Hus(5, "wangwu", 44));
	}
}
