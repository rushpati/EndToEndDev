package com.barc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.barc.entities.Employee;
import com.barc.exceptions.StudentNotFoundExcetion;

@RestController
//@Controller
public class CustomerController {

	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public void test() {
		System.out.println("test working ");
	}
	
	@PostMapping("/save/{employee}")
	public void saveCustomer(@RequestBody Employee employee ) {
		System.out.println("payload coming form method  is -  " + employee);
	}

	
	@RequestMapping(value = "/getemp/{id}",method = RequestMethod.GET,produces = "application/json")
	public Employee getCustomer(@PathVariable("id") long id) {
		
		System.out.println("method is calling ");
		try {
			if(!(id==20)) throw new StudentNotFoundExcetion("student is not availabe with id " + id);	
		}
		catch(StudentNotFoundExcetion ex) {
			ex.printStackTrace(); 
		}
		return new Employee(101, "aditya", "Pune");
	}
	
	
}
