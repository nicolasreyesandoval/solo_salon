package com.solosalon.servicio.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.web.ServerProperties;
//
//import java.time.Duration;

@SpringBootApplication
public class ServicioRegistrarUsuarioApplication {

	public static void main(String[] args) {
//		ServerProperties serverProperties = new ServerProperties();
//		Duration duration = Duration.ofMillis(1);
//		serverProperties.setConnectionTimeout(duration);
		SpringApplication.run(ServicioRegistrarUsuarioApplication.class, args);
	}

}
