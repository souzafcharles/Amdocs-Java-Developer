package org.souza.charles.personapi.controllers;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Peleias
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 16, 2022
 */
import lombok.AllArgsConstructor;
import org.souza.charles.personapi.dto.request.EmailDTO;
import org.souza.charles.personapi.dto.response.MessageResponseDTO;
import org.souza.charles.personapi.exception.EmailNotFoundException;
import org.souza.charles.personapi.exception.PersonNotFoundException;
import org.souza.charles.personapi.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid EmailDTO emailDTO) {
        return emailService.create(emailDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmailDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return emailService.findById(id);
    }

    @GetMapping
    public List<EmailDTO> listAll() {
        return emailService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid EmailDTO emailDTO) throws EmailNotFoundException {
        return emailService.update(id, emailDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws EmailNotFoundException {
        emailService.delete(id);
    }
}
