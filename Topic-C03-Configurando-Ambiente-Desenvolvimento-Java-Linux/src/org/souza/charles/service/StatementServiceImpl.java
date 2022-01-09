package org.souza.charles.service;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Daniel Hatanaka
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 4, 2022
 */
import java.util.List;
import org.souza.charles.entity.Statement;
import org.souza.charles.entity.User;
import org.souza.charles.repository.StatementRepository;

public class StatementServiceImpl implements StatementService {
    private final StatementRepository statementRepository;
    public StatementServiceImpl(final User userA, final User userB){
        this.statementRepository = new StatementRepository(userA, userB);
    }
    public List<Statement> findAllByUser(final User user){
        return statementRepository.findAllByUser(user);
    }
}
