package com.uta.command;

import java.sql.PreparedStatement;

import com.uta.domain.User;

public class AddUserCommand extends DBTemplate<User>{
	public AddUserCommand(User user){
		this.setUser(user);
	}
	
	public void setUser(User user){
		this.setResult(user);
	}

	@Override
	public void queryDB() {
		// TODO Auto-generated method stub
		String sql="insert into user(id,username, password, email, birthday, nickname) values (?,?,?,?,?,?)";
		User user=(User) this.getResult();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,user.getId());
			ps.setString(2,user.getUsername());
			ps.setString(3,user.getPassword());
			ps.setString(4,user.getEmail());
			ps.setString(5,user.getBirthday().toString());
			ps.setString(6,user.getNickname());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void processResult() {
		// TODO Auto-generated method stub
		
	}

}
