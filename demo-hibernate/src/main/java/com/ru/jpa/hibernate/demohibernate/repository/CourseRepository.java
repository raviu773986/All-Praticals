package com.ru.jpa.hibernate.demohibernate.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ru.jpa.hibernate.demohibernate.entity.Course;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	public Course findById(Long id)
	{
		return em.find(Course.class, id);
	}
	
	public void deleteById(Long id)
	{
		Course course=findById(id);
		em.remove(course);
	}
	
	public Course save(Course course)
	{
		if(course.getId()==null) 
		{
			//insert
			em.persist(course);
		}
		else
		{
			//update
			em.merge(course);
		}
		return course;
	}
	
	
	public void playWithEntityManager()
	{
//		logger.info("play With entityManager started");
//		Course course = (new Course("web services in 1000 steps"));
//		em.persist(course);
//		course.setName("web services in 1000 steps - updated");
		
		Course course1 = (new Course("java in 1000 steps"));
		em.persist(course1);
		Course course2 = (new Course("html in 1000 steps"));
		em.persist(course2);
		
		em.flush();
		
		em.clear();
		
		em.detach(course1);
		em.detach(course2);
		
		course1.setName("java in 1000 steps - updated");
		em.flush();

		course2.setName("html in 1000 steps - updated");
		em.flush();
	}
	
}
