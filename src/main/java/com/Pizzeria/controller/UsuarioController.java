/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.controller;

import com.Pizzeria.entity.Permisos;
import com.Pizzeria.entity.Roles;
import com.Pizzeria.entity.Usuario;
import com.Pizzeria.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jorge
 */
@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/usuarios")
    public String index(Model model){
        List<Usuario> listaUsuarios = usuarioService.getAllUsuario();
        model.addAttribute("titulo", "Usuarios");
        model.addAttribute("usuarios", listaUsuarios);
        return "Usuarios";
    }
    
    @GetMapping("/nuevousuario")
    public String crearUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "Registration";
    }
    
    @PostMapping("/guardarusuario")
    public String guardarusuario(@ModelAttribute Usuario usuario){
        Roles rolCliente = new Roles(1, "CLIENTE");
        Permisos permisoCliente = new Permisos(1, "CLIENTE");
        usuario.setActivo(1);
        usuario.setPermisos(permisoCliente);
        usuario.setRoles(rolCliente);
        usuarioService.saveUsuario(usuario);
        return "redirect:/usuarios";
    }
    
    @GetMapping("/login")
    public String ingresar(Model model, String error, String logout){
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");
        return "Login";
    }
    
    @GetMapping("/editarusuario/{id}")
    public String editarUsuario(@PathVariable("id") Long idUsuario, Model model){
        Usuario usuario = usuarioService.getUsuarioById(idUsuario);
        model.addAttribute("usuario", usuario);
        return "Registration";
    }
    
    @GetMapping("/borrarusuario/{id}")
    public String eliminarUsuario(@PathVariable("id") Long idUsuario){
        usuarioService.deleteUsuario(idUsuario);
        return "redirect:/usuarios";
    }
}
