package io.vaibhav.dependency.injection.manual;

import io.vaibhav.dependency.injection.commons.service.EmployeeSalaryCalculator;
import io.vaibhav.dependency.injection.commons.dao.EmployeeDao;
import io.vaibhav.dependency.injection.commons.domain.Employee;
import io.vaibhav.dependency.injection.commons.domain.EmployeeSalary;
import io.vaibhav.dependency.injection.commons.report.SalaryReport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeReportServiceTest {

    @InjectMocks
    private EmployeeReportService  employeeReportService;

    @Mock
    private EmployeeDao employeeDao;

    @Mock
    private EmployeeSalaryCalculator employeeSalaryCalculator;

    @Mock
    private SalaryReport salaryReport;

    @Mock
    private List<Employee> employeeList;

    @Mock
    private List<EmployeeSalary> employeeSalaries;

    @Test
    public void shouldGeneateSalaryReport() {

        when(employeeDao.findAll()).thenReturn(employeeList);
        when(employeeSalaryCalculator.calculateSalaries(employeeList)).thenReturn(employeeSalaries);

        employeeReportService.generateReport();

        verify(salaryReport).writeReport(employeeSalaries);
    }
}