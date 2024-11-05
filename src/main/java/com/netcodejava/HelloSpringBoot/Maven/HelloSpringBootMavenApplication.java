package com.netcodejava.HelloSpringBoot.Maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootMavenApplication.class, args);
                System.out.println("Main Run");
	}
}
