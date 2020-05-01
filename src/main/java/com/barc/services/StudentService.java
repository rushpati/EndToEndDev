package com.barc.services;

import java.rmi.StubNotFoundException;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.barc.entities.Student;
import com.barc.exceptions.StudentNotFoundExcetion;

@Service
public class StudentService {

//	@Autowired
//	private StudentRepository studetnRepository;

	@Cacheable("student")
	public Student getStudentById(int id) throws StudentNotFoundExcetion {

		try {
			if (id == 0) {
				throw new StudentNotFoundExcetion(" Student not availabe with id " + id);
			}	
		}catch(StudentNotFoundExcetion ex ){
			throw new StudentNotFoundExcetion("student not found with id " + id );
		}
		
		return new Student(10, "hjarsh", "address");

	}
}
