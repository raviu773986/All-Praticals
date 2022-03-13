package com.ru.jpa.hibernate.demohibernate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.ru.jpa.hibernate.demohibernate.DemoHibernateApplication;
import com.ru.jpa.hibernate.demohibernate.entity.Course;

@SpringBootTest(classes=DemoHibernateApplication.class)
public class CourseRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;

	@Test
	public void findBId_basic() {
		Course course = repository.findById(1001L);
		assertEquals("working with JPA1",course.getName());
		
		logger.info("test is running");
	}
	
	@Test
	@DirtiesContext
	public void deleteById_basic() {
		repository.deleteById(1002L);
		assertNull(repository.findById(1002L));
		
	}
	
	@Test
	@DirtiesContext
	public void save_basic() {
		//get a course
		Course course = repository.findById(1001L);
		assertEquals("working with JPA1",course.getName());
		//update the details
		course.setName("working with JPA1 updated");
		//check the value
		Course course1 = repository.findById(1001L);
		assertEquals("working with JPA1 updated",course1.getName());
		
	}
	@Test
	@DirtiesContext
	public void playWithEntityManager() {
		repository.playWithEntityManager();

	}

}
