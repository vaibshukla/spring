package io.vaibhav.dependency.injection.manual;

import io.vaibhav.dependency.injection.commons.service.EmployeeSalaryCalculator;
import io.vaibhav.dependency.injection.commons.dao.EmployeeDao;
import io.vaibhav.dependency.injection.commons.report.PdfSalaryReport;

public class Runner {

    public static void main(String[] args) {
        var employeeReportService = new EmployeeReportService(new EmployeeDao(), new EmployeeSalaryCalculator(), new PdfSalaryReport());
        employeeReportService.generateReport();
    }
}
