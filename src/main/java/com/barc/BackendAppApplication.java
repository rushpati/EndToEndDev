package com.barc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableCaching
@SpringBootConfiguration
public class BackendAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BackendAppApplication.class, args);
		int count = ctx.getBeanDefinitionCount();
		System.out.println("count is  " + count);
	}

}
