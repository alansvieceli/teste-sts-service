package com.alanvieceli.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alanvieceli.api.services.ExemploService;

@SpringBootApplication
public class TesteServiceApplication {

	@Autowired
	private ExemploService exemploService;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args ->{
			this.exemploService.testarServico();
		};
	}
}
