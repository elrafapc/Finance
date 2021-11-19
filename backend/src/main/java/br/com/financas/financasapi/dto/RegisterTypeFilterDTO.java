package br.com.financas.financasapi.dto;

import java.io.Serializable;

public class RegisterTypeFilterDTO implements Serializable {
    private String description;

    public RegisterTypeFilterDTO(){}

    public RegisterTypeFilterDTO(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
