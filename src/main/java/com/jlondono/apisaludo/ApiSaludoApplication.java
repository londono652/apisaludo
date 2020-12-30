package com.jlondono.apisaludo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jlondono")
public class ApiSaludoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSaludoApplication.class, args);
	}

}
