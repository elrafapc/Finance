package br.com.financas.financasapi.dto;

import br.com.financas.financasapi.entities.User;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private Long id;
    private String login;
    private String password;

    public UserDTO(){}

    public UserDTO(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public UserDTO(User user) {
        id = user.getId();
        login = user.getLogin();
        password = user.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
