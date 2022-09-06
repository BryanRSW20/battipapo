package com.battipapo.service;

import com.battipapo.model.User;

public interface UserService {
    public User findById(Long id);
    public User findByUsername(String username);
    public User findByNome(String nome);
    public User findByNomeAndSobrenome(String nome, String sobrenome);

//    public User save(User user);
}
