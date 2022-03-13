package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	LoginService  service;
//	LoginService  service = new LoginService();
	
//	@RequestMapping(value="/login") or
	@RequestMapping(value="/login",method = RequestMethod.GET)
//	@ResponseBody
	public String showLoginPage()
	{
//		return "Hello World dummy";
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password, ModelMap model)
	{
		
		if(!service.validateUser(name, password))
		{
			model.put("errorMessage", "Invalid Credentils");
			return "login";

		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";


	}

}
