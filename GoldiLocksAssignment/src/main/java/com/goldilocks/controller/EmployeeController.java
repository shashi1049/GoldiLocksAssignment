package com.goldilocks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goldilocks.exception.EmployeeExcep;
import com.goldilocks.model.Employee;
import com.goldilocks.service.EmployeeServ;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServ employeeServ;
	
	
	@PostMapping("/RegEmp")
	public ResponseEntity<Employee> registerEmployee(@RequestBody Employee employee) throws EmployeeExcep{
		
		Employee emp = employeeServ.registerEmployee(employee);
		
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
	

}
