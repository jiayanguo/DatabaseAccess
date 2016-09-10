package com.uta.db.manager;

import com.uta.command.AddUserCommand;
import com.uta.domain.User;

public class MySQL_Impl implements DBInterface{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		AddUserCommand auc=new AddUserCommand(user);
		auc.execute();
	}

	
}
