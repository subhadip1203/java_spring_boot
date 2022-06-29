package com.subhadip.spring_part_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPart1Application {

	public static void main(String[] args) {
		System.out.println("server running ...");
		SpringApplication.run(SpringPart1Application.class, args);
		System.out.println("server running ...");
	}

}
