/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jorge
 */
@Entity
@Table (name="estilos")
public class Estilos implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String medida;
    private long precio;

    public Estilos() {
    }

    public Estilos(Estilos estilo) {
        this.id = estilo.getId();
        this.medida = estilo.getMedida();
        this.precio = estilo.getPrecio();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Estilos{" + "id=" + id + ", medida=" + medida + ", precio=" + precio + '}';
    }
    
}
