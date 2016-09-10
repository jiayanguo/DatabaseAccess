package com.uta.command;

import java.sql.Connection;

public abstract class DBTemplate<T> extends DBCommand<T>{
	Connection conn;
	public void connectDB() {
		ConnectDB connectDB = new ConnectDB();
		connectDB.execute();
		conn=(Connection)connectDB.getResult();
	}
	
	public void disconnectDB() {
		DisconnectDB disconnectDB = new DisconnectDB();
		disconnectDB.setResult(conn);
		disconnectDB.execute();
	}
	
	public abstract void queryDB();
	public abstract void processResult();
	public void execute(){
		connectDB();
		queryDB();
		disconnectDB();
		processResult();
	}
}
