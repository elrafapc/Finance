package br.com.financas.financasapi.repository;

import br.com.financas.financasapi.model.costCenter.RegisterType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterTypeRepository extends JpaRepository<RegisterType, Long> {
    public List<RegisterType> findAllByDescriptionContaining(String description);
}
