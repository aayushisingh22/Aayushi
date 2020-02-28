package util;


import java.util.HashMap;
import java.util.Map;

import dto.User;

public class UserValidation {

	Map<String, String> mp = new HashMap<String, String>();

	public Map<String, String> validate(User user) {
		
		if(user.getUserName().isEmpty()) {
			  mp.put("userNameError", "enter valid UserName");
			
		}
		if (user.getEmail().isEmpty()) {
			mp.put("emailError", "enter email");
		}
		if (user.getMobile().isEmpty() || user.getMobile().length()!=10) {
			mp.put("mobileError", "enter mobile error");
		}
		for (char i = 0; i < user.getMobile().length(); i++) {
			Character num = user.getMobile().charAt(i);
			if (!(num.isDigit(num))) {
				mp.put("mobileError", "enter mobile error");

			}
		}
			
			if(user.getPassword().isEmpty()) {
				mp.put("passwordError", "enter valid password again");
			}
	
		
	
		return mp;
	}

	public Map<String, String> loginValidation(String email, String password) {
		// TODO Auto-generated method stub
		if (email.isEmpty()) {
			mp.put("emailError", "enter email");
		}
		
		if(password.isEmpty()) {
			mp.put("passwordError", "enter valid password again");
		}
		return mp;
	}
}
