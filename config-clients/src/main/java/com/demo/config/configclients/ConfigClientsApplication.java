package com.demo.config.configclients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientsApplication.class, args);
	}

}
