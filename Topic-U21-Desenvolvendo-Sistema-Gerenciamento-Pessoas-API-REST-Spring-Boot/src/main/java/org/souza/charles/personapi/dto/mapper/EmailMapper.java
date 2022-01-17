package org.souza.charles.personapi.dto.mapper;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
import org.souza.charles.personapi.dto.request.EmailDTO;
import org.souza.charles.personapi.entities.Email;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmailMapper {
    Email toModel(EmailDTO dto);
    EmailDTO toDTO(Email dto);
}
