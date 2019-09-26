package com.qf.springboot.staticresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class StaticresourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaticresourceApplication.class, args);
	}

}
