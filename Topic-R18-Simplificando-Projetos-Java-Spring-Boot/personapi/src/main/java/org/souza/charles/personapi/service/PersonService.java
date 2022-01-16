package org.souza.charles.personapi.service;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Renan Marques
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import org.springframework.stereotype.Service;
import org.souza.charles.personapi.dto.request.PersonDTO;
import org.souza.charles.personapi.dto.response.MessageResponseDTO;
import org.souza.charles.personapi.entity.Person;
import org.souza.charles.personapi.exception.PersonNotFoundException;
import org.souza.charles.personapi.mapper.PersonMapper;
import org.souza.charles.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);

        return createMessageResponseDTO(savedPerson.getId(), "Created Person with ID ");
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);

        return personMapper.toDTO(person);
    }

    public void delete(Long id) throws PersonNotFoundException{
        verifyIfExists(id);

        personRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyIfExists(id);

        Person personToUpdate = personMapper.toModel(personDTO);
        Person updatedPerson = personRepository.save(personToUpdate);

        return createMessageResponseDTO(updatedPerson.getId(), "Updated Person with ID ");
    }

    private MessageResponseDTO createMessageResponseDTO(Long id, String msg) {
        return MessageResponseDTO
                .builder()
                .message(msg + id)
                .build();
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

}
