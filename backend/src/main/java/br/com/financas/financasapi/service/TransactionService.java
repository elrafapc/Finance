package br.com.financas.financasapi.service;

import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction selectById(Long id) {
        return transactionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Error: Register was not found!"));
    }

    public Transaction insert(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public void delete(Long id) {
        Transaction transaction = selectById(id);
        transactionRepository.delete(transaction);
    }
}
