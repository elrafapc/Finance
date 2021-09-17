package br.com.financas.financasapi.dto;

import java.time.LocalDate;

public class TransactionSpendByMonthDTO {
    private LocalDate date;
    private Double total;

    public TransactionSpendByMonthDTO(){}

    public TransactionSpendByMonthDTO(LocalDate date, Double total) {
        this.date = date;
        this.total = total;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
