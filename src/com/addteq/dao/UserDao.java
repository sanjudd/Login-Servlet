package com.addteq.dao;

import com.addteq.beans.User;

public class UserDao {

	public boolean checkUser(User user) {

		boolean status = false;

		if (user.getFirst_name().equals("sanjay") && user.getLast_name().equals("sanjay")) {

			status = true;
		}

		return status;
	}

}
