package com.soap.webservices.demosoap.soap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.soap.webservices.demosoap.soap.bean.Course;

@Component
public class CourseDetailsService {
	//course details
	private static List<Course> courses = new ArrayList<>();
	
	static
	{
		Course course1=new Course(1,"Spring","10 Steps");
		courses.add(course1);
		
		
	}
	

}
