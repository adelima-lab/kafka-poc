package com.poc.kafkapoc.domain.service.impl;

import com.poc.kafkapoc.api.dto.input.PersonInputDTO;
import com.poc.kafkapoc.api.dto.output.PersonOutputDTO;
import com.poc.kafkapoc.domain.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public PersonOutputDTO create(PersonInputDTO personInputDTO) {

        return PersonOutputDTO.builder().id(UUID.randomUUID().toString()).build();
    }
}
