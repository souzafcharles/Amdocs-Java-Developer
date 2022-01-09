package org.souza.charles.repository;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Daniel Hatanaka
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 4, 2022
 */
import org.souza.charles.entity.Statement;
import org.souza.charles.entity.User;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class StatementRepository {
    private final List<Statement> statements;
    public StatementRepository(final User userA, final User userB) {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        statements = List.of (new Statement(new BigDecimal("10.00"), LocalDateTime.parse("2021-08-16T00:00:00-03:00", dateTimeFormatter), userA),
                new Statement(new BigDecimal("30.00"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userA),
                new Statement(new BigDecimal("19.99"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userA),
                new Statement(new BigDecimal("10.00"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userA),
                new Statement(new BigDecimal("500.88"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userA),
                new Statement(new BigDecimal("200.00"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userB),
                new Statement(new BigDecimal("180.99"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userB),
                new Statement(new BigDecimal("3.58"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userB),
                new Statement(new BigDecimal("4.00"), LocalDateTime.parse("2022-01-04T00:00:00-03:00", dateTimeFormatter), userB));

    }
    //Exemplos de utilização de API Stream (Programação Funcional)
    public List<Statement> findAllByUser(final User user) {
        return statements.stream()
                .filter(statement -> statement.getUser().getCode().equals(user.getCode()))
                .collect(Collectors.toList());
    }
}
