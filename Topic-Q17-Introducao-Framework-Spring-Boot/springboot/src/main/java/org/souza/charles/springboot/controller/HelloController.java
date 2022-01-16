package org.souza.charles.springboot.controller;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 15, 2022
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Hello, Digital Innovation One and Amdocs!";
    }
}
