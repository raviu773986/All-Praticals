package com.soap.webservices.demosoap.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

//enable spring web services
@EnableWs
//its Spring configuration file
@Configuration
public class WebServiceConfig {
	
	//message dispatcher servlet
	//Application context
	//url=>/ws/*
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context){
		
			MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
			messageDispatcherServlet.setApplicationContext(context);
			messageDispatcherServlet.setTransformWsdlLocations(true);
			return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
		}
	
		@Bean(name="courses")
		public DefaultWsdl11Definition  defaultWsdl11Definition(XsdSchema courseSchema)
		{
			DefaultWsdl11Definition defination = new DefaultWsdl11Definition();
			defination.setPortTypeName("CoursePort");
			defination.setTargetNamespace("http://in28minutes.com/courses");
			defination.setLocationUri("/ws");
			defination.setSchema(courseSchema);
			
			return defination;
		}
	
	
		@Bean
		public XsdSchema courseSchema()
		{
			return new SimpleXsdSchema(new ClassPathResource("course-details.xsd"));
		}

}
