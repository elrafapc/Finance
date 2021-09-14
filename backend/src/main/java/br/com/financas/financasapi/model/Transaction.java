package br.com.financas.financasapi.model;

import br.com.financas.financasapi.model.costCenter.RegisterType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Transaction {
    private Long id;
    private LocalDate dateRegister;
    private RegisterType registerType;
    private String description;
    private Double value;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return dateRegister;
    }

    public void setDate(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    @ManyToOne
    public RegisterType getCostCenter() {
        return registerType;
    }

    public void setCostCenter(RegisterType registerType) {
        this.registerType = registerType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descricao) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double valor) {
        this.value = value;
    }

}
