package io.vaibhav.dependency.injection.manual;

import io.vaibhav.dependency.injection.commons.service.EmployeeSalaryCalculator;
import io.vaibhav.dependency.injection.commons.dao.EmployeeDao;
import io.vaibhav.dependency.injection.commons.domain.Employee;
import io.vaibhav.dependency.injection.commons.domain.EmployeeSalary;
import io.vaibhav.dependency.injection.commons.report.SalaryReport;

import java.util.List;

/***
 *  Service class to provide the report functionality
 */
public class EmployeeReportService {

    private final EmployeeDao employeeDao;

    private final EmployeeSalaryCalculator  employeeSalaryCalculator;

    private final SalaryReport salaryReport;

    public EmployeeReportService(EmployeeDao employeeDao, EmployeeSalaryCalculator employeeSalaryCalculator, SalaryReport salaryReport) {
        this.employeeDao = employeeDao;
        this.employeeSalaryCalculator = employeeSalaryCalculator;
        this.salaryReport = salaryReport;
    }


    public void generateReport() {
        List<Employee> employees = employeeDao.findAll();

        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

        salaryReport.writeReport(employeeSalaries);

    }
}
