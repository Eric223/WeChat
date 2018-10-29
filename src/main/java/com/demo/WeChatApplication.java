package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class WeChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeChatApplication.class, args);
	}


//	 //spring_security
//  @Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
//		passwordEncoder.encode("1234");
//		auth.inMemoryAuthentication()
//				.withUser("user")
//				.password("12345")
//				.roles("user").and().withUser("user3")
//				.password("23456")
//				.roles("user");
//		super.configure(auth);
//	}
}
