package br.com.financas.financasapi.service;

import br.com.financas.financasapi.dto.TransactionDTO;
import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<TransactionDTO> findAll(){
        List<Transaction> result = transactionRepository.findAll();
        return result.stream().map(item -> new TransactionDTO(item)).collect(Collectors.toList());
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
