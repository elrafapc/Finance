package br.com.financas.financasapi.controller;

import br.com.financas.financasapi.dto.TransactionDTO;
import br.com.financas.financasapi.dto.TransactionSpendByMonthDTO;
import br.com.financas.financasapi.dto.TransactionSumDTO;
import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping()
    public ResponseEntity<Page<TransactionDTO>> findAll(Pageable pageable){
        Page<TransactionDTO> list = transactionService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    //@GetMapping("{id}")
    //public Transaction selectById(@PathVariable Long id) {return transactionService.selectById(id);}

    @GetMapping(value = "/sum_by_type")
    public ResponseEntity<List<TransactionSumDTO>> amountGroupedByType(){
        List<TransactionSumDTO> list = transactionService.amountGroupedByType();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/total_Spend")
    public ResponseEntity<List<TransactionSpendByMonthDTO>> totalSpendByMonth(){
        List<TransactionSpendByMonthDTO> list = transactionService.totalSpendByMonth();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public Transaction insert(@Valid @RequestBody Transaction transaction) {
        return transactionService.insert(transaction);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        transactionService.delete(id);
    }
}
