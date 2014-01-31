package com.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		
		 // Create the root Spring application context
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		//Register @Configuration class AppConfig to application context
        appContext.register(AppConfig.class);
				
		/* Integrates Spring framework into this web application 
		 * project via Spring listener ContextLoaderListener. */
		container.addListener(new ContextLoaderListener(appContext));
        appContext.setServletContext(container);

        //Register and map the dispatcher servlet
		Dynamic servlet = container.addServlet("mvc-dispatcher", new DispatcherServlet(appContext));
		servlet.addMapping("/*");
		servlet.setLoadOnStartup(1);
	}
}