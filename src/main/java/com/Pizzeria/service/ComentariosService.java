/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Productos;
import com.Pizzeria.entity.comentarios;
import com.Pizzeria.repository.ComentariosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentariosService implements iComentarios{
   @Autowired
   private ComentariosRepository comentarioRepository;

   
   
   
    @Override
    public List<comentarios> getAllComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public void saveComentario(comentarios Comentario) {
        comentarioRepository.save(Comentario);  
    }
   
   
  
    
}
