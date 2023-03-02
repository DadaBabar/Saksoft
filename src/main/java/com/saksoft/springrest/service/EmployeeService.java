package com.saksoft.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.springrest.model.Employee;
import com.saksoft.springrest.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
    public void deleteById(Long id) {
    	employeeRepository.deleteById(id);
    }
}

