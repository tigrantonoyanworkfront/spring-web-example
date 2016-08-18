package com.workfront.springwebexample.web;

import com.workfront.springwebexample.main.User;
import com.workfront.springwebexample.main.UserService;
import com.workfront.springwebexample.spring.ExampleApplication;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet{
	private UserService userService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		userService = (UserService)ExampleApplication.getApplicationContext(config.getServletContext()).getBean(UserService.class);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		User user = userService.getById(req.getParameter("id"));
		writer.append("Hello User - " + user.getName() + " with id = " + user.getId());
	}
}
