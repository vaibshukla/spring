package io.vaibhav.application.context.web.servlet3.annotation.config;

import io.vaibhav.application.context.web.servlet3.annotation.ConfigurationComponentScan;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AnnotationWebApplicationInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        context.setServletContext(servletContext); // Setting up servlet context
        context.register(ConfigurationComponentScan.class);
        context.refresh();

        /**
         *  Created the dispatcher servlet and pass the application context
         */
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher" , new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
