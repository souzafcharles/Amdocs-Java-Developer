package org.souza.charles.personapi.utils;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.souza.charles.personapi.dto.request.PhoneDTO;
import org.souza.charles.personapi.entities.Phone;
import org.souza.charles.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
