package com.barc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barc.entities.Employee;

@Repository
public interface StudentRepository extends CrudRepository<Employee,Long>{
	
}
