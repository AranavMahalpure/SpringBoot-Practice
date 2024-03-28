package com.Codingwallah.Project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController {
     List<Employee> employees = new ArrayList <> ();
    // Mapping to get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employees;
    }
    @PostMapping("employeedata")
    public String createemployees(@RequestBody Employee employee) {
        employees.add(employee);
        return "saved Successfully";
    }
    
}