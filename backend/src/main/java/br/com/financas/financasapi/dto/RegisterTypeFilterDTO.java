package br.com.financas.financasapi.dto;

import br.com.financas.financasapi.entities.registerType.RegisterTypeFilter;

public class RegisterTypeFilterDTO {
    private String description;

    public RegisterTypeFilterDTO(){}

    public RegisterTypeFilterDTO(String description) {
        this.description = description;
    }

    public RegisterTypeFilterDTO(RegisterTypeFilter register) {
        this.description = register.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
