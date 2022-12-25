package io.vaibhav.dependency.injection.commons.report;


import io.vaibhav.dependency.injection.commons.domain.EmployeeSalary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("xls-report")
public class XlsSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("Writing Xls Report");
    }
}
