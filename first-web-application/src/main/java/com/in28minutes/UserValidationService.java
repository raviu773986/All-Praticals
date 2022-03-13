package com.in28minutes;

public class UserValidationService {
	
	public boolean isUserValid(String user,String password)
	{
		if(user.equals("ravikant") && password.equals("r123"))
			return true;
		
		return false;
	}

}
