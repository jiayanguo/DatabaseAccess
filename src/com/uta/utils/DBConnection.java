package com.uta.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private  final String driver = "com.mysql.jdbc.Driver";
	private  final String url = "jdbc:mysql://localhost:3306/login";
	private  final String uid = "root";
	private  final String psd ="gjy";
	private  Connection instance = null;
	
	public  Connection getConnect(){
		
		if(instance==null){
			try{
				Class.forName(driver);
				instance=DriverManager.getConnection(url,uid,psd);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		return instance;
	}
	
	public  Connection getInstance(){
		return instance;
	}
}

