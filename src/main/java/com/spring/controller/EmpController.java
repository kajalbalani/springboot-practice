package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.EmpModel;

@RestController
public class EmpController {
			
	@GetMapping("/emp")
	public EmpModel getEmp() {
		
		return new EmpModel(101, "Teddu", 100000.0);
	}
//	public
	
}
