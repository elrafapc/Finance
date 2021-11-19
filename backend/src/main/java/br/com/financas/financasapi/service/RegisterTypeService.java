package br.com.financas.financasapi.service;

import br.com.financas.financasapi.dto.RegisterTypeDTO;
import br.com.financas.financasapi.entities.RegisterType;
import br.com.financas.financasapi.repository.RegisterTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegisterTypeService {
    private final RegisterTypeRepository registerTypeRepository;

    @Autowired
    public RegisterTypeService(RegisterTypeRepository registerTypeRepository) {
        this.registerTypeRepository = registerTypeRepository;
    }

    @GetMapping()
    public List<RegisterTypeDTO> findAll(){
        List<RegisterType> result = registerTypeRepository.findAll();
        return result.stream().map(item -> new RegisterTypeDTO(item)).collect(Collectors.toList());
    }

    public RegisterType selectById(Long id) {
        return registerTypeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Error: Register was not found!"));
    }

    @PostMapping
    public RegisterType insert(RegisterType registerType) {
        return registerTypeRepository.save(registerType);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        RegisterType registerType = selectById(id);
        registerTypeRepository.delete(registerType);
    }
}
