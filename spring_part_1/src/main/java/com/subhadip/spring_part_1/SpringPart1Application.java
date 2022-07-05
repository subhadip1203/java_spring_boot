package com.subhadip.spring_part_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subhadip.spring_part_1.laptop.AcerLaptop;

@SpringBootApplication
public class SpringPart1Application {

	public static void main(String[] args) {
	
		System.out.println("server running ...");
		ConfigurableApplicationContext context = SpringApplication.run(SpringPart1Application.class, args);
		
		AcerLaptop toshiba = context.getBean(AcerLaptop.class);
		toshiba.printSSD();
		


		System.out.println("server running ...");
	}

}
