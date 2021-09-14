package br.com.financas.financasapi.resource;

import br.com.financas.financasapi.model.costCenter.RegisterType;
import br.com.financas.financasapi.model.costCenter.RegisterTypeFilter;
import br.com.financas.financasapi.service.RegisterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("register-type")
public class RegisterTypeResource {

    private final RegisterTypeService registerTypeService;

    @Autowired
    public RegisterTypeResource(RegisterTypeService registerTypeService) {
        this.registerTypeService = registerTypeService;
    }

    @GetMapping
    public List<RegisterType> select(RegisterTypeFilter registerTypeFilter) {
        return registerTypeService.select(registerTypeFilter);
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
