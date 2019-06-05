package com.example.demo.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

    private Map<String, Employee> employeeMap;
    
    public EmployeeService() {
        employeeMap = new HashMap<String, Employee>();
    }
    
    
    public Collection<Employee> getEmployeeList() {
    	System.out.println("get all employee");
        return employeeMap.values();
    }
    
    public Employee getEmployee(String employeeId) {
    	System.out.println("get employee :: "+employeeId);
        return employeeMap.get(employeeId);
    }

    public Employee addEmployee(Employee employee) {
    	System.out.println("Adding employee");
        return employeeMap.put(employee.getEmployeeId(), employee);
    }
    
}
