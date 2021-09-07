package br.com.financas.financasapi.resource;

import br.com.financas.financasapi.model.centroCusto.CostCenter;
import br.com.financas.financasapi.model.centroCusto.CostCenterFilter;
import br.com.financas.financasapi.service.CostCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("cost-center")
public class CostCenterResource {

    private final CostCenterService costCenterService;

    @Autowired
    public CostCenterResource(CostCenterService costCenterService) {
        this.costCenterService = costCenterService;
    }

    @GetMapping
    public List<CostCenter> select(CostCenterFilter costCenterFilter) {
        return costCenterService.select(costCenterFilter);
    }

    @GetMapping("{id}")
    public CostCenter selectById(@PathVariable Long id) {
        return costCenterService.selectById(id);
    }

    @PostMapping
    public CostCenter insert(@Valid @RequestBody CostCenter costCenter) {
        return costCenterService.insert(costCenter);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        costCenterService.delete(id);
    }

}
