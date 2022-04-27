/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Estilos;
import com.Pizzeria.entity.comentarios;
import java.util.List;

/**
 *
 * @author kflex25
 */
public interface iComentarios {
    public List<comentarios> getAllComentarios();
    public void saveComentario(comentarios Comentario);
}
