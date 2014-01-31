package com.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//Register annotated class AppConfig to application context
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.register(AppConfig.class);
		
		/* Integrates Spring framework into this web application 
		 * project via Spring listener ContextLoaderListener. */
		servletContext.addListener(new ContextLoaderListener(webCtx));
		webCtx.setServletContext(servletContext);

		//Add dispatcher servlet to servletContext
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webCtx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		

	}

}