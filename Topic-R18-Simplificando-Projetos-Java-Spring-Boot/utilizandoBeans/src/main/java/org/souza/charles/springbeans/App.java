package org.souza.charles.springbeans;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
	
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("The Metamorphosis");
		livro.setCodigo("M1915FK");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Franz Kafka");
		
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();
	}

}
