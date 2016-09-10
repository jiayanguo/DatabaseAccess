package com.uta.command;

import java.sql.Connection;
import java.sql.SQLException;

public class DisconnectDB extends DBCommand<Connection>{

	@Override
	public void execute(){
		try {
			if(getResult()!=null){
				Connection conn=(Connection)getResult();
				conn.close();
				System.out.println("DB close correctly!");
			}else{
				System.out.println("DB do not close correctly!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}	
}
