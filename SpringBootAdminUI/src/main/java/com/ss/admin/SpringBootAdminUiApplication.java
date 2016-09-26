package com.ss.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminUiApplication.class, args);
	}
}
