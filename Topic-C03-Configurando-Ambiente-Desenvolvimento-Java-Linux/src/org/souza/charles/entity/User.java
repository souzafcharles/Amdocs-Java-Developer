package org.souza.charles.entity;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Daniel Hatanaka
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 4, 2022
 */
import java.util.UUID;

public class User {
    private final UUID code;
    private final String name;

    public User(UUID code, String name) {
        this.code = code;
        this.name = name;
    }

    public UUID getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "code =" + code +
                ", name ='" + name + '\'' +
                '}';
    }
}

