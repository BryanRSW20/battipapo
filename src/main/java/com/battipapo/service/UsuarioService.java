package com.battipapo.service;


import com.battipapo.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findAll();

    Usuario findById(Long id);

    public Usuario save(Usuario usuario);
}
