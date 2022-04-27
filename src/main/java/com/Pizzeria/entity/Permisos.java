/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
@Table (name="permisos")
public class Permisos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String permiso;
    
    public Permisos(){
    }

    public Permisos(long id, String permiso) {
        this.id = id;
        this.permiso = permiso;
    }
    
    public Permisos(Permisos permisos){
        this.id = permisos.getId();
        this.permiso = permisos.getPermiso();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
    
    public List<String> getPermissionList() {
        if (this.permiso.length() > 0) {
            return Arrays.asList(this.permiso.split(","));
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Permisos{" + "id=" + id + ", permiso=" + permiso + '}';
    }
    
}
