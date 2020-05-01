package com.barc.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barc.entities.Student;
import com.barc.exceptions.StudentNotFoundExcetion;
import com.barc.services.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/student/{id}")
	public Student findById(@PathVariable int id) throws StudentNotFoundExcetion {
	
		System.out.println("searching by id + " + id);
		return studentService.getStudentById(id);
		
	}
}
