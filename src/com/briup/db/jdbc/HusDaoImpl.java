package com.briup.db.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;


import com.briup.db.Hus;
import com.briup.db.HusDao;

public class HusDaoImpl implements HusDao{
	private DataSource datasource;
	@Override
	public void updateHus(Hus hus) {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			//从数据源中获取连接对象
			conn=datasource.getConnection();
			System.out.println("conn:"+conn);
			String sql = "select * from Hus";
			/*
			 * 指向sql操作
			 */
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			//conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	public DataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

}
