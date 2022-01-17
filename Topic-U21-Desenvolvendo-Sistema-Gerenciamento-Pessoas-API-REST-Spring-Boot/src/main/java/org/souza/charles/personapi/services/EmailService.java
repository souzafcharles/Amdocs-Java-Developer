package org.souza.charles.personapi.services;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */

import lombok.AllArgsConstructor;
import org.souza.charles.personapi.dto.mapper.EmailMapper;
import org.souza.charles.personapi.dto.request.EmailDTO;
import org.souza.charles.personapi.dto.response.MessageResponseDTO;
import org.souza.charles.personapi.entities.Email;
import org.souza.charles.personapi.exception.EmailNotFoundException;
import org.souza.charles.personapi.exception.PersonNotFoundException;
import org.souza.charles.personapi.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmailService {

    private final EmailRepository emailRepository;

    private final EmailMapper emailMapper;

    public MessageResponseDTO create(EmailDTO emailDTO) {
        Email emailAddress = emailMapper.toModel(emailDTO);
        Email savedEmail = emailRepository.save(emailAddress);

        MessageResponseDTO messageResponse = createMessageResponse("Email successfully created ", savedEmail.getId());

        return messageResponse;
    }

    public EmailDTO findById(Long id) throws PersonNotFoundException {
       Email emailAddress = emailRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));

        return emailMapper.toDTO(emailAddress);
    }

    public List<EmailDTO> listAll() {
        List<Email> emailAddress = emailRepository.findAll();
        return emailAddress.stream()
                .map(emailMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MessageResponseDTO update(Long id, EmailDTO emailDTO) throws EmailNotFoundException {
        emailRepository.findById(id)
                .orElseThrow(() -> new EmailNotFoundException(id));

        Email updatedEmail = emailMapper.toModel(emailDTO);
        Email savedEmail= emailRepository.save(updatedEmail);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully updated ", savedEmail.getId());

        return messageResponse;
    }

    public void delete(Long id) throws EmailNotFoundException {
        emailRepository.findById(id)
                .orElseThrow(() -> new EmailNotFoundException(id));

        emailRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
