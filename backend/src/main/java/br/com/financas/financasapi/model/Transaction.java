package br.com.financas.financasapi.model;

import br.com.financas.financasapi.model.centroCusto.CostCenter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Transaction {
    private Long id;
    private LocalDate dateRegister;
    private Type type;
    private CostCenter costCenter;
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

    @Enumerated(EnumType.STRING)
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @ManyToOne
    public CostCenter getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(CostCenter costCenter) {
        this.costCenter = costCenter;
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
