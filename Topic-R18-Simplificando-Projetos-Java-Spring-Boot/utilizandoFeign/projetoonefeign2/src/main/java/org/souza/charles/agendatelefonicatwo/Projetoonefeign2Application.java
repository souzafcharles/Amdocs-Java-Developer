package org.souza.charles.agendatelefonicatwo;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //habilita o Feign na aplicação
public class Projetoonefeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetoonefeign2Application.class, args);
	}

}
