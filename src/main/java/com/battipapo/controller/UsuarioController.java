package com.battipapo.controller;

import com.battipapo.model.Usuario;
import com.battipapo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

@Autowired
    UsuarioService usuarioService;

@GetMapping("/usuario/list")
    public String findAll(Model model){
    model.addAttribute("sa-battipapo", usuarioService.findAll());
    return "usuario/add";
}

@GetMapping("/usuario/add")
    public String add(Model model){
    model.addAttribute("usuario", new Usuario());
    return "/usuario/add";
}

@PostMapping("/usuario/save")
    public String save(Usuario usuario, Model model){
    try {
        usuarioService.save(usuario);
        model.addAttribute("usuario", usuario);
        model.addAttribute("isSaved", true);
        return "usuario/add";
    } catch (Exception e) {
        model.addAttribute("usuario", usuario);
        model.addAttribute("isError", true);
        model.addAttribute("error", e.getMessage());
        return "usuario/add";
    }
}
}
