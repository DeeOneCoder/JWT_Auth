package com.davidson.jwt.JWT_Auth;

import com.davidson.jwt.JWT_Auth.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JwtAuthApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JwtAuthApplication.class, args);
		User user = applicationContext.getBean(User.class);
		System.out.println(user.getEmail());

	}

}
