package com.cricket.CricketProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@SpringBootApplication
public class CricketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketProjectApplication.class, args);
	}

}
