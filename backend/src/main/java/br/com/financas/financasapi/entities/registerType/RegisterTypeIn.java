package br.com.financas.financasapi.entities.registerType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class RegisterTypeIn extends  RegisterType {
    private RegisterTypeInEnum typeInEnum;

    @Enumerated(EnumType.STRING)
    public RegisterTypeInEnum getTypeInEnum() {
        return typeInEnum;
    }

    public void setTypeInEnum(RegisterTypeInEnum typeInEnum) {
        this.typeInEnum = typeInEnum;
    }
}