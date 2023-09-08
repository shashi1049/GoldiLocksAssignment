package com.goldilocks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goldilocks.exception.EmployeeExcep;
import com.goldilocks.model.Employee;

@Service
public interface EmployeeServ {
	
	public Employee registerEmployee(Employee emp) throws EmployeeExcep;
	
	public Employee EmployeeByID(int id)throws EmployeeExcep;

    public List<Employee> viewAllEmployee()throws EmployeeExcep;

    

}
