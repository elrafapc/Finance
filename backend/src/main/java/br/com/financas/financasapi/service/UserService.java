package br.com.financas.financasapi.service;

import br.com.financas.financasapi.dto.UserDTO;
import br.com.financas.financasapi.entities.User;
import br.com.financas.financasapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<UserDTO> findAll(){
        List<User> result = userRepository.findAll();
        return result.stream().map(item -> new UserDTO(item)).collect(Collectors.toList());
    }

    public User selectById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Error: Register was not found!"));
    }

    @PostMapping
    public User insert(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable  Long id) {
        User user = selectById(id);
        userRepository.delete(user);
    }
}
