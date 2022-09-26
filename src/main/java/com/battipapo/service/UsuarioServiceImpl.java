package com.battipapo.service;


import com.battipapo.model.Usuario;
import com.battipapo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements  UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List <Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id){
        Usuario usu = usuarioRepository.findById(id).get();
        return usu != null ? usu : new Usuario();
    }

    @Override
    public Usuario save(Usuario usuario){
        try{
            return usuarioRepository.save(usuario);
        } catch (Exception e){
            throw e;
        }
    }


}

