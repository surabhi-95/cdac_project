package app.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodePassword {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String password = "user";
		System.out.println(encoder.encode(password));
		password = "admin";
		System.out.println(encoder.encode(password));
	}

}
