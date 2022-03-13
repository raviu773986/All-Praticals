package com.assignment2.demoperson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment2.demoperson.entity.Person;
import com.assignment2.demoperson.repository.PersonRepository;

@SpringBootApplication
public class DemoPersonApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonRepository repository;

	
	public static void main(String[] args) {
		SpringApplication.run(DemoPersonApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		Person person = repository.findById(1L);
		logger.info("Person 1 -> {}",person);
//		repository.save(new Person("Baharat","4000","ase"));
		
		repository.deleteById(1L);
		
	}
	


}
