package com.ru.database.databasedemo;
import java.sql.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ru.database.databasedemo.entity.Person;
import com.ru.database.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 1003 -> {}", dao.findById(1003));
		logger.info("Deleting 1004  -> NO of rows deleted - {}", dao.deleteById(1004));
		logger.info("Inserting 1006 -> {}", dao.insert(new Person(1006,"Tare","Berlin",new Date(0))));
		
		logger.info("Updating 1003 -> {}", dao.update(new Person(1003,"Peter","Dubai",new Date(0))));

	}

}
