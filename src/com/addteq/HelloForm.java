package com.addteq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.addteq.beans.User;
import com.addteq.dao.UserDao;

public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
	
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		
		PrintWriter pw = response.getWriter();
		
		UserDao ud = new UserDao();
		User user = new User(first_name, last_name);
		
		if (ud.checkUser(user)) {

			pw.write("Welcome, " + user.getFirst_name());

		} else {

			pw.write("Sorry !");

		}
		pw.close();
	}

}
