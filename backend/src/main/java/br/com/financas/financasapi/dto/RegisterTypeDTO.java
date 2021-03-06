package br.com.financas.financasapi.dto;

import br.com.financas.financasapi.entities.RegisterType;

import java.io.Serializable;

public class RegisterTypeDTO implements Serializable {

    private Long id;
    private String description;

    public RegisterTypeDTO(){}

    public RegisterTypeDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public RegisterTypeDTO(RegisterType register) {
        id = register.getId();
        description = register.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
