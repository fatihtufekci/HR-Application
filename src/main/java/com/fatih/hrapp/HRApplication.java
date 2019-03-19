package com.fatih.hrapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class HRApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HRApplication.class, args);
	}
}
