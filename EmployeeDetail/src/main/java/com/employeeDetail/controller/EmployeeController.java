package com.employeeDetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDetail.model.Employee;
import com.employeeDetail.service.EmployeeService;



@RestController
public class EmployeeController {
	
		@Autowired
		EmployeeService empService;
		@GetMapping(value="/fetchEmployees")
		public List<Employee>getAllEmployees(){
			List<Employee>empList=empService.getAllEmployees();
			return empList;
		}
		@PostMapping(value="/saveEmployee")
		public Employee saveEmployee(@RequestBody Employee e)
		{
			return empService.saveEmployee(e);
		}
		@PutMapping(value="/updateEmployee")
		public Employee updateEmployee(@RequestBody Employee e)
		{
			return empService.saveEmployee(e);
		}
		@DeleteMapping(value="/deleteEmployee/{empid}")
		public void deleteEmployee(@PathVariable("empid") int empid)
		{
			empService.deleteEmployee(empid);
		}


}
