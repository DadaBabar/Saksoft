package com.saksoft.springrest.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saksoft.springrest.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
	public String findById(int id);

	public Employee save(Employee employee);

	}
