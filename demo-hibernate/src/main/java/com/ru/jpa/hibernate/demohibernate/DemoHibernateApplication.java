package com.ru.jpa.hibernate.demohibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ru.jpa.hibernate.demohibernate.entity.Course;
import com.ru.jpa.hibernate.demohibernate.repository.CourseRepository;

@SpringBootApplication
public class DemoHibernateApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Course course = repository.findById(1001L);
		logger.info("Course 1001 -> {}",course);
		repository.save(new Course("Micro services in 100 steps"));
		
//		repository.deleteById(1001L);
		
	}

}
