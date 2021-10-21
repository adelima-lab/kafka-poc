package com.poc.kafkapoc.api.controller;

import com.poc.kafkapoc.api.dto.input.PersonInputDTO;
import com.poc.kafkapoc.api.dto.output.PersonOutputDTO;
import com.poc.kafkapoc.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public PersonOutputDTO create(@RequestBody PersonInputDTO personInputDTO)
    {
        return personService.create(personInputDTO);
    }
}
