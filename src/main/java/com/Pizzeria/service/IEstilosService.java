/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Estilos;
import java.util.List;

public interface IEstilosService {
    public List<Estilos> getAllEstilos();
    public void saveEstilo(Estilos estilo);
    public Estilos getEstiloById(long id);
    public void deleteEstilo(long id);
}
