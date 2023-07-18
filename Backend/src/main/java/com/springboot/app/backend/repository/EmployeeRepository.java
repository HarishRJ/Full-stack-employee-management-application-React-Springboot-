package com.springboot.app.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
