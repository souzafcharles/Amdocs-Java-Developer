package org.souza.charles.personapi.entities;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.souza.charles.personapi.enums.EmailType;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmailType type;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Email> emailAddress = new ArrayList<>();
}
