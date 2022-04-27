/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.service;

import com.Pizzeria.entity.Productos;
import com.Pizzeria.repository.ProductosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService implements IProductosService{

    @Autowired
    private ProductosRepository productosRepository;
    
    @Override
    public List<Productos> getAllProductos() {
        return (List<Productos>) productosRepository.findAll();
    }

    @Override
    public void saveProducto(Productos producto) {
        productosRepository.save(producto);
    }

    @Override
    public Productos getProductoById(long id) {
        Productos producto;
        Optional<Productos> productoEncontrado = productosRepository.findById(id);
        if (productoEncontrado.isPresent()){
            producto  = new Productos(productoEncontrado.get());
            return producto;
        }
        return null;
    }

    @Override
    public void deleteProducto(long id) {
        productosRepository.deleteById(id);
    }
    
}
