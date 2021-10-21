package com.poc.kafkapoc.api.dto.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class AddressInputDTO implements Serializable {

    @JsonProperty("pais")
    private String country;
    @JsonProperty("estado")
    private String state;
    @JsonProperty("cidade")
    private String city;
    @JsonProperty("nome_da_rua")
    private String streetName;
    @JsonProperty("cep")
    private String zipCode;

}
