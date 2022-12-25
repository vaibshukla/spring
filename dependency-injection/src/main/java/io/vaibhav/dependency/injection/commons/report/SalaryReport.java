package io.vaibhav.dependency.injection.commons.report;


import io.vaibhav.dependency.injection.commons.domain.EmployeeSalary;

import java.util.List;

public interface SalaryReport {
    void writeReport(List<EmployeeSalary> employeeSalaries);
}
