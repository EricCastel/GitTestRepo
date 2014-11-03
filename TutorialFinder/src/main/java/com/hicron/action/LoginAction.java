/*
 * 
 */
package com.hicron.action;

import org.apache.commons.lang3.StringUtils;

import com.hicron.model.User;
import com.hicron.service.LoginService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginAction.
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {
	
	private User user = new User();	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		LoginService loginService = new LoginService();
		if (loginService.verifyLogin(user))
			return SUCCESS;
		else
			return INPUT;
	}
	
	public void validate(){
		if (StringUtils.isEmpty(user.getUserId())){
			addFieldError("userId", "username blank");
		}
		if (StringUtils.isEmpty(user.getPassword())){
			addFieldError("password", "password blank");
		}
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
