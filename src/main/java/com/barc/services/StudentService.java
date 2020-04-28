package com.barc.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.barc.entities.Student;

@Service
public class StudentService {

	
//	@Autowired
//	private StudentRepository studetnRepository;
	
	
	@Cacheable("student")
	public Student getStudentById(int id) {
		
		
		System.out.println("getting student by id from service");
		
		try {
			System.out.println("going for sleep for 5 sec ");
			Thread.sleep(1000*5);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return new Student(102, "Rushi", "Pune");
		
	}
}
