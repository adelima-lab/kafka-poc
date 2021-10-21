package com.poc.kafkapoc.api.dto.output;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PersonOutputDTO implements Serializable {

    private String id;
}
