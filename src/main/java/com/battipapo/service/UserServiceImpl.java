package com.battipapo.service;

import com.battipapo.model.User;
import com.battipapo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(Long id) {
        User use = userRepository.findById(id).get();
        return use != null ? use : new User();
    }

    @Override
    public User findByNome(String nome) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByNomeAndSobrenome(String nome, String sobrenome) {
        return null;
    }

    @Override
    public User save(User user) {
        try {
            userRepository.save(user);
        } catch (Exception e) {
            throw e;
        }
        return user;
    }
}
