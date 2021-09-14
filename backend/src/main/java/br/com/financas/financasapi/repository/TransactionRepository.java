package br.com.financas.financasapi.repository;

import br.com.financas.financasapi.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    public List<Transaction> findAllByIdContaining(int id);
}
