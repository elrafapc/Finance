package br.com.financas.financasapi.controller;

import br.com.financas.financasapi.dto.RegisterTypeDTO;
import br.com.financas.financasapi.entities.costCenter.RegisterType;
import br.com.financas.financasapi.entities.costCenter.RegisterTypeFilter;
import br.com.financas.financasapi.service.RegisterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/register-type")
public class RegisterTypeController {

    private final RegisterTypeService registerTypeService;

    @Autowired
    public RegisterTypeController(RegisterTypeService registerTypeService) {
        this.registerTypeService = registerTypeService;
    }

    /*
    @GetMapping
    public List<RegisterType> select(RegisterTypeFilter registerTypeFilter) {
        return registerTypeService.select(registerTypeFilter);
    }
    */

    @GetMapping()
    public ResponseEntity<List<RegisterTypeDTO>> findAll(){
        List<RegisterTypeDTO> list = registerTypeService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("{id}")
    public RegisterType selectById(@PathVariable Long id) {
        return registerTypeService.selectById(id);
    }

    @PostMapping
    public RegisterType insert(@Valid @RequestBody RegisterType registerType) {
        return registerTypeService.insert(registerType);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        registerTypeService.delete(id);
    }
}
