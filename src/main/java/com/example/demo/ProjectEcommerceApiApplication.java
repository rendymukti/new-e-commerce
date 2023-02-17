package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class ProjectEcommerceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEcommerceApiApplication.class, args);
	}

}
