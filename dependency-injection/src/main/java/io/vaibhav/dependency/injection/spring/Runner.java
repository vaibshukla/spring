package io.vaibhav.dependency.injection.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = getSpringContext("pdf-report");

        EmployeeReportService employeeReportService = context.getBean(EmployeeReportService.class);
        employeeReportService.generateReport();

        context.close(); // Closed the application context

    }

    private static AnnotationConfigApplicationContext getSpringContext(String profile) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); // Created the AnnotationConfigApplicationContext
        context.getEnvironment().setActiveProfiles(profile); // Set the active profile.
        context.register(Configuration.class); // Provided the configuration classes
        context.refresh(); // Referesh the context , so that load the bean
        return context;
    }
}
