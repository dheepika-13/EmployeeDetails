package com.employeeDetail.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeDetail.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
