package com.saksoft.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.springrest.model.Employee;
import com.saksoft.springrest.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeSevice;
	
	 @GetMapping("/employee")
	    public List<Employee> findAll() {
	        return employeeSevice.findAll();
	    }
	    @GetMapping("/employee/{id}")		 
	    public Employee findById(@PathVariable Long id) {
	        return employeeSevice.findById(id);
	    }
	    @PostMapping("/employee")
	    public Employee save(@RequestBody Employee employee) {
	        return employeeSevice.save(employee);
	    }
	    
	    @PutMapping("/employee/{id}")
	    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
	    	Employee employee = employeeSevice.findById(id);
	    	employee.setFirstname(employeeDetails.getFirstname());
	    	employee.setLastname(employeeDetails.getLastname());
	    	employee.setEmailId(employeeDetails.getEmailId());
	    	employee.setAge(employeeDetails.getAge());
	        return employeeSevice.save(employee);
	    }
	    
	    @DeleteMapping("employee/{id}")
	    public void deleteById(@PathVariable Long id) {
	    	employeeSevice.deleteById(id);
	    }

}
