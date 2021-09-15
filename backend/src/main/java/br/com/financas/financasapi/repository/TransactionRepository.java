package br.com.financas.financasapi.repository;

import br.com.financas.financasapi.dto.TransactionSumDTO;
import br.com.financas.financasapi.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    public List<Transaction> findAllByIdContaining(int id);

    @Query("SELECT new br.com.financas.financasapi.dto.TransactionSumDTO(obj.registerType, SUM(obj.value)) " +
            "FROM Transaction AS obj " +
            "GROUP BY obj.registerType")
    List<TransactionSumDTO> amountGroupedByType();
}
