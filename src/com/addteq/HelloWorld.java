package com.addteq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld extends HttpServlet {
private static final long serialVersionUID = 1L;
       
   String message ="Hello Sanjay";
    public HelloWorld() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello World");
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println(message);
	}

}
