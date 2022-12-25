package io.vaibhav.application.context;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String hello() {
        return "hello";
    }
}
