package com.battipapo.controller;

import com.battipapo.model.Usuario;
import com.battipapo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario/search")
    public String findAll(Model model) {
        model.addAttribute("sa-battipapo", usuarioService.findAll());
        return "usuario/search";
    }

//    @GetMapping("/usuario/login")
//    public String login(){
//    return "login";
//    }

    @GetMapping("/usuario/add")
    public String add(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "/usuario/add";
    }

    @GetMapping("/usuario/edit/{id}")
    public String edit(Model model, @PathVariable long id) {
        model.addAttribute("usuario", usuarioService.findById(id));
        return "usuario/edit";
    }

    @PostMapping("/usuario/save")
    public String save(Usuario usuario, Model model) {
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

    @GetMapping("/usuario/delete/{id}")
    public String delete(@PathVariable long id) {
        try {
            usuarioService.deleteById(id);
        } catch (Exception e) {
            System.out.println("Deu esse B.O. Aqui ó: " + e.getMessage());
        }
        return "redirect:/usuario/list";
    }
}







