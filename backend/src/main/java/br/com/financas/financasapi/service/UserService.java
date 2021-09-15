package br.com.financas.financasapi.service;

import br.com.financas.financasapi.dto.UserDTO;
import br.com.financas.financasapi.entities.User;
import br.com.financas.financasapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> findAll(){
        List<User> result = userRepository.findAll();
        return result.stream().map(item -> new UserDTO(item)).collect(Collectors.toList());
    }
}
