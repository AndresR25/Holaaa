/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pizzeria.repository;

import com.Pizzeria.entity.Productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jorge
 */
@Repository
public interface ProductosRepository extends CrudRepository<Productos,Long>{
}
