package br.com.financas.financasapi.dto;

import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.entities.costCenter.RegisterType;

import java.time.LocalDate;

public class TransactionDTO {
    private Long id;
    private LocalDate dateRegister;
    private String description;
    private Double value;

    private RegisterType registerType;

    public TransactionDTO(){}

    public TransactionDTO(Long id, LocalDate dateRegister, String description, Double value, RegisterType registerType) {
        this.id = id;
        this.dateRegister = dateRegister;
        this.description = description;
        this.value = value;
        this.registerType = registerType;
    }

    public TransactionDTO(Transaction transaction) {
        this.id = transaction.getId();
        this.dateRegister = transaction.getDate();
        this.description = transaction.getDescription();
        this.value = transaction.getValue();
        this.registerType = transaction.getCostCenter();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public RegisterType getRegisterType() {
        return registerType;
    }

    public void setRegisterType(RegisterType registerType) {
        this.registerType = registerType;
    }
}
