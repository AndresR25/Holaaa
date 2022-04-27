/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Usuario;
import java.util.List;
/**
 *
 * @author jorge
 */
public interface IUsuarioService {
    public List<Usuario> getAllUsuario();
    public void saveUsuario(Usuario usuario);
    public Usuario getUsuarioById(long id);
    public Usuario getUsuarioByEmail(String email);
    public void deleteUsuario(long id); 
}
