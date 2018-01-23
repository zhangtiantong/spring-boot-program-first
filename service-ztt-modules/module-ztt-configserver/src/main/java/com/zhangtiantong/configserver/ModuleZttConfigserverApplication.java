package com.zhangtiantong.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ModuleZttConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleZttConfigserverApplication.class, args);
	}


}
