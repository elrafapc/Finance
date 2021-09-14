package br.com.financas.financasapi.controller;

import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("transaction")
public class TransactionResource {

    private final TransactionService transactionService;

    @Autowired
    public TransactionResource(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("{id}")
    public Transaction selectById(@PathVariable Long id) {
        return transactionService.selectById(id);
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
