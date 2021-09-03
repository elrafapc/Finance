package br.com.financas.financasapi.service;

import br.com.financas.financasapi.model.centroCusto.CostCenter;
import br.com.financas.financasapi.model.centroCusto.CostCenterFilter;
import br.com.financas.financasapi.repository.CostCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CostCenterService {
    private final CostCenterRepository costCenterRepository;

    @Autowired
    public CostCenterService(CostCenterRepository costCenterRepository) {
        this.costCenterRepository = costCenterRepository;
    }

    public List<CostCenter> select(CostCenterFilter costCenterFilter) {
        if (costCenterFilter.getDescription() != null && !costCenterFilter.getDescription().equals("")) {
            return costCenterRepository.findAllByDescriptionContaining(costCenterFilter.getDescription());
        }

        return costCenterRepository.findAll();
    }

    public CostCenter selectById(Long id) {
        return costCenterRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Error: Register was not found!"));
    }

    public CostCenter insert(CostCenter costCenter) {
        return costCenterRepository.save(costCenter);
    }

    public void delete(Long id) {
        CostCenter costCenter = selectById(id);
        costCenterRepository.delete(costCenter);
    }
}
