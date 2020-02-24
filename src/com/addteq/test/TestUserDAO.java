package com.addteq.test;

import com.addteq.beans.User;
import com.addteq.dao.UserDao;

public class TestUserDAO 
{
	public static void main(String[] args) 
	{
	User user = new User("sanjay", "sanjay");
	
	UserDao ud = new UserDao();

	boolean status = ud.checkUser(user);
	
	System.out.println(status);
}
}