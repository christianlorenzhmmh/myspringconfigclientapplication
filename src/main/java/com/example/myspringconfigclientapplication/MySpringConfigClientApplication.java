package com.example.myspringconfigclientapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@RefreshScope
public class MySpringConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringConfigClientApplication.class, args);
	}

	@Value("${configuration.projectName}")
	private String projectName;

	@RequestMapping("/project-name")
	String projectName() {
		return this.projectName;
	}
}
