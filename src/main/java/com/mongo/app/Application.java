package com.mongo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongo.model.Employee;
import com.mongo.repository.EmpRepository;

@SpringBootApplication 
@EnableMongoRepositories(basePackageClasses = EmpRepository.class)
public class Application implements CommandLineRunner {
	
	@Autowired
	private EmpRepository empRepository;
	
	public static void main(String args[])
	{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(empRepository.findAll());
		/*Employee e = new Employee();
		e.setUsername("User100");
		e.setPassword("sample100");
		e.setRole(100);
		System.out.println(empRepository.save(e));*/
		
		
	}
	

}
