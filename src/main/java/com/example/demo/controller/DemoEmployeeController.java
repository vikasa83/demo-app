
package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(
        value = "/demo/v1/employees")
public class DemoEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public DemoEmployeeController() {
    }

    @RequestMapping(
            value = "",
            method = RequestMethod.GET)
    public ResponseEntity<Collection<Employee>> getEmployeeList() {
        return new ResponseEntity<>(employeeService.getEmployeeList(),
                HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{employeeId}",
            method = RequestMethod.GET)
    public ResponseEntity<Employee> getEmployee(
            @PathVariable("employeeId") String employeeId) {
        return new ResponseEntity<>(employeeService.getEmployee(employeeId),
                HttpStatus.OK);
    }

    @RequestMapping(
            value = "/employee",
            method = RequestMethod.POST)
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return new ResponseEntity<>("{\"message\":\"employee added\"}",
                HttpStatus.OK);
    }
}
