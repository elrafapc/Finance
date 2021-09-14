package br.com.financas.financasapi.service;

import br.com.financas.financasapi.model.Transaction;
import br.com.financas.financasapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

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
