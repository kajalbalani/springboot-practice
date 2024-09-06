package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.EmployeeDAO;
import com.spring.repository.EmployeeRepo;



@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeRepo empRepo ;
	
	@GetMapping("/getEmployee")
	public EmployeeDAO getEmp() {
		
		
		
		EmployeeDAO emp = empRepo.findById(101L).get();
		
		return emp;
		
		
	}

}
