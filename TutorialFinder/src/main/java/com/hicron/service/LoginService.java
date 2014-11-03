package com.hicron.service;

import com.hicron.model.User;

public class LoginService {
	public boolean verifyLogin(User user) {
		if (user.getUserId().equals("suchy")
				&& user.getPassword().equals("suchy"))
			return true;
		else
			return false;
	}
}
