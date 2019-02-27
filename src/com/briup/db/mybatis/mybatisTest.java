package com.briup.db.mybatis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.Hus;
import com.briup.db.HusDao;

public class mybatisTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp=
				new ClassPathXmlApplicationContext(
						"com/briup/db/mybatis/mybatis.xml");
		HusDao dao=(HusDao) cp.getBean("husDao");
		dao.updateHus(new Hus(1, "jake", 100));
	}
}
