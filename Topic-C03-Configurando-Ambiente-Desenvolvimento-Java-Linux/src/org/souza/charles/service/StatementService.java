package org.souza.charles.service;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Daniel Hatanaka
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 4, 2022
 */
import org.souza.charles.entity.Statement;
import org.souza.charles.entity.User;
import java.util.List;

public interface StatementService {
    List<Statement> findAllByUser(final User user);
    default User findUser(final Statement statement){
        return statement.getUser();
    }
}

