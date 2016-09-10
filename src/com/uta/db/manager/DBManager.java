package com.uta.db.manager;

import com.uta.domain.User;

public class DBManager {
	
	DBInterface imp = new MySQL_Impl();
	public void addUser(User user){
		imp.addUser(user);
	}
	
}
