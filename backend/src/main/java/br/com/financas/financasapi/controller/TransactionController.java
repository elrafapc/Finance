package br.com.financas.financasapi.controller;

import br.com.financas.financasapi.dto.TransactionDTO;
import br.com.financas.financasapi.entities.Transaction;
import br.com.financas.financasapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    //@GetMapping("{id}")
    //public Transaction selectById(@PathVariable Long id) {return transactionService.selectById(id);}

    @GetMapping()
    public ResponseEntity<List<TransactionDTO>> findAll(){
        List<TransactionDTO> list = transactionService.findAll();
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
