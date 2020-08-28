package com.example.notesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.example.noteservice")
@EnableJpaRepositories(basePackages = "com.example.noteservice.repo")
@EntityScan("com.example.noteservice.model")
public class NotesserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesserviceApplication.class, args);
	}
}
