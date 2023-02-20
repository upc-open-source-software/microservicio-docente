package com.upc.instituto.docente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioDocenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioDocenteApplication.class, args);
	}

}
