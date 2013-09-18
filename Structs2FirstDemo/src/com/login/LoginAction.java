package com.login;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		if(getUsername().equals("matrix") && getPassword().equals("121550")){
			return "success";
		}else
			return "fail";
	}

}
