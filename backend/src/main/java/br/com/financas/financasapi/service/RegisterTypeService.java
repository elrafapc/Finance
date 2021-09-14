package br.com.financas.financasapi.service;

import br.com.financas.financasapi.entities.costCenter.RegisterType;
import br.com.financas.financasapi.entities.costCenter.RegisterTypeFilter;
import br.com.financas.financasapi.repository.RegisterTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class RegisterTypeService {
    private final RegisterTypeRepository registerTypeRepository;

    @Autowired
    public RegisterTypeService(RegisterTypeRepository registerTypeRepository) {
        this.registerTypeRepository = registerTypeRepository;
    }

    public List<RegisterType> select(RegisterTypeFilter registerTypeFilter) {
        if (registerTypeFilter.getDescription() != null && !registerTypeFilter.getDescription().equals("")) {
            return registerTypeRepository.findAllByDescriptionContaining(registerTypeFilter.getDescription());
        }

        return registerTypeRepository.findAll();
    }

    public RegisterType selectById(Long id) {
        return registerTypeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Error: Register was not found!"));
    }

    public RegisterType insert(RegisterType registerType) {
        return registerTypeRepository.save(registerType);
    }

    public void delete(Long id) {
        RegisterType registerType = selectById(id);
        registerTypeRepository.delete(registerType);
    }
}
