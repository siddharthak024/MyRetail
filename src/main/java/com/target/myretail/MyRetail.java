package com.target.myretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.target.myretail" })
public class MyRetail {

	public static void main(String[] args) {
		SpringApplication.run(MyRetail.class, args);
	}
}