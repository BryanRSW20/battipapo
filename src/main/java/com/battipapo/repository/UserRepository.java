package com.battipapo.repository;

import com.battipapo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Long, Repository> {

    public User findById(long id);
    public User findByNome(String nome);
    public User findByNomeAndSobrenome(String nome, String sobrenome);
    public User findByUsername(String username);
}
