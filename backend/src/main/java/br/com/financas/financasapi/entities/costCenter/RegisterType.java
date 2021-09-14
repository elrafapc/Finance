package br.com.financas.financasapi.entities.costCenter;

import br.com.financas.financasapi.entities.Transaction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "register_type")
public class RegisterType {
    private Long id;
    private String description;

    public RegisterType(){}

    public RegisterType(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
