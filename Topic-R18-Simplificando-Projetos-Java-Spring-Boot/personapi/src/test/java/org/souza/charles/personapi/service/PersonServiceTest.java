package org.souza.charles.personapi.service;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.souza.charles.personapi.dto.request.PersonDTO;
import org.souza.charles.personapi.dto.response.MessageResponseDTO;
import org.souza.charles.personapi.entity.Person;
import org.souza.charles.personapi.mapper.PersonMapper;
import org.souza.charles.personapi.repository.PersonRepository;
import org.souza.charles.personapi.service.PersonService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.souza.charles.personapi.utils.PersonUtils.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        when(personMapper.toModel(personDTO)).thenReturn(expectedSavedPerson);
        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);
//        when(personRepository.save(any(Person.class)))
//                .thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedMessage = createExpectedResponse(expectedSavedPerson.getId());
        MessageResponseDTO successMessage = personService.createPerson(personDTO);

        assertEquals(expectedMessage, successMessage);

    }

    private MessageResponseDTO createExpectedResponse(Long savedPersonId) {
        return MessageResponseDTO.builder()
                .message("Person successfully created with ID " + savedPersonId)
                .build();
    }
}
