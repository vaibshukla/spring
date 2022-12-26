package io.vaibhav.spring.aop;

import io.vaibhav.spring.aop.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        EmployeeService em = context.getBean(EmployeeService.class);
        em.findAllEmployee();
    }
}
