/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Usuario;
import com.Pizzeria.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jorge
 */
@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuario() {
        return (List<Usuario>)usuarioRepository.findAll();
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario getUsuarioById(long id) {
        Usuario usuario;
        Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(id);
        if (usuarioEncontrado.isPresent()){
            usuario  = new Usuario(usuarioEncontrado.get());
            return usuario;
        }
        return null;
    }
    
    @Override
    public Usuario getUsuarioByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
    
    @Override
    public void deleteUsuario(long id) {
        usuarioRepository.deleteById(id);
    }
    
}
