package io.vaibhav.spring.aop.service;

import io.vaibhav.spring.aop.aop.annotations.CustomLogger;
import io.vaibhav.spring.aop.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;



    @CustomLogger
    public void findAllEmployee() {

        System.out.println("Executing the findAllEmployee method");
    }

}
