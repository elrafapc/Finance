package br.com.financas.financasapi.repository;

import br.com.financas.financasapi.model.centroCusto.CostCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostCenterRepository extends JpaRepository<CostCenter, Long> {
    public List<CostCenter> findAllByDescriptionContaining(String description);
}
