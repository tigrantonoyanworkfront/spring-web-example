package com.workfront.springwebexample.spring;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringServletContextListener implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ExampleApplication.initApplication(servletContextEvent.getServletContext());
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

	}
}
