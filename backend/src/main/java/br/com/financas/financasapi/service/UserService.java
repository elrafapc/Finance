package br.com.financas.financasapi.service;

import br.com.financas.financasapi.entities.User;
import br.com.financas.financasapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User selectById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Error: Register was not found!"));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        User user = selectById(id);
        userRepository.delete(user);
    }
}
