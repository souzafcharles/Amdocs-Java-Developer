package org.souza.charles.springboottest;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.souza.charles.springboottest.controller.TestController;

public class TestUnitController {
	
	@Test
	public void testUnit() {
		TestController controller = new TestController();
		String resultado = controller.saudacao("Amdosc");
		assertEquals("Bem-vindo, Amdocs", resultado);
	}

}
