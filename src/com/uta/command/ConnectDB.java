package com.uta.command;

import java.sql.Connection;

import com.uta.utils.DBConnection;


public class ConnectDB extends DBCommand<Connection>{

	@Override
	public void execute() {
		DBConnection db=new DBConnection();
		db.getConnect();
		setResult(db.getInstance());
		
	}
}
