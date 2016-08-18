package com.workfront.springwebexample.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;

@ComponentScan(basePackages = "com.workfront.springwebexample")
@Configuration
public class ExampleApplication {
	public final static String APPLICATIONCONTEXT_SERVLET_CONTEXT_KEY = ExampleApplication.class.getCanonicalName() + ":spring.applicationContext";

	public static void initApplication(ServletContext servletContext) {
		System.out.println("Starting ExampleApplication, creating application context ...");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleApplication.class);
		servletContext.setAttribute(APPLICATIONCONTEXT_SERVLET_CONTEXT_KEY, applicationContext);
	}

	public static ApplicationContext getApplicationContext(ServletContext servletContext) {
		return (ApplicationContext)servletContext.getAttribute(APPLICATIONCONTEXT_SERVLET_CONTEXT_KEY);
	}
}
