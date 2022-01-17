package org.souza.charles.personapi.enums;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
