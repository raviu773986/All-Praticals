package com.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication    //indicates this is spring context file
//it enanbles autoconfiguration and componenetscan

public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
		for(String name :  applicationContext.getBeanDefinitionNames())
		{
			System.out.println(name);   //names of all the beans present
		}
	}

}
