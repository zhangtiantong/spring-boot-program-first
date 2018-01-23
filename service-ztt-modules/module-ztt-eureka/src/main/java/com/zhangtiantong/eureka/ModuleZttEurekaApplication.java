package com.zhangtiantong.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ModuleZttEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleZttEurekaApplication.class, args);
    }


}
