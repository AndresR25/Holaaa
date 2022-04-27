/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Productos;
import java.util.List;

public interface IProductosService {
    public List<Productos> getAllProductos();
    public void saveProducto(Productos producto);
    public Productos getProductoById(long id);
    public void deleteProducto(long id);
}
