package com.employeeDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeDetail.dao.EmployeeRepository;
import com.employeeDetail.model.Employee;


@Service

public class EmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	public List<Employee> getAllEmployees(){
		List<Employee>empList=empRepository.findAll();
		return empList;
	}
	public Employee saveEmployee(Employee e)
	{
		Employee emp=empRepository.save(e);
		return emp;
	}
	public Employee updateEmployee(Employee e)
	{
		Employee emp=empRepository.save(e);
		return emp;
	}
	public void deleteEmployee(int empid)
	{
		empRepository.deleteById(empid);
	}
	
}
