package com.ru.rest.webservice.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//controller  ie we tells spring that this is a controller

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	//GET
	//URI - /hello-world
	// method- returns "hello world"
	
//	@RequestMapping(method=RequestMethod.GET,path="/hello-world")   or
	@GetMapping(path="/hello-world")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	//uri as-> /hello-world-path-name/ravikant
	@GetMapping(path="/hello-world-path-name/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	@GetMapping(path="/hello-world-intz")
//	public String helloIntz()
//	{
//		return "Hello World";
//	}
	
	public String helloIntz()
	//(@RequestHeader(name="Accept-Language", required=false) Locale locale) 
	{
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
	
}


