package br.com.financas.financasapi.dto;

import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.entities.costCenter.RegisterType;

import java.time.LocalDate;

public class TransactionDTO {
    private Long id;
    private String description;
    private Double value;
    private LocalDate date;

    private RegisterType registerType;

    public TransactionDTO(){}

    public TransactionDTO(Long id, String description, Double value, LocalDate date, RegisterType registerType) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.date = date;
        this.registerType = registerType;
    }

    public TransactionDTO(Transaction transaction) {
        this.id = transaction.getId();
        this.description = transaction.getDescription();
        this.value = transaction.getValue();
        this.date = transaction.getDate();
        this.registerType = transaction.getRegisterType();
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public RegisterType getRegisterType() {
        return registerType;
    }

    public void setRegisterType(RegisterType registerType) {
        this.registerType = registerType;
    }
}
