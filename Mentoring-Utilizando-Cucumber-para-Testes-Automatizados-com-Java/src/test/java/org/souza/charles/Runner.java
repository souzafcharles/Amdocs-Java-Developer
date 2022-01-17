package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Bruno Flávio Ferreira
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"})
public class Runner {
}
