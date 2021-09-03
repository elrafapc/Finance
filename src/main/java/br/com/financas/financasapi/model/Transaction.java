package br.com.financas.financasapi.model;

import br.com.financas.financasapi.model.centroCusto.CostCenter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Transaction {
    private Long id;
    private LocalDate data;
    private Type type;
    private CostCenter costCenter;
    private String descricao;
    private Double valor;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Enumerated(EnumType.STRING)
    public Type getTipo() {
        return type;
    }

    public void setTipo(Type type) {
        this.type = type;
    }

    @ManyToOne
    public CostCenter getCentroCusto() {
        return costCenter;
    }

    public void setCentroCusto(CostCenter costCenter) {
        this.costCenter = costCenter;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
