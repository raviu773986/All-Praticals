package com.ru.database.databasedemo;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ru.database.databasedemo.entity.Person;
import com.ru.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		logger.info("User id 1002 -> {}", repository.findById(1002));

		logger.info("Inserting 1006 -> {}", repository.insert(new Person(1006, "Tare", "Berlin", new Date(0))));

		logger.info("Updating 1003 -> {}", repository.update(new Person(1003, "Peter", "Dubai", new Date(0))));
		/*
		 * logger.info("All users -> {}", dao.findAll());
		 * logger.info("Deleting 1004  -> NO of rows deleted - {}",
		 * dao.deleteById(1004));
		 * 
		 */
	}

}
