package com.poc.kafkapoc.domain.service;

import com.poc.kafkapoc.api.dto.input.PersonInputDTO;
import com.poc.kafkapoc.api.dto.output.PersonOutputDTO;

public interface PersonService {

    PersonOutputDTO create(PersonInputDTO personInputDTO);
}
