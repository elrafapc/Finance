package br.com.financas.financasapi.dto;

import br.com.financas.financasapi.entities.RegisterType;

import java.io.Serializable;

public class TransactionSumDTO implements Serializable {
    private String typeName;
    private Double sum;

    public TransactionSumDTO(){}

    public TransactionSumDTO(RegisterType type, Double sum) {
        this.typeName = type.getDescription();
        this.sum = sum;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
