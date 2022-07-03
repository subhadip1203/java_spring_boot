package com.subhadip.spring_part_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subhadip.spring_part_1.harddrive.SSD;

@SpringBootApplication
public class SpringPart1Application {

	public static void main(String[] args) {
	
		System.out.println("server running ...");
		ConfigurableApplicationContext context = SpringApplication.run(SpringPart1Application.class, args);
		
		SSD toshiba = context.getBean(SSD.class);
		System.out.println(toshiba.toString());

		SSD sony = context.getBean(SSD.class);
		System.out.println(sony.toString());


		System.out.println("server running ...");
	}

}
