package com.battipapo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "username")
    @Size(max = 24)
    @NotNull
    private String username;

    @Column(name = "nome")
    @Size(max = 40)
    @NotNull
    private String nome;

    @Column(name = "sobrenome")
    @Size(max = 40)
    @NotNull
    private String sobrenome;

    @Column(name = "data_nasc")
    @NotNull
    private Date data_nasc;

    @Column(name = "email")
    @NotNull
    @Size(max = 40)
    private String email;

    @Column(name = "senha")
    @NotNull
    @Size(max = 24)
    private String senha;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", data_nasc=" + data_nasc +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
