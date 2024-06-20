package com.example.jwt_restapi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.jwt_restapi.repository")
public class JwtRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtRestapiApplication.class, args);
	}

}
