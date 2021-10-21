package com.poc.kafkapoc.api.dto.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class PersonInputDTO implements Serializable {

    @JsonProperty("primeiro_nome")
    private String firstName;
    @JsonProperty("sobrenome")
    private String lastName;

    @Schema(description = "Birth date format - yyyy-MM-dd", example = "2000-01-30")
    @JsonProperty("data_de_nascimento")
    private LocalDate birthDate;
    @JsonProperty("endereco")
    private AddressInputDTO address;
}
