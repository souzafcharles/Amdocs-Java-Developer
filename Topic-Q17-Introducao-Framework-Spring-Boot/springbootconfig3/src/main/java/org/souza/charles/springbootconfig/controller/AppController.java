package org.souza.charles.springbootconfig.controller;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 15, 2022
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @GetMapping
    public String welcome() {
        return appMessage;
    }

    @GetMapping("/envVariable")
    public String getEnvironmentVariavle() {
        return "A seguinte variável de ambiente foi passada: " + dbEnvironmentVariable;
    }
}