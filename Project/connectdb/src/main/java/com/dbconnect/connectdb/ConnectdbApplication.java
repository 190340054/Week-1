package com.dbconnect.connectdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.dbconnect.respository")
@SpringBootApplication
public class ConnectdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectdbApplication.class, args);
	}

}
