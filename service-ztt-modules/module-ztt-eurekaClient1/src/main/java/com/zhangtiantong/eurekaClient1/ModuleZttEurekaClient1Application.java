package com.zhangtiantong.eurekaClient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ModuleZttEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(ModuleZttEurekaClient1Application.class, args);
	}
}
