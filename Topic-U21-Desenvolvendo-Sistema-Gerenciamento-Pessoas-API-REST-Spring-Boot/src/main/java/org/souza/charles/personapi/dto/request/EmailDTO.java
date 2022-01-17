package org.souza.charles.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.souza.charles.personapi.enums.EmailType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private EmailType type;

    @NotEmpty
    @Size(min = 5, max = 100)
    private String email;

    @Valid
    @NotEmpty
    private List<EmailDTO> emailAddress;

}

