package io.vaibhav.dependency.injection.commons.report;



import io.vaibhav.dependency.injection.commons.domain.EmployeeSalary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("pdf-report")
public class PdfSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("Writing Pdf Report");
    }
}
