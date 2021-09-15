package br.com.financas.financasapi.dto;

import br.com.financas.financasapi.entities.Transaction;

import java.time.LocalDate;

public class TransactionDTO {
    private Long id;
    private String description;
    private Double value;
    private LocalDate date;

    private RegisterTypeDTO registerType;

    public TransactionDTO(){}

    public TransactionDTO(Long id, String description, Double value, LocalDate date, RegisterTypeDTO registerType) {
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
        this.registerType = new RegisterTypeDTO(transaction.getRegisterType());
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

    public RegisterTypeDTO getRegisterType() {
        return registerType;
    }

    public void setRegisterType(RegisterTypeDTO registerType) {
        this.registerType = registerType;
    }
}
