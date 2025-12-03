package com.motos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication habilita auto-configuración, escaneo de componentes y configura la aplicación Spring Boot.
@SpringBootApplication
public class MotosApplication {
	public static void main(String[] args) {

		// El main arranca la aplicación embebida (Tomcat por defecto), crea el contexto de Spring y registra los beans (controllers, repositories, services, etc.).
		SpringApplication.run(MotosApplication.class, args);
		// En el arranque Spring detecta tu @Entity y configura JPA/Hibernate según application.properties
	}
}
