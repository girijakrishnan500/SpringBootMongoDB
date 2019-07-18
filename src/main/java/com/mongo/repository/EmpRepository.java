package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.model.Employee;

@Repository("empRepository")
public interface EmpRepository extends MongoRepository<Employee,String> {

}
