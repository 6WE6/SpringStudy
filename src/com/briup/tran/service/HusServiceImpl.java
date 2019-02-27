package com.briup.tran.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.briup.db.Hus;
import com.briup.tran.HusDao1;
//@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
public class HusServiceImpl implements HusService{
	private HusDao1 dao;
	
	@Override
	public void saveHus(Hus hus) {
		// TODO Auto-generated method stub
		dao.saveHus(hus);
	}
	public HusDao1 getDao() {
		return dao;
	}
	public void setDao(HusDao1 dao) {
		this.dao = dao;
	}

}
