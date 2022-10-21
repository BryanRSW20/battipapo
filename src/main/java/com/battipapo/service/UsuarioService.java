package com.battipapo.service;


import com.battipapo.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario save(Usuario usuario);

    void deleteById(Long id);
}
