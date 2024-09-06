package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.StudentModel;

@RestController
public class HomeController {

	@GetMapping("/hello")
	public String employee() {
		return "hello";
	}

	@GetMapping("/student")
	public List<StudentModel> getStudent() {

		List<StudentModel> list = new ArrayList<>();

		StudentModel s1 = new StudentModel();
		s1.setStdId(101);
		s1.setStdName("kajal");
		s1.setStdAdd("katni");
		s1.setPhone("8965733763");

		StudentModel s2 = new StudentModel();
		s2.setStdId(102);
		s2.setStdName("kajal123");
		s2.setStdAdd("katni123");
		s2.setPhone("89689653763");

		list.add(s1);
		list.add(s2);

		return list;

	}

}
