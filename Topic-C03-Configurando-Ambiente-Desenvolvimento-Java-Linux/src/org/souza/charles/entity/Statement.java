package org.souza.charles.entity;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Daniel Hatanaka
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 4, 2022
 */
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Statement {
    private final BigDecimal value;
    private final LocalDateTime createdAt;
    private final User user;

    public Statement(BigDecimal value, LocalDateTime createdAt, User user) {
        this.value = value;
        this.createdAt = createdAt;
        this.user = user;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "value =" + value +
                ", createdAt =" + createdAt +
                ", user =" + user +
                '}';
    }
}

