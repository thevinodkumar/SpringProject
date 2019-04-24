package com.nt.intializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//@Configuration
public class MyWebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		System.out.println("MyWebInitializer.onStartup()");
		AnnotationConfigWebApplicationContext parent = null, child = null;
		ContextLoaderListener listener=null;
		DispatcherServlet servlet=null;
		ServletRegistration.Dynamic reg=null;
		
		parent = new AnnotationConfigWebApplicationContext();
		parent.register(RootInitializer.class);
		child = new AnnotationConfigWebApplicationContext();
		child.register(MVCChildInitializer.class);
		listener=new ContextLoaderListener(parent);
		ctx.addListener(listener);
		servlet=new DispatcherServlet(child);
		reg=ctx.addServlet("ds", servlet);
		reg.addMapping("*.htm");
		reg.setLoadOnStartup(2);
	}

}
