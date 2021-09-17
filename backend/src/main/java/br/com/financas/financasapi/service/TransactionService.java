package br.com.financas.financasapi.service;

import br.com.financas.financasapi.dto.TransactionDTO;
import br.com.financas.financasapi.dto.TransactionSpendByMonthDTO;
import br.com.financas.financasapi.dto.TransactionSumDTO;
import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.repository.RegisterTypeRepository;
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

    @Autowired
    private RegisterTypeRepository registerTypeRepository;

    @Transactional(readOnly = true)
    public Page<TransactionDTO> findAll(Pageable pageable){
        registerTypeRepository.findAll();
        Page<Transaction> result = transactionRepository.findAll(pageable);
        return result.map(item -> new TransactionDTO(item));
    }

    @Transactional(readOnly = true)
    public List<TransactionSumDTO> amountGroupedByType(){
        return transactionRepository.amountGroupedByType();
    }

    public Transaction selectById(Long id) {
        return transactionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Error: Register was not found!"));
    }

    @Transactional(readOnly = true)
    public List<TransactionSpendByMonthDTO> totalSpendByMonth(){return transactionRepository.totalSpendByMonth();}

    public Transaction insert(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public void delete(Long id) {
        Transaction transaction = selectById(id);
        transactionRepository.delete(transaction);
    }
}
