package br.com.financas.financasapi.repository;

import br.com.financas.financasapi.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    public List<Transaction> findAllByIdContaining(int id);
}
