package io.vaibhav.dependency.injection.commons.dao;



import io.vaibhav.dependency.injection.commons.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class EmployeeDao {
    public List<Employee> findAll() {
        System.out.println("Finding all employees");
        return Collections.emptyList();
    }
}
