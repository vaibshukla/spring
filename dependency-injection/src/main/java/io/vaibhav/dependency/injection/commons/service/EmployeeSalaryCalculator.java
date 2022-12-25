package io.vaibhav.dependency.injection.commons.service;



import io.vaibhav.dependency.injection.commons.domain.Employee;
import io.vaibhav.dependency.injection.commons.domain.EmployeeSalary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class EmployeeSalaryCalculator {
    public List<EmployeeSalary> calculateSalaries(List<Employee> employees) {
        System.out.println("Calculating salaries");
        return Collections.emptyList();
    }
}
