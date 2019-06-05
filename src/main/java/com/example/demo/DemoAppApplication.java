package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoAppApplication.class, args);
		EmployeeService empService = context.getBean(EmployeeService.class);
		Employee emp = new Employee("Alex","1100","e-comm","SDE-1");
		empService.addEmployee(emp);
		emp = new Employee("Steev","1101","e-comm","SDE-1");
		empService.addEmployee(emp);
	}

}
