package com.uta.command;

public abstract class DBCommand <T> {

	T result;
	
	public abstract void execute();
	
	public void setResult(T result) {
		this.result = result;
	}
	
	public Object getResult(){
		return result;
	}
}
