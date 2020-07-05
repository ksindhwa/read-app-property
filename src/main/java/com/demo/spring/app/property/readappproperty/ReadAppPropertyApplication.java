package com.demo.spring.app.property.readappproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.demo.spring.app.property")
@SpringBootApplication
public class ReadAppPropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadAppPropertyApplication.class, args);
	}

}
