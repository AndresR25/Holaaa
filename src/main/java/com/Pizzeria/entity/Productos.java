/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jorge
 */
@Entity
@Table (name="productos")
public class Productos implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String ingredientes;
    
    @ManyToOne
    @JoinColumn(name="id_estilos")
    private Estilos estilo;
   
    
    

    public Productos() {
    }

    public Productos(Productos producto) {
        this.id = producto.getId();
        this.nombre = producto.getNombre();
        this.ingredientes = producto.getIngredientes();
        this.estilo = new Estilos(producto.estilo);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Estilos getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilos estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", nombre=" + nombre + ", ingredientes=" + ingredientes + ", estilo=" + estilo + '}';
    }
    
}
